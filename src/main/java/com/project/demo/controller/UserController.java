package com.project.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.project.demo.dao.AccessTokenMapper;
import com.project.demo.entity.AccessToken;
import com.project.demo.entity.User;
import com.project.demo.entity.UserGroup;
import com.project.demo.service.AccessTokenService;
import com.project.demo.service.UserGroupService;
import com.project.demo.service.UserService;
import com.project.demo.controller.base.BaseController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * 用户账户：用于保存用户登录信息(User)表控制层
 *
 */
@Slf4j
@RestController
@RequestMapping("user")
public class UserController extends BaseController<User, UserService> {
    /**
     * 服务对象
     */
    @Autowired
    public UserController(UserService service) {
        setService(service);
    }

    /**
     * Token服务
     */
    @Autowired
    private AccessTokenService tokenService;

    @Autowired
    private UserGroupService userGroupService;

    @Autowired
    private AccessTokenMapper accessTokenMapper;

    /**
     * 注册
     * @return
     */
    @PostMapping("register")
    public Map<String, Object> signUp(HttpServletRequest request) throws IOException {
        // 查询用户
        Map<String, String> query = new HashMap<>();
        Map<String,Object> map = service.readBody(request.getReader());
        query.put("username",String.valueOf(map.get("username")));
        List list = service.selectBaseList(service.select(query, new HashMap<>()));
        if (list.size()>0){
            return error(30000, "用户已存在");
        }
        map.put("password",service.encryption(String.valueOf(map.get("password"))));
        service.insert(map);
        return success(1);
    }

    /**
     * 找回密码
     * @param form
     * @return
     */
    @PostMapping("forget_password")
    public Map<String, Object> forgetPassword(@RequestBody User form, HttpServletRequest request) {
        JSONObject ret = new JSONObject();
        String username = form.getUsername();
        String code = form.getCode();
        String password = form.getPassword();
        // 判断条件
        if(code == null || code.length() == 0){
            return error(30000, "验证码不能为空");
        }
        if(username == null || username.length() == 0){
            return error(30000, "用户名不能为空");
        }
        if(password == null || password.length() == 0){
            return error(30000, "密码不能为空");
        }

        // 查询用户
        Map<String, String> query = new HashMap<>();
        query.put("username",username);
        List list = service.selectBaseList(service.select(query, service.readConfig(request)));
        if (list.size() > 0) {
            User o = (User) list.get(0);
            JSONObject query2 = new JSONObject();
            JSONObject form2 = new JSONObject();
            // 修改用户密码
            query2.put("user_id",o.getUserId());
            form2.put("password",service.encryption(password));
            service.update(query, service.readConfig(request), form2);
            return success(1);
        }
        return error(70000,"用户不存在");
    }

    /**
     * 登录
     * @param data
     * @param httpServletRequest
     * @return
     */
    @PostMapping("login")
    public Map<String, Object> login(@RequestBody Map<String, String> data, HttpServletRequest httpServletRequest) {
        log.info("[执行登录接口]");

        String username = data.get("username");
        String email = data.get("email");
        String phone = data.get("phone");
        String password = data.get("password");

        List resultList = null;
        QueryWrapper wrapper = new QueryWrapper<User>();
        Map<String, String> map = new HashMap<>();
        if(username != null && "".equals(username) == false){
            map.put("username", username);
            resultList = service.selectBaseList(service.select(map, new HashMap<>()));
        }
        else if(email != null && "".equals(email) == false){
            map.put("email", email);
            resultList = service.selectBaseList(service.select(map, new HashMap<>()));
        }
        else if(phone != null && "".equals(phone) == false){
            map.put("phone", phone);
            resultList = service.selectBaseList(service.select(map, new HashMap<>()));
        }else{
            return error(30000, "账号或密码不能为空");
        }
        if (resultList == null || password == null) {
            return error(30000, "账号或密码不能为空");
        }
        //判断是否有这个用户
        if (resultList.size()<=0){
            return error(30000,"用户不存在");
        }

        User byUsername = (User) resultList.get(0);


        Map<String, String> groupMap = new HashMap<>();
        groupMap.put("name",byUsername.getUserGroup());
        List groupList = userGroupService.selectBaseList(userGroupService.select(groupMap, new HashMap<>()));
        if (groupList.size()<1){
            return error(30000,"用户组不存在");
        }

        UserGroup userGroup = (UserGroup) groupList.get(0);

        //查询用户审核状态
        if (!StringUtils.isEmpty(userGroup.getSourceTable())){
            String res = service.selectExamineState(userGroup.getSourceTable(),byUsername.getUserId());
            if (res==null){
                return error(30000,"用户不存在");
            }
            if (!res.equals("已通过")){
                return error(30000,"该用户审核未通过");
            }
        }

        //查询用户状态
        if (byUsername.getState()!=1){
            return error(30000,"用户非可用状态，不能登录");
        }

        String md5password = service.encryption(password);
        if (byUsername.getPassword().equals(md5password)) {
            // 存储Token到数据库
            AccessToken accessToken = new AccessToken();
            accessToken.setToken(UUID.randomUUID().toString().replaceAll("-", ""));
            accessToken.setUser_id(byUsername.getUserId());
            tokenService.save(accessToken);

            // 返回用户信息
            JSONObject user = JSONObject.parseObject(JSONObject.toJSONString(byUsername));
            user.put("token", accessToken.getToken());
            JSONObject ret = new JSONObject();
            ret.put("obj",user);
            return success(ret);
        } else {
            return error(30000, "账号或密码不正确");
        }
    }

    /**
     * 修改密码
     * @param data
     * @param request
     * @return
     */
    @PostMapping("change_password")
    public Map<String, Object> change_password(@RequestBody Map<String, String> data, HttpServletRequest request){
        // 根据Token获取UserId
        String token = request.getHeader("x-auth-token");
        Integer userId = tokenGetUserId(token);
        // 根据UserId和旧密码获取用户
        Map<String, String> query = new HashMap<>();
        String o_password = data.get("o_password");
        query.put("user_id" ,String.valueOf(userId));
        query.put("password" ,service.encryption(o_password));
        int count = service.selectBaseCount(service.count(query, service.readConfig(request)));
        if(count > 0){
            // 修改密码
            Map<String,Object> form = new HashMap<>();
            form.put("password",service.encryption(data.get("password")));
            service.update(query,service.readConfig(request),form);
            return success(1);
        }
        return error(10000,"密码修改失败！");
    }

    /**
     * 登录态
     * @param request
     * @return
     */
    @GetMapping("state")
    public Map<String, Object> state(HttpServletRequest request) {
        JSONObject ret = new JSONObject();
        // 获取状态
        String token = request.getHeader("x-auth-token");

        // 根据登录态获取用户ID
        Integer userId = tokenGetUserId(token);

        log.info("[返回userId] {}",userId);
        if(userId == null || userId == 0){
            return error(10000,"用户未登录!");
        }

        // 根据用户ID获取用户
        Map<String,String> query = new HashMap<>();
        query.put("user_id" ,String.valueOf(userId));

        // 根据用户ID获取
        List resultList = service.selectBaseList(service.select(query,service.readConfig(request)));
        if (resultList.size() > 0) {
            JSONObject user = JSONObject.parseObject(JSONObject.toJSONString(resultList.get(0)));
            user.put("token",token);
            ret.put("obj",user);
            return success(ret);
        } else {
            return error(10000,"用户未登录!");
        }
    }

    /**
     * 登录态
     * @param request
     * @return
     */
    @GetMapping("quit")
    public Map<String, Object> quit(HttpServletRequest request) {
        String token = request.getHeader("x-auth-token");
        Map<String, String> query = new HashMap<>(16);
        query.put("token", token);
        try{
            tokenService.delete(query,service.readConfig(request));
        }catch (Exception e){
            e.printStackTrace();
        }
        return success("退出登录成功！");
    }

    /**
     * 获取登录用户ID
     * @param token
     * @return
     */
    public Integer tokenGetUserId(String token) {
        log.info("[获取的token] {}",token);
        // 根据登录态获取用户ID
        if(token == null || "".equals(token)){
            return 0;
        }
        QueryWrapper wrapper = new QueryWrapper<AccessToken>();
        wrapper.eq("token",token);
        AccessToken byToken = accessTokenMapper.selectOne(wrapper);
        if(byToken == null){
            return 0;
        }
        return byToken.getUser_id();
    }

    /**
     * 重写add
     * @return
     */
    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> map = service.readBody(request.getReader());
        map.put("password",service.encryption(String.valueOf(map.get("password"))));
        service.insert(map);
        return success(1);
    }

}

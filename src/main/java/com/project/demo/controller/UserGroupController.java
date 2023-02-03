package com.project.demo.controller;

import com.project.demo.entity.UserGroup;
import com.project.demo.service.UserGroupService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户组：用于用户前端身份和鉴权(UserGroup)表控制层
 *
 */
@RestController
@RequestMapping("user_group")
public class UserGroupController extends BaseController<UserGroup, UserGroupService> {
    /**
     * 服务对象
     */
    @Autowired
    public UserGroupController(UserGroupService service) {
        setService(service);
    }

}



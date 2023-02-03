package com.project.demo.controller;

import com.project.demo.entity.AreaManager;
import com.project.demo.service.AreaManagerService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *片区管理者：(AreaManager)表控制层
 *
 */
@RestController
@RequestMapping("/area_manager")
public class AreaManagerController extends BaseController<AreaManager,AreaManagerService> {

    /**
     *片区管理者对象
     */
    @Autowired
    public AreaManagerController(AreaManagerService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        Map<String, String> mapmanager_job_number = new HashMap<>();
        mapmanager_job_number.put("manager_job_number",String.valueOf(paramMap.get("manager_job_number")));
        List listmanager_job_number = service.selectBaseList(service.select(mapmanager_job_number, new HashMap<>()));
        if (listmanager_job_number.size()>0){
            return error(30000, "字段管理者工号内容不能重复");
        }
        this.addMap(paramMap);
        return success(1);
    }

}

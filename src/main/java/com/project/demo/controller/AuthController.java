package com.project.demo.controller;

import com.project.demo.entity.Auth;
import com.project.demo.service.AuthService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 定制授权(Auth)表控制层
 *
 */
@RestController
@RequestMapping("auth")
public class AuthController extends BaseController<Auth, AuthService> {
    /**
     * 服务对象
     */
    @Autowired
    public AuthController(AuthService service) {
        setService(service);
    }

}



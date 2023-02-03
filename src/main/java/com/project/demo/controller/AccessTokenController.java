package com.project.demo.controller;

import com.project.demo.entity.AccessToken;
import com.project.demo.service.AccessTokenService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 临时访问牌(AccessToken)表控制层
 *
 */
@RestController
@RequestMapping("access_token")
public class AccessTokenController extends BaseController<AccessToken, AccessTokenService> {
    /**
     * 服务对象
     */
    @Autowired
    public AccessTokenController(AccessTokenService service) {
        setService(service);
    }

}



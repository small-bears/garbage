package com.project.demo.controller;

import com.project.demo.entity.Praise;
import com.project.demo.service.PraiseService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 点赞：(Praise)表控制层
 *
 */
@RestController
@RequestMapping("praise")
public class PraiseController extends BaseController<Praise, PraiseService> {
    /**
     * 服务对象
     */
    @Autowired
    public PraiseController(PraiseService service) {
        setService(service);
    }

}



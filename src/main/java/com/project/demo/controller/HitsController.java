package com.project.demo.controller;

import com.project.demo.entity.Hits;
import com.project.demo.service.HitsService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 点赞：(Hits)表控制层
 *
 */
@RestController
@RequestMapping("hits")
public class HitsController extends BaseController<Hits, HitsService> {
    /**
     * 服务对象
     */
    @Autowired
    public HitsController(HitsService service) {
        setService(service);
    }

}



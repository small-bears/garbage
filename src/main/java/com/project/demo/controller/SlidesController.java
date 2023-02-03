package com.project.demo.controller;

import com.project.demo.entity.Slides;
import com.project.demo.service.SlidesService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 轮播图：(Slides)表控制层
 *
 */
@RestController
@RequestMapping("slides")
public class SlidesController extends BaseController<Slides, SlidesService> {
    /**
     * 服务对象
     */
    @Autowired
    public SlidesController(SlidesService service) {
        setService(service);
    }

}



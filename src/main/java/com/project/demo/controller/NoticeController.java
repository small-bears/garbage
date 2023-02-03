package com.project.demo.controller;

import com.project.demo.entity.Notice;
import com.project.demo.service.NoticeService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 公告：(Notice)表控制层
 *
 */
@RestController
@RequestMapping("notice")
public class NoticeController extends BaseController<Notice, NoticeService> {
    /**
     * 服务对象
     */
    @Autowired
    public NoticeController(NoticeService service) {
        setService(service);
    }

}



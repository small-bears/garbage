package com.project.demo.controller;

import com.project.demo.entity.Upload;
import com.project.demo.service.UploadService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * (Upload)表控制层
 *
 */
@RestController
@RequestMapping("upload")
public class UploadController extends BaseController<Upload, UploadService> {
    /**
     * 服务对象
     */
    @Autowired
    public UploadController(UploadService service) {
        setService(service);
    }

}



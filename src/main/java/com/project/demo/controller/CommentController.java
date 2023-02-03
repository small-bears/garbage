package com.project.demo.controller;

import com.project.demo.entity.Comment;
import com.project.demo.service.CommentService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 评论：(Comment)表控制层
 *
 */
@RestController
@RequestMapping("comment")
public class CommentController extends BaseController<Comment, CommentService> {
    /**
     * 服务对象
     */
    @Autowired
    public CommentController(CommentService service) {
        setService(service);
    }

}



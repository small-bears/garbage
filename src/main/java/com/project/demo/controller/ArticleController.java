package com.project.demo.controller;

import com.project.demo.entity.Article;
import com.project.demo.service.ArticleService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文章：用于内容管理系统的文章(Article)表控制层
 *
 */
@RestController
@RequestMapping("article")
public class ArticleController extends BaseController<Article, ArticleService> {
    /**
     * 服务对象
     */
    @Autowired
    public ArticleController(ArticleService service) {
        setService(service);
    }

}



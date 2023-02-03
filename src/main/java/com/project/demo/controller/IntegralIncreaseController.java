package com.project.demo.controller;

import com.project.demo.entity.IntegralIncrease;
import com.project.demo.service.IntegralIncreaseService;
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
 *积分增加：(IntegralIncrease)表控制层
 *
 */
@RestController
@RequestMapping("/integral_increase")
public class IntegralIncreaseController extends BaseController<IntegralIncrease,IntegralIncreaseService> {

    /**
     *积分增加对象
     */
    @Autowired
    public IntegralIncreaseController(IntegralIncreaseService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        String sql = "SELECT MAX(integral_increase_id) AS max FROM "+"integral_increase";
        Integer max = service.selectBaseCount(sql);
        sql = "UPDATE `user_points` INNER JOIN `integral_increase` ON user_points.user=integral_increase.user SET user_points.integral = user_points.integral + integral_increase.increase_points WHERE integral_increase.integral_increase_id="+max;
        service.updateBaseSql(sql);
        return success(1);
    }

}

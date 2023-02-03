package com.project.demo.controller;

import com.project.demo.entity.IntegralDeduction;
import com.project.demo.service.IntegralDeductionService;
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
 *积分扣减：(IntegralDeduction)表控制层
 *
 */
@RestController
@RequestMapping("/integral_deduction")
public class IntegralDeductionController extends BaseController<IntegralDeduction,IntegralDeductionService> {

    /**
     *积分扣减对象
     */
    @Autowired
    public IntegralDeductionController(IntegralDeductionService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        String sql = "SELECT MAX(integral_deduction_id) AS max FROM "+"integral_deduction";
        Integer max = service.selectBaseCount(sql);
        sql = ("SELECT count(*) count FROM `user_points` INNER JOIN `integral_deduction` ON user_points.user=integral_deduction.user WHERE user_points.integral &#60; integral_deduction.deduction_points AND integral_deduction.integral_deduction_id="+max).replaceAll("&#60;","<");
        Integer count = service.selectBaseCount(sql);
        if(count>0){
            sql = "delete from "+"integral_deduction"+" WHERE "+"integral_deduction_id"+" ="+max;
            service.deleteBaseSql(sql);
            return error(30000,"积分不足!");
        }
        sql = "UPDATE `user_points` INNER JOIN `integral_deduction` ON user_points.user=integral_deduction.user SET user_points.integral = user_points.integral - integral_deduction.deduction_points WHERE integral_deduction.integral_deduction_id="+max;
        service.updateBaseSql(sql);
        return success(1);
    }

}

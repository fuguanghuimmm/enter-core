package com.enter.core.controller;

import com.enter.core.pojo.dto.other.TestDTO;
import com.enter.core.pojo.entity.Test;
import com.enter.core.result.ResultBean;
import com.enter.core.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Liquid
 * @description
 * @date 2019/9/20
 */
@RestController
public class WelcomeController {


    @Autowired
    private TestService testService;


    @RequestMapping("/welcome")
    public ResultBean welcome(TestDTO testDTO){
        String information="部署失败";
        List<Test> tests = testService.test();
        if (tests!=null && !tests.isEmpty()){
            information="部署成功";
        }
        return new ResultBean<String>(information);
    }


}

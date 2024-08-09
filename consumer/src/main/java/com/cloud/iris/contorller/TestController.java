package com.cloud.iris.contorller;
/*
 *  Created by cles on 2021/7/3 19:47
 */

import com.cloud.iris.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cles
 * @description:
 * @Date 2021/7/3 19:47
 * @version: 1.0.0
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    TestService service;


    @GetMapping(value = "/index")
    public String hello(){
//        service.doSom();
        return "测试feigin";
    }

}

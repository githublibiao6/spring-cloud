package com.cloud.iris.controller;
/*
 *  Created by cles on 2021/7/3 19:59
 */

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cles
 * @description:
 * @Date 2021/7/3 19:59
 * @version: 1.0.0
 */
@RestController
@RequestMapping("test")
public class TestController {

    @PostMapping("index")
    public String index(){

        System.err.println("已经调用到");
        return "服务提供者";
    }
}

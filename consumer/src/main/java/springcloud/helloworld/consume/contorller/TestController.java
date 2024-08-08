package springcloud.helloworld.consume.contorller;
/*
 *  Created by cles on 2021/7/3 19:47
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springcloud.helloworld.consume.service.TestService;

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
        service.doSom();
        return "测试feigin";
    }

}

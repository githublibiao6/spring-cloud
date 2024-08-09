package com.cloud.iris.client;
/*
 *  Created by cles on 2021/7/3 19:51
 */

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author cles
 * @description:
 * @Date 2021/7/3 19:51
 * @version: 1.0.0
 */
@FeignClient("iris-service")
public interface ProduceClient {

    /**
     * feign 接口调试
     * @return 测试返回
     */
    @PostMapping("/test/index")
    String getProducerUser();
}

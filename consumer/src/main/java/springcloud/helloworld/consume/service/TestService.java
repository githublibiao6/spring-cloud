package springcloud.helloworld.consume.service;
/*
 *  Created by cles on 2021/7/3 19:48
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springcloud.helloworld.consume.client.ProduceClient;

/**
 * @author cles
 * @description:
 * @Date 2021/7/3 19:48
 * @version: 1.0.0
 */
@Service
public class TestService {

    @Autowired
    ProduceClient client;

    public  boolean doSom(){
        String user = client.getProducerUser();
        System.err.println("调用生产者成功，获得返货信息+"+user);
        return  true;
    }
}

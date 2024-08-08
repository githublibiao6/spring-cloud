package springcloud.helloworld.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author 李标
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class CrawlerZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrawlerZuulApplication.class, args);
    }

}

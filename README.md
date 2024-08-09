#1.eureka 注册中心（EUREKA-SERVER）
##1.1 启动路径 http://localhost:8761/

#### registerWithEureka 是否注册自身

#2.eureka 服务提供者（EUREKA-CLIENT）

##2.1 consumer 消费者，可以通过FeignClient 访问到指定项目

# 3.zuul 网关服务

zuul:
  routes:
    route1: # 路由
      path: /iris/**
      serviceId: iris-service # 服务名称
      sensitiveHeaders:

可通过访问http://zuul:/iris/ 访问到指定的服务名称

http://localhost:9996/iris/test/index

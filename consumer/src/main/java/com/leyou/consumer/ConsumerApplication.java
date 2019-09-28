package com.leyou.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
//
//@SpringBootApplication //springboot
//@EnableDiscoveryClient //eureka
//@EnableCircuitBreaker  //熔断器

@SpringCloudApplication  //直接包含上面三个
@EnableFeignClients      //feign
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

}

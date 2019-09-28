package com.leyou.consumer.client;

import com.leyou.consumer.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * feign的客户端
 */
@FeignClient(
        value = "service", //传入服务名
        fallback = UserFeignClientFallback.class)//异常执行，Feign中Hystix的Fallback配置
public interface ConsumerFeignClient {

    @GetMapping("/service/query/{id}")
    User query(@PathVariable("id") int id);

}


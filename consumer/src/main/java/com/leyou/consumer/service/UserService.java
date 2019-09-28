package com.leyou.consumer.service;


import com.leyou.consumer.client.ConsumerFeignClient;
import com.leyou.consumer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private ConsumerFeignClient consumerFeignClient;

    public User query(int id) {

        User user = consumerFeignClient.query(id);
        return user;

    }
}
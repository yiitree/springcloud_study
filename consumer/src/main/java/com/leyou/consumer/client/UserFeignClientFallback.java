package com.leyou.consumer.client;

import com.leyou.consumer.pojo.User;
import org.springframework.stereotype.Component;

@Component
public class UserFeignClientFallback implements ConsumerFeignClient {

    @Override
    public User query(int id) {
        User user = new User();
        user.setName("用户查询出现异常！");
        return user;
    }
}

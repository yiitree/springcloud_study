package com.leyou.service.userservice;

import com.leyou.service.pojo.User;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserService {

    public User query(int id) {
        Date day = new Date();
        User user = new User("zs",id,"男");
        return user;
    }

}

package com.leyou.consumer.controller;

import com.leyou.consumer.pojo.User;
import com.leyou.consumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consumer")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/query")
    public User consume(@RequestParam("id") int id) {
        return userService.query(id);
    }

}


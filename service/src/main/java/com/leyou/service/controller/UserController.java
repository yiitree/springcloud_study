package com.leyou.service.controller;

import com.leyou.service.pojo.User;
import com.leyou.service.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("service")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/query/{id}")
    public User query(@PathVariable("id")int id) {
        return userService.query(id);
    }

}


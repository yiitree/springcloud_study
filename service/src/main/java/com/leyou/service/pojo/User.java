package com.leyou.service.pojo;

import lombok.Data;

@Data
public class User {

    // 姓名
    private String name;

    // 年龄
    private Integer age;

    // 性别
    private String sex;

    public User(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}

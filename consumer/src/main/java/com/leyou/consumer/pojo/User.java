package com.leyou.consumer.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    // 姓名
    private String name;

    // 年龄
    private Integer age;

    // 性别
    private String sex;
}

/**
 * @Project: userTest
 * @Author: liming
 * @Date: 2018年06月14日
 * @Copyright: 2018-2028 www.haokukeji.com Inc. All rights reserved.
 */
package com.example.eurekaclient01.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * ClassName: User
 * @Description: userTest
 * @author liming
 * @date 2018年06月14日
 */

public class User {
    private String name;
    private  Integer age;


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}

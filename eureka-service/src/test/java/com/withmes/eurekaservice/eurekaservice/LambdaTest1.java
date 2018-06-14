/**
 * @Project: LambdaTest1
 * @Author: liming
 * @Date: 2018年05月10日
 * @Copyright: 2018-2028 www.haokukeji.com Inc. All rights reserved.
 */
package com.withmes.eurekaservice.eurekaservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * ClassName: LambdaTest1
 * @Description: LambdaTest1
 * @author liming
 * @date 2018年05月10日
 */

public class LambdaTest1 {
    public static void main(String[] args) {
      List<User> list = new ArrayList<>();
        User user = new User();
        user.setName("zs");
        user.setAge(20);
        list.add(user);
        user = new User();
        user.setName("ls");
        user.setAge(30);
        list.add(user);
        list.forEach((e)-> System.out.println(e.getName()+":"+e.getAge()));
    }


}

class User {
    private  String name;
    private  Integer age;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(age, user.age);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
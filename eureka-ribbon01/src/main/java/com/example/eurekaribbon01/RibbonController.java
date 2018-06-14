/**
 * @Project: RibbonController
 * @Author: liming
 * @Date: 2018年05月08日
 * @Copyright: 2018-2028 www.haokukeji.com Inc. All rights reserved.
 */
package com.example.eurekaribbon01;

import com.example.eurekaclient01.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName: RibbonController
 * @Description: RibbonController
 * @author liming
 * @date 2018年05月08日
 */
@RestController
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/ribbon")
    public  String    gotoHello (){
        System.out.println("....");
        String s = restTemplate.getForObject("http://client/hello?name={}", String.class,"张三");
        return s;
    }

    /**
     * @Description:测试ribbon post 请求 需注意:ribbon 必须用POST请求!client也必须用post请求 否则会导致405错误!
     * @param: []
     * @return: java.lang.String
     * @auther: liming
     * @date: 2018/6/14 17:00
     */
    @PostMapping(value = "/postForEntity")
    public  String    postForEntity (){
        String url = "http://client/clientRespondPostResult";
        System.out.println(url);
        User user = new User();
        user.setName("ribbon");
        user.setAge(1);
        System.out.println("post请求开始....");
        ResponseEntity<User> post = restTemplate.postForEntity(url, user, User.class);
        System.out.println("post请求结束...");
        return post.toString();
    }
}

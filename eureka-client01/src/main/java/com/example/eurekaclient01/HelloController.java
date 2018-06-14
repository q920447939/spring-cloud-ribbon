/**
 * @Project: HelloController
 * @Author: liming
 * @Date: 2018年05月08日
 * @Copyright: 2018-2028 www.haokukeji.com Inc. All rights reserved.
 */
package com.example.eurekaclient01;

import com.example.eurekaclient01.entity.Server;
import com.example.eurekaclient01.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName: HelloController
 *
 * @author liming
 * @Description: HelloController
 * @date 2018年05月08日
 */
@RestController
public class HelloController {

    org.slf4j.Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private Server server;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping(value = "/hello")
    public String hello() {
        List<String> services =
                discoveryClient.getServices();
        logger.info("service port {} ", 9002);
        return "hello 9002";
    }

    /**
     * @Description:必须加 @RequestBody  否则参数user对象接收不到, 必须用@PostMapping  重要的事情说三遍!
     * @param: [user]
     * @return: com.example.eurekaclient01.entity.User
     * @auther: liming
     * @date: 2018/6/14 17:02
     */
    @PostMapping(value = "/clientRespondPostResult")
    public User clientRespondPostResult(@RequestBody  User user) {
        System.out.println("client port:"+server.getPort()+"============="+"\r" + "user值:"+user);
        user.setName("port : "+server.getPort());
        return user;
    }
}

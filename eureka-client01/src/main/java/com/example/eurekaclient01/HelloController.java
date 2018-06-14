/**
 * @Project: HelloController
 * @Author: liming
 * @Date: 2018年05月08日
 * @Copyright: 2018-2028 www.haokukeji.com Inc. All rights reserved.
 */
package com.example.eurekaclient01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
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
    private DiscoveryClient discoveryClient;

    @GetMapping(value = "/hello")
    public String hello() {
        List<String> services =
                discoveryClient.getServices();
        logger.info("service port {} ", 9002);
        return "hello 9002";
    }
}

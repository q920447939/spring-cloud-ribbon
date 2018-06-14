/**
 * @Project: RibbonController
 * @Author: liming
 * @Date: 2018年05月08日
 * @Copyright: 2018-2028 www.haokukeji.com Inc. All rights reserved.
 */
package com.example.eurekaribbon01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
        String s = restTemplate.getForObject("http://client/hello?name={}", String.class,"张三");
        return s;
    }

}

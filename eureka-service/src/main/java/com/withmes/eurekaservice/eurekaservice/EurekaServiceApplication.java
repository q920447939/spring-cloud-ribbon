package com.withmes.eurekaservice.eurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.regex.Pattern;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceApplication {

    public static void main(
            String[] args) {
        SpringApplication.run(EurekaServiceApplication.class, args
        );
    }

    public static boolean isNumber(String str) {
        String compileStr = "^[0-9]+";
        return Pattern.compile(compileStr).matcher(str).find();
    }

}

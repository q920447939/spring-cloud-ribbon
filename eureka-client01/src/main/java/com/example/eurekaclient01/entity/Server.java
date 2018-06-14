/**
 * @Project: Server
 * @Author: liming
 * @Date: 2018年06月14日
 * @Copyright: 2018-2028 www.haokukeji.com Inc. All rights reserved.
 */
package com.example.eurekaclient01.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * ClassName: Server
 * @Description: Server
 * @author liming
 * @date 2018年06月14日
 */
@Component
@ConfigurationProperties(prefix = "server")
public class Server {
    private Integer port;

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}

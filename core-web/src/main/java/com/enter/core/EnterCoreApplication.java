package com.enter.core;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;

/**
 * @author Liquid
 * @类名： EnterTransferApplication
 * @描述：
 * @date 2019/10/6
 */
@EnableDubbo
@SpringBootApplication
public class EnterCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnterCoreApplication.class);
    }

}

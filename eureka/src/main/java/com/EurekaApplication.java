package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
//Spring Boot 2.0选择组件时添加了mysql、mybatis需要在启动类的@EnableAutoConfiguration或@SpringBootApplication中添加
//exclude= {DataSourceAutoConfiguration.class}，排除此类的autoconfig。启动以后就可以正常运行。
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class EurekaApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(EurekaApplication.class);
    }
}

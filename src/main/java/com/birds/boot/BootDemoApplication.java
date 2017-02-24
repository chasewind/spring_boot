package com.birds.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 类BootDemoApplication.java
 * 
 * @author dongwei.ydw 2017年2月24日 上午10:13:48
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
// @SpringBootApplication 和前三个一起配置是等价的
public class BootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootDemoApplication.class, args);
    }
}

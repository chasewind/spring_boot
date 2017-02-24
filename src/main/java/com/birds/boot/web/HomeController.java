package com.birds.boot.web;

import java.util.Date;

import javax.validation.Valid;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.birds.boot.domain.User;

@RestController
@EnableAutoConfiguration
public class HomeController {

    @NotEmpty
    @Valid
    @Value("${server.name}")
    private String serverName;
    @Value("${server.ip}")
    private String serverIp;

    @RequestMapping("/")
    public String home() {
        return "Good Job!  " + serverName;
    }

    @RequestMapping("/getIp")
    public String getIp() {
        return serverIp;
    }

    @RequestMapping("/sayHello/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello, " + name;
    }

    @RequestMapping("/getUser")
    public User getUser() {
        User u = new User();
        u.setId(RandomUtils.nextLong(1L, 1000000L));
        u.setNickName(RandomStringUtils.randomAlphabetic(12));
        u.setBirthDay(new Date());
        return u;
    }

    @RequestMapping("/setUser")
    public Date setUser(@RequestBody User u) {
        return u.getBirthDay();
    }

}

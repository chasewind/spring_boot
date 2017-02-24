package com.birds.boot.web;

import javax.validation.Valid;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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



}

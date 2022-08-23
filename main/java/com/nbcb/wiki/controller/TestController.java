package com.nbcb.wiki.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController

public class TestController {

    @Value("${test.hello:TEST}")
    private String testHello;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!"+testHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){

        return "hello World! Post,"+name;
    }
}

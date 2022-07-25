package com.mixedmodel.system.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jyc
 * @date 2022/7/25 - 20:54
 */

@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @PostMapping ("/hello/post")
    public String helloPost(String name) {
        return "Hello World!" + name;
    }
}

package com.mixedmodel.system.controller;

import com.mixedmodel.system.pojo.Test;
import com.mixedmodel.system.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author jyc
 * @date 2022/7/25 - 20:54
 */

@RestController
public class TestController {

    @Value("${test.hello}")
    private String testProperties;

    @Resource
    private TestService testService;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!" + testProperties;
    }

    @PostMapping ("/hello/post")
    public String helloPost(String name) {
        return "Hello World!" + name;
    }

    @GetMapping("/test/list")
    public List<Test> list() {
        return testService.list();
    }
}

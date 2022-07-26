package com.mixedmodel.system.controller;

import com.mixedmodel.system.pojo.Demo;
import com.mixedmodel.system.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author jyc
 * @date 2022/7/25 - 20:54
 */

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private DemoService demoService;


    @GetMapping("/list1")
    public List<Demo> list() {
        return demoService.list();
    }
}

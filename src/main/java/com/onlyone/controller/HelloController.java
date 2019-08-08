package com.onlyone.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xmr on 2019/8/7.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        int i=1/0;
        return "hello";
    }
}

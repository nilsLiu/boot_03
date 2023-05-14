package com.example.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: boot_03
 * @BelongsPackage: com.example.boot.controller
 * @Author: hai
 * @CreateTime: 2023-05-14  19:58
 * @Version: 1.0
 */

@RestController
public class TestController {
    @RequestMapping("/p1.jpg")
    public String hello() {
        return "hello";
    }
}

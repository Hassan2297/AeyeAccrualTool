package com.aeye.AccrualTool.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Hassan Wael
 */
@RestController
public class TestController {

    @GetMapping("/")
    public String index() {
        return "This a test ldap!";
    }
}

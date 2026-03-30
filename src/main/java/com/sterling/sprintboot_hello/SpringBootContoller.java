package com.sterling.sprintboot_hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootContoller {
    @RequestMapping("/")
    public String index() {
        return "Hello World!";
    }
}
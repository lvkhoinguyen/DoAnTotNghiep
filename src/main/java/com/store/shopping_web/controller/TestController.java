package com.store.shopping_web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class TestController {
    @GetMapping("/home")
    public String hello() {
        return "client/homepage/show";
    }

}

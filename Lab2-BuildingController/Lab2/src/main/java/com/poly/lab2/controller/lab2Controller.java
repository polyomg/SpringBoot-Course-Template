package com.poly.lab2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class lab2Controller {
    @GetMapping("/hello")
    public String hello() {
        return "hello.html"; // trả về hello.html
    }
}
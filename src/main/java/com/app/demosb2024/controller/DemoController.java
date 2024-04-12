package com.app.demosb2024.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/helloMsg")
    public String helloMsg(){
        return "Hello this is Demo-sb-2024 helloMsg";
    }
    @GetMapping("/showMsg")
    public String showMsg(){
        return "This is Demo-sb-2024 showMsg";
    }
}

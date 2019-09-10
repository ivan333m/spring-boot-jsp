package com.example.demomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CustomerController {

    @GetMapping("/test")
    public String hello(ModelMap model) {
        return "list";
    }
}
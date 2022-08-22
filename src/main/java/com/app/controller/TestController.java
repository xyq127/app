package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/test")
public class TestController {

    @GetMapping({"","/","/index","/main"})
    public String index() {
        return "holity/index";
    }

}

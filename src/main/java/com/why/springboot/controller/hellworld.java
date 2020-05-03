package com.why.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
//@Controller
public class hellworld {

    @RequestMapping("/hello")
    //@ResponseBody
    public String getProjectName() {
        return "Hello world!";
    }
}

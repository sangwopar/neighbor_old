package com.neighbor.market.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/")
    public String test(){
        return "jungo";
    }

    @GetMapping("/view")
    public String view(){
        return "view";
    }

    @GetMapping("/write")
    public String write(){
        return "write";
    }

}

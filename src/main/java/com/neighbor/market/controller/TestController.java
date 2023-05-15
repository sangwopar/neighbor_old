package com.neighbor.market.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/")
    public String login(Model model){
        model.addAttribute("test","LOGIN");
        return "login";
    }
    @GetMapping("/join")
    public String join(){
        return "join";
    }

}

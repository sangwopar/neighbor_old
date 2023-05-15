package com.neighbor.market.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @GetMapping("/login")
    public String login(){
        return "neighborUser/login";
    }
    @GetMapping("/join")
    public String join(){
        return "neighborUser/join";
    }

   @PostMapping("/joinUser.do")
    public String joinUser(){

        return "neighborUser/join";
    }

}

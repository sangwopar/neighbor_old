package com.neighbor.market.controller;

import com.neighbor.market.dto.MemberDTO2;
import com.neighbor.market.service.MemberService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

public class MemberController2 {
    private MemberService2 memberService2;
    @Autowired
    public MemberController2(MemberService2 memberService2){
        this.memberService2 = memberService2;
    }



    @GetMapping("/login")
    public String login(){
        return "neighborMember/login";
    }
    @PostMapping("/loginMember.do")//로그인
    public ModelAndView loginUser(MemberDTO2 dto, HttpSession session){
        ModelAndView mav = new ModelAndView();
        int result= memberService2.login(dto,session);
        if(result==1){//로그인성공
            mav.setViewName("loginTest");
        }else{
            mav.setViewName("neighborMember/join");
        }
        return mav;
    }
    @GetMapping("/join")
    public String join(){
        return "neighborMember/join";
    }

    @PostMapping("/joinMember.do")//회원가입
    public String joinUser(MemberDTO2 dto, String m, String b, String t, String i){
        String getMbti=m+b+t+i;
        dto.setMbti(getMbti);
        memberService2.join(dto);
        return "neighborMember/join";
    }
    @GetMapping("/logout")//로그아웃
    public String logout(HttpSession session){
        memberService2.logout(session);
        return "logoutTest";
    }

}

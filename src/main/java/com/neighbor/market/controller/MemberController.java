package com.neighbor.market.controller;

import com.neighbor.market.dto.MemberDTO;
import com.neighbor.market.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class MemberController {
    private MemberService memberService;
    @Autowired
    public MemberController(MemberService memberService){
        this.memberService=memberService;
    }



    @GetMapping("/login")
    public String login(){
        return "neighborMember/login";
    }
    @PostMapping("/loginMember.do")//로그인
    public ModelAndView loginUser(MemberDTO dto, HttpSession session){
        ModelAndView mav = new ModelAndView();
        int result=memberService.login(dto,session);
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
    public String joinUser(MemberDTO dto,String m,String b,String t,String i){
        String getMbti=m+b+t+i;
        dto.setMbti(getMbti);
        memberService.join(dto);
        return "neighborMember/join";
    }
    @GetMapping("/logout")//로그아웃
    public String logout(HttpSession session){
        memberService.logout(session);
        return "logoutTest";
    }
    @GetMapping("/memberOut")
    public ModelAndView memberOut(HttpSession session,ModelAndView mav){
        memberService.memberOut(session);
        mav.addObject("memberOut","회원탈퇴다븅시나");
        mav.setViewName("memberOutTest");
        return mav;
    }

}

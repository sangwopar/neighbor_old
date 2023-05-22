package com.neighbor.member.controller;

import com.neighbor.member.domain.Member;
import com.neighbor.member.service.MemberService;
import com.neighbor.member.service.MemberServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/login")
    public String login() {
        return "neighborMember/login";
    }

    @PostMapping("/loginMember.do")
    @ResponseBody
    public Member loginUser(Member member) {
        Member result = memberService.login(member);
        return result;
    }

    @GetMapping("join")
    public String save() {
        return "neighborMember/join";
    }

    @PostMapping("/joinMember.do")
    @ResponseBody
    public int save(Member member, String m, String b, String t, String i ){
        String getMbti=m+b+t+i;
        member.setMbti(getMbti);
        return memberService.save(member);
    }
}

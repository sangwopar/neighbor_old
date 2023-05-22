package com.neighbor.market.service;


import com.neighbor.market.dto.MemberDTO2;

import javax.servlet.http.HttpSession;


public interface MemberService2 {
    public void join(MemberDTO2 dto);//회원가입
    public int login(MemberDTO2 dto, HttpSession session);//로그인
    public void logout(HttpSession session);//로그아웃
    public boolean passCheck(String memberEmail,String memberPassword);//비번확인
    public void memberOut(HttpSession session);

}

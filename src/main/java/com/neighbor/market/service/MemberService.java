package com.neighbor.market.service;


import com.neighbor.market.dto.MemberDTO;

import javax.servlet.http.HttpSession;


public interface MemberService {
    public void join(MemberDTO dto);//회원가입
    public int login(MemberDTO dto,HttpSession session);//로그인
    public void logout(HttpSession session);//로그아웃
    public boolean passCheck(String memberEmail,String memberPassword);//비번확인
    public void memberOut(HttpSession session);

}

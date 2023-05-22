package com.neighbor.member.service;

import com.neighbor.member.domain.Member;

import javax.servlet.http.HttpSession;

public interface MemberService {
    public int save(Member member);

    public Member login(Member member);

    public void logout(HttpSession session);

}

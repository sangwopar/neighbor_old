package com.neighbor.member.service;

import com.neighbor.member.domain.Member;
import com.neighbor.member.repository.MbMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class MemberServiceImpl implements MemberService{
    private MbMemberRepository memberRepository;
    @Autowired
    public MemberServiceImpl() {
        this.memberRepository = memberRepository;
    }

    @Override
    public int save(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public Member login(Member member) {
        return memberRepository.login(member);
    }

    @Override
    public void logout(HttpSession session) {

    }
}

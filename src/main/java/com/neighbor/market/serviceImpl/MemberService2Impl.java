package com.neighbor.market.serviceImpl;

import com.neighbor.market.dao.MemberDAO2;
import com.neighbor.market.dto.MemberDTO2;
import com.neighbor.market.service.MemberService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class MemberService2Impl implements MemberService2 {

    private MemberDAO2 memberDao2;//매퍼
    @Autowired
    public MemberService2Impl(MemberDAO2 memberDao2){
        this.memberDao2 = memberDao2;
    }


    @Override
    public void join(MemberDTO2 dto) {//회원가입
        memberDao2.join(dto);
    }

    @Override
    public int login(MemberDTO2 dto, HttpSession session){//로그인
        int result =0;

        MemberDTO2 dto2= memberDao2.login(dto);
        if(dto2 != null){
            session.setAttribute("memberId",dto2.getMemberId());
            session.setAttribute("memberName",dto2.getMemberName());
            result=1;
        }
        return result;
    }

    @Override
    public void logout(HttpSession session) {
        session.invalidate();
    }

    @Override
    public boolean passCheck(String userEmail, String userPassword) {
        return false;
    }
}

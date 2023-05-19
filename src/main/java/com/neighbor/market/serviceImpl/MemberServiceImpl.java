package com.neighbor.market.serviceImpl;

import com.neighbor.market.dao.MemberDAO;
import com.neighbor.market.dto.MemberDTO;
import com.neighbor.market.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Service
public class MemberServiceImpl implements MemberService {

    private MemberDAO memberDao;//매퍼
    @Autowired
    public MemberServiceImpl(MemberDAO memberDao){
        this.memberDao=memberDao;
    }


    @Override
    public void join(MemberDTO dto) {//회원가입
        memberDao.join(dto);
    }

    @Override
    public int login(MemberDTO dto, HttpSession session){//로그인
        int result =0;

        MemberDTO dto2=memberDao.login(dto);
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

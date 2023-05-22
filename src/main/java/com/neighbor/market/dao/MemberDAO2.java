package com.neighbor.market.dao;

import com.neighbor.market.dto.MemberDTO2;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MemberDAO2 {
    @Insert("INSERT INTO member (memberName, memberPassword, memberEmail, region,addressDetail ,createdAt, score, mbti) " +
            "VALUES (#{memberName},#{memberPassword},#{memberEmail},#{region},#{addressDetail} ,current_timestamp, 0.0,#{mbti})")
     void join(MemberDTO2 dto);//회원가입

    @Select("SELECT memberid,memberName FROM member WHERE memberEmail=#{memberEmail} and memberPassword=#{memberPassword}")
    MemberDTO2 login(MemberDTO2 dto);//로그인
    public boolean passCheck(String memberEmail,String memberPassword);//비번확인
}

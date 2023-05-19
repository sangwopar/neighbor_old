package com.neighbor.market.dao;

import com.neighbor.market.dto.MemberDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Mapper
public interface MemberDAO {
    @Insert("INSERT INTO member (memberName, memberPassword, memberEmail, region,addressDetail ,createdAt, score, mbti) " +
            "VALUES (#{memberName},#{memberPassword},#{memberEmail},#{region},#{addressDetail} ,current_timestamp, 0.0,#{mbti})")
     void join(MemberDTO dto);//회원가입

    @Select("SELECT memberId,memberName,memberOut FROM member" +
            " WHERE memberEmail=#{memberEmail} and memberPassword=#{memberPassword} and memberOut=0")
    MemberDTO login(MemberDTO dto);//로그인
    public boolean passCheck(String memberEmail,String memberPassword);//비번확인

    @Update("UPDATE member SET memberOut=1 " +
            "WHERE memberName=#{memberName} and memberId=#{memberId}")
    void memberOut(  Map<String,Object> map);//회원탈퇴

}

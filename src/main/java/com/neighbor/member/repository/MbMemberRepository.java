package com.neighbor.member.repository;

import com.neighbor.member.domain.Member;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface MbMemberRepository extends MemberRepository{
    @Override
    @Insert("INSERT INTO member (memberName, memberPWD, memberEmail, address,addressDetail , score, mbti) " +
            "VALUES (#{memberName},#{memberPWD},#{memberEmail},#{address},#{addressDetail} , 0,#{mbti})")
    @Options(useGeneratedKeys = true, keyProperty = "memberId")
    int save(Member member);

    @Override
    @Select("SELECT memberId,memberName FROM member WHERE memberEmail=#{memberEmail} and memberPWD=#{memberPWD}")
    Member login(Member member);
}

package com.neighbor.member.repository;

import com.neighbor.member.domain.Member;

public interface MemberRepository {

    int save(Member member);

    Member login(Member member);

}

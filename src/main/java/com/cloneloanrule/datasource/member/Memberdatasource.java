package com.cloneloanrule.datasource.member;


import com.cloneloanrule.application.member.MemberRepository;
import com.cloneloanrule.domain.member.Member;
import com.cloneloanrule.domain.member.MemberNumber;

import org.springframework.stereotype.Repository;

@Repository
public class Memberdatasource implements MemberRepository {

    MemberMapper mapper;



    @Override
    public Member 会員(MemberNumber 会員番号) {
        return mapper.member(会員番号);
    }
}

package com.cloneloanrule.application.member;

import com.cloneloanrule.domain.member.Member;
import com.cloneloanrule.domain.member.MemberNumber;

import org.springframework.stereotype.Service;

@Service
public class MemberService {

    MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member 会員(MemberNumber 会員番号){
        return memberRepository.会員(会員番号);
    }
}

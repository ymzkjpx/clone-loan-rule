package com.cloneloanrule.application.member;

import com.cloneloanrule.domain.member.Member;
import com.cloneloanrule.domain.member.MemberNumber;

public interface MemberRepository {
    Member 会員(MemberNumber 会員番号);
}

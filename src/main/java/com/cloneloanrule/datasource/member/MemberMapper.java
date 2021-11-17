package com.cloneloanrule.datasource.member;

import com.cloneloanrule.domain.member.Member;
import com.cloneloanrule.domain.member.MemberNumber;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    Member 会員(MemberNumber memberNumber);
}

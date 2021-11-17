package com.cloneloanrule.datasource.loan;

import com.cloneloanrule.domain.loan.Loan;
import com.cloneloanrule.domain.member.MemberNumber;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LoanMapper {
    List<Loan> 貸出履歴(MemberNumber 会員番号);
}

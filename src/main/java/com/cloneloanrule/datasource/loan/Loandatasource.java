package com.cloneloanrule.datasource.loan;

import com.cloneloanrule.application.loan.LoanRepository;
import com.cloneloanrule.domain.loan.Loan;
import com.cloneloanrule.domain.loan.LoanHistory;
import com.cloneloanrule.domain.member.MemberNumber;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Loandatasource implements LoanRepository {

    LoanMapper loanMapper;

    public Loandatasource(LoanMapper loanMapper) {
        this.loanMapper = loanMapper;
    }

    @Override
    public LoanHistory 貸出履歴(MemberNumber 会員番号) {
        List<Loan> result = loanMapper.貸出履歴(会員番号);
        return LoanHistory.of(result);
    }
}

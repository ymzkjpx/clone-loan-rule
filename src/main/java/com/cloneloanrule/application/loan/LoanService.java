package com.cloneloanrule.application.loan;

import com.cloneloanrule.domain.loan.LoanHistory;
import com.cloneloanrule.domain.member.MemberNumber;

import org.springframework.stereotype.Service;

@Service
public class LoanService {
    LoanRepository loanRepository;

    public LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    public LoanHistory 貸出履歴(MemberNumber 会員番号) {
        return loanRepository.貸出履歴(会員番号);
    }
}

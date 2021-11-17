package com.cloneloanrule.application.loan;

import com.cloneloanrule.domain.loan.LoanHistory;
import com.cloneloanrule.domain.member.MemberNumber;

public interface LoanRepository {
    LoanHistory 貸出履歴(MemberNumber 会員番号);
}

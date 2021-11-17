package com.cloneloanrule.domain.loanability;

import com.cloneloanrule.domain.loan.LoanContext;

import static com.cloneloanrule.domain.loanability.LoanabilityType.貸出不可;
import static com.cloneloanrule.domain.loanability.LoanabilityType.貸出可能;

/**
 * 貸出可否
 */
public class Loanability {
    LoanContext 貸出履歴;

    public Loanability(LoanContext 貸出履歴) {
        this.貸出履歴 = 貸出履歴;
    }

    public static Loanability of(LoanContext loanContext) {
        return new Loanability(loanContext);
    }

    public LoanabilityType 貸出判断() {
        if (貸出数超え()) return 貸出不可;
        if (同じ本の貸出()) return 貸出不可;
        if (返却期限切れ書籍あり()) return 貸出不可;
        return 貸出可能;
    }

    public boolean 貸出数超え() {
        int 現在の貸出数 = 貸出履歴.貸出数();
        int 最大貸出可能数 = 貸出履歴.最大貸出数();
        return 現在の貸出数 >= 最大貸出可能数;
    }

    public boolean 同じ本の貸出() {
        return false;
    }

    public boolean 返却期限切れ書籍あり() {
        // 期限2週間
        return false;
    }
}

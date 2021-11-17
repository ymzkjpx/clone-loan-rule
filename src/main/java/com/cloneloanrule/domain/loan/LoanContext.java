package com.cloneloanrule.domain.loan;

import com.cloneloanrule.domain.member.Member;

/**
 * 貸出の文脈
 */
public class LoanContext {
    Member 会員;
    LoanHistory 貸出履歴;

    private LoanContext(Member 会員, LoanHistory 貸出履歴) {
        this.会員 = 会員;
        this.貸出履歴 = 貸出履歴;
    }

    public static LoanContext of(Member member, LoanHistory history) {
        return new LoanContext(member, history);
    }

    public int 最大貸出数() {
        return 会員.会員種別().最大貸出数();
    }

    public int 貸出数() {
        return 貸出履歴.貸出数();
    }

    public String 会員() {
        return 会員.toString();
    }

    public String 会員番号() {
        return 会員.会員番号();
    }

    public String 貸出履歴() {
        return 貸出履歴.toString();
    }

    @Override
    public String toString() {
        return "LoanContext{" +
                "会員=" + 会員 +
                ", 貸出履歴=" + 貸出履歴 +
                '}';
    }
}

package com.cloneloanrule.application.activity;

import com.cloneloanrule.application.collection.CollectionService;
import com.cloneloanrule.application.loan.LoanService;
import com.cloneloanrule.application.member.MemberService;
import com.cloneloanrule.domain.collection.Entries;
import com.cloneloanrule.domain.loan.LoanContext;
import com.cloneloanrule.domain.loan.LoanHistory;
import com.cloneloanrule.domain.loanability.Loanability;
import com.cloneloanrule.domain.loanability.LoanabilityType;
import com.cloneloanrule.domain.member.Member;
import com.cloneloanrule.domain.member.MemberNumber;

import org.springframework.stereotype.Service;

@Service
public class LoanActivity {
    CollectionService collectionService;
    MemberService memberService;
    LoanService loanService;

    public LoanActivity(CollectionService collectionService, MemberService memberService, LoanService loanService) {
        this.collectionService = collectionService;
        this.memberService = memberService;
        this.loanService = loanService;
    }

    public LoanContext 貸出状況(MemberNumber 会員番号) {
        Member 会員 = memberService.会員(会員番号);
        LoanHistory 貸出履歴 = loanService.貸出履歴(会員番号);
        return LoanContext.of(会員, 貸出履歴);
    }

    public Entries 蔵書一覧(会員番号) {
        return collectionService.蔵書一覧();
    }

    public LoanabilityType 貸出判断(LoanContext loanContext) {
        Loanability loanability = Loanability.of(loanContext);
        return loanability.貸出判断();
    }
}

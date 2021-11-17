package com.cloneloanrule.application.activity;

import com.cloneloanrule.datasource.collection.CollectionMapper;
import com.cloneloanrule.domain.collection.Entries;
import com.cloneloanrule.domain.loan.LoanContext;
import com.cloneloanrule.domain.loanability.Loanability;
import com.cloneloanrule.domain.loanability.LoanabilityType;
import com.cloneloanrule.domain.member.MemberNumber;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class LoanActivityTest {

    @Autowired LoanActivity loanActivity;
    @Autowired CollectionMapper collectionMapper;

    @Test
    void 蔵書一覧を取得できること() {
        Entries result = loanActivity.蔵書一覧();
        int numberOfAllEntries = collectionMapper.総蔵書品目数();
        assertAll(
                () -> assertEquals(numberOfAllEntries, result.asList().size())
        );
    }

    @Test
    void 会員の貸出状況を確認できること(){
        MemberNumber memberNumber = new MemberNumber("220");
        LoanContext result = loanActivity.貸出状況(memberNumber);
        System.out.println(result.貸出履歴());
        assertAll(
                ()->assertEquals(memberNumber.toString(), result.会員番号())
        );
    }

    @Test
    void 追加の貸出が可能であるか判断できること(){
        MemberNumber memberNumber = new MemberNumber("220");
        LoanContext loanContext = loanActivity.貸出状況(memberNumber);
        Loanability result= Loanability.of(loanContext);
        assertAll(
                ()->assertEquals(LoanabilityType.貸出可能, result.貸出判断())
        );
    }
}
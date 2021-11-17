package com.cloneloanrule.domain.loan;

import com.cloneloanrule.domain.collection.Item;
import com.cloneloanrule.domain.member.Member;

import java.time.LocalDate;

/**
 * 貸出
 */
public class Loan {
    Item 蔵書;
    Member 会員;
    LocalDate 貸出日;

    @Override
    public String toString() {
        return "Loan{" +
                "蔵書=" + 蔵書 +
                ", 会員=" + 会員 +
                ", 貸出日=" + 貸出日 +
                '}';
    }
}

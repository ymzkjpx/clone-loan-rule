package com.cloneloanrule.domain.loan;

import java.util.List;

/**
 * 貸出の履歴
 */
public class LoanHistory {
    List<Loan> list;

    @Deprecated(since = "MyBatis")
    LoanHistory() {
    }

    private LoanHistory(List<Loan> list) {
        this.list = list;
    }

    public List<Loan> asList() {
        return list;
    }

    public static LoanHistory of(List<Loan> other) {
        return new LoanHistory(other);
    }

    public int 貸出数() {
        return list.size();
    }

    @Override
    public String toString() {
        return "LoanHistory{" +
                "list=" + list +
                '}';
    }
}

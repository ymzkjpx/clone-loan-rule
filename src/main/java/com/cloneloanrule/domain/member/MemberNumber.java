package com.cloneloanrule.domain.member;

/**
 * 会員番号
 */
public class MemberNumber {
    int value;

    @Deprecated(since = "MyBatis")
    MemberNumber(){}

    public MemberNumber(String value) {
        this.value = Integer.parseInt(value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}

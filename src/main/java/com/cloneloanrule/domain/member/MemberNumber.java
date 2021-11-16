package com.cloneloanrule.domain.member;

/**
 * 会員番号
 */
public class MemberNumber {
    String value;

    @Deprecated(since = "MyBatis")
    MemberNumber(){}

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return "MemberNumber{" +
                "value='" + value + '\'' +
                '}';
    }
}

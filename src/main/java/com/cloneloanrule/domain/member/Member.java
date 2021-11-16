package com.cloneloanrule.domain.member;

/**
 * 会員
 */
public class Member {
    MemberNumber memberNumber;
    String 氏名;
    MemberCategory 会員種別;

    public MemberNumber memberNumber() {
        return memberNumber;
    }

    public MemberCategory 会員種別() {
        return 会員種別;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberNumber=" + memberNumber +
                ", 氏名='" + 氏名 + '\'' +
                ", 会員種別=" + 会員種別 +
                '}';
    }
}

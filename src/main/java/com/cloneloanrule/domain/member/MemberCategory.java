package com.cloneloanrule.domain.member;

/**
 * 会員種別
 */
public enum MemberCategory {
    一般(5),
    小中学生(3);

    int 最大貸出数;

    MemberCategory(int 最大貸出数) {
        this.最大貸出数 = 最大貸出数;
    }

    public int 最大貸出数() {
        return 最大貸出数;
    }
}

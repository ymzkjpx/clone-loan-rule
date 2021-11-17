package com.cloneloanrule.domain.collection;

public class Item {
    ItemNumber 蔵書番号;
    Entry 蔵書品目;

    public ItemNumber 蔵書番号() {
        return 蔵書番号;
    }

    public Entry 蔵書() {
        return 蔵書品目;
    }

    @Override
    public String toString() {
        return "Item{" +
                "蔵書番号=" + 蔵書番号 +
                ", 蔵書=" + 蔵書品目 +
                '}';
    }
}

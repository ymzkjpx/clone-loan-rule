package com.cloneloanrule.domain.collection;

public class Item {
    ItemNumber itemNumber;
    Entry 蔵書;

    public ItemNumber itemNumber() {
        return itemNumber;
    }

    public Entry 蔵書() {
        return 蔵書;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemNumber=" + itemNumber +
                ", entry=" + 蔵書 +
                '}';
    }
}

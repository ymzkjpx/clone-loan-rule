package com.cloneloanrule.domain.book;

public class BookNumber {
    String value;

    @Deprecated(since = "MyBatis")
    BookNumber(){}

    public BookNumber(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "BookNumber{" +
                "value='" + value + '\'' +
                '}';
    }
}


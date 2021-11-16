package com.cloneloanrule.domain.book;

public class Book {
    BookNumber bookNumber;
    String タイトル;
    String 著者;

    public String description(){
        return String.format("%s (%s)", タイトル,著者);
    }

    public BookNumber number(){
        return bookNumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookNumber=" + bookNumber +
                ", タイトル='" + タイトル + '\'' +
                ", 著者='" + 著者 + '\'' +
                '}';
    }
}

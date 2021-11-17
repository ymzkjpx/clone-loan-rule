package com.cloneloanrule.domain.collection.book;

/**
 * 書籍
 */
public class Book {
    BookNumber 書籍番号;
    String タイトル;
    String 著者;

    public String description() {
        return String.format("%s (%s)", タイトル, 著者);
    }

    public BookNumber number() {
        return 書籍番号;
    }

    @Override
    public String toString() {
        return "Book{" +
                "書籍番号=" + 書籍番号 +
                ", タイトル='" + タイトル + '\'' +
                ", 著者='" + 著者 + '\'' +
                '}';
    }
}

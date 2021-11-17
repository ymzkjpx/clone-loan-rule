package com.cloneloanrule.domain.collection;

import com.cloneloanrule.domain.collection.book.Book;
import com.cloneloanrule.domain.collection.book.BookNumber;

/**
 * 蔵書
 */
public class Entry {
    Book 書籍;

    public String description() {
        return 書籍.description();
    }

    public BookNumber number() {
        return 書籍.number();
    }

    @Override
    public String toString() {
        return "Entry{" +
                "書籍=" + 書籍 +
                '}';
    }
}

package com.cloneloanrule.application.collection;

import com.cloneloanrule.domain.collection.Entries;
import com.cloneloanrule.domain.collection.Entry;
import com.cloneloanrule.domain.collection.book.BookNumber;

public interface CollectionRepository {
    Entries 蔵書一覧();

    Entry 蔵書(BookNumber 書籍番号);
}

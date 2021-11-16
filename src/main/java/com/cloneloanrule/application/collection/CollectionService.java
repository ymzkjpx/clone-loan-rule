package com.cloneloanrule.application.collection;

import com.cloneloanrule.domain.collection.Entries;
import com.cloneloanrule.domain.collection.Entry;
import com.cloneloanrule.domain.collection.book.BookNumber;

import org.springframework.stereotype.Service;

@Service
public class CollectionService {

    CollectionRepository 蔵書;

    public CollectionService(CollectionRepository 蔵書) {
        this.蔵書 = 蔵書;
    }

    public Entries 蔵書一覧(){
        return 蔵書一覧();
    }

    public Entry 蔵書(BookNumber bookNumber){
        return null;
    }
}

package com.cloneloanrule.application.collection;

import com.cloneloanrule.domain.collection.Entries;
import com.cloneloanrule.domain.collection.Entry;
import com.cloneloanrule.domain.collection.book.BookNumber;

import org.springframework.stereotype.Service;

@Service
public class CollectionService {

    CollectionRepository collectionRepository;

    public CollectionService(CollectionRepository collectionRepository) {
        this.collectionRepository = collectionRepository;
    }

    public Entries 蔵書一覧() {
        return collectionRepository.蔵書一覧();
    }

    public Entry 蔵書(BookNumber 書籍番号) {
        return collectionRepository.蔵書(書籍番号);
    }
}

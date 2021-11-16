package com.cloneloanrule.datasource.collection;

import com.cloneloanrule.application.collection.CollectionRepository;
import com.cloneloanrule.domain.collection.Entries;
import com.cloneloanrule.domain.collection.Entry;
import com.cloneloanrule.domain.collection.book.BookNumber;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CollectionDatasource implements CollectionRepository {

    CollectionMapper mapper;

    public CollectionDatasource(CollectionMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public Entries 蔵書一覧() {
        List<Entry> result = mapper.蔵書一覧();
        return Entries.of(result);
    }

    @Override
    public Entry 蔵書(BookNumber bookNumber) {
        return mapper.蔵書(bookNumber);
    }
}

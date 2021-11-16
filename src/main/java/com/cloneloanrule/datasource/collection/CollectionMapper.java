package com.cloneloanrule.datasource.collection;

import com.cloneloanrule.domain.collection.Entry;
import com.cloneloanrule.domain.collection.book.BookNumber;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CollectionMapper {
    List<Entry> 蔵書一覧();

    Entry 蔵書(@Param("value") BookNumber bookNumber);
}

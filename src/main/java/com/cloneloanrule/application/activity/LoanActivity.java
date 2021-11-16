package com.cloneloanrule.application.activity;

import com.cloneloanrule.application.collection.CollectionService;
import com.cloneloanrule.domain.collection.Entries;

import org.springframework.stereotype.Service;

@Service
public class LoanActivity {
    CollectionService collectionService;

    public LoanActivity(CollectionService collectionService) {
        this.collectionService = collectionService;
    }

    public Entries 蔵書一覧(){
        return collectionService.蔵書一覧();
    }
}

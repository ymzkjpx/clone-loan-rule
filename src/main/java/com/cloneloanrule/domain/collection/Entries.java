package com.cloneloanrule.domain.collection;

import java.util.List;

public class Entries {
    List<Entry> list;

    @Deprecated(since = "MyBatis")
    Entries() {
    }

    private Entries(List<Entry> list) {
        this.list = list;
    }

    public static Entries of(List<Entry> other) {
        return new Entries(other);
    }

    public List<Entry> asList() {
        return list;
    }

    @Override
    public String toString() {
        return "Entries{" +
                "list=" + list +
                '}';
    }
}

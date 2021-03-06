package com.mwj.model;

import java.util.Set;

public class TbSort {
    private long id;
    private String name;
    private Set<TbBooks> books;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbSort tbSort = (TbSort) o;

        if (id != tbSort.id) return false;
        if (name != null ? !name.equals(tbSort.name) : tbSort.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public Set<TbBooks> getBooks() {
        return books;
    }

    public void setBooks(Set<TbBooks> books) {
        this.books = books;
    }
}

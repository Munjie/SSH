package com.mwj.model;
import java.util.Date;

public class TbBooks {
    private long id;
    private String name;
    private String author;
    private Date buytime;
    private TbSort sort;

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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getBuytime() {
        return buytime;
    }

    public void setBuytime(Date buytime) {
        this.buytime = buytime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbBooks tbBooks = (TbBooks) o;

        if (id != tbBooks.id) return false;
        if (name != null ? !name.equals(tbBooks.name) : tbBooks.name != null) return false;
        if (author != null ? !author.equals(tbBooks.author) : tbBooks.author != null) return false;
        if (buytime != null ? !buytime.equals(tbBooks.buytime) : tbBooks.buytime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (buytime != null ? buytime.hashCode() : 0);
        return result;
    }

    public TbSort getSort() {
        return sort;
    }

    public void setSort(TbSort sort) {
        this.sort = sort;
    }
}

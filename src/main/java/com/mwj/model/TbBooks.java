package com.mwj.model;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "TB_BOOKS", schema = "SCOTT", catalog = "")
public class TbBooks {
    private long id;
    private String name;
    private String author;
    private Time buytime;
    private TbSort sort;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME", nullable = true, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "AUTHOR", nullable = true, length = 50)
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "BUYTIME", nullable = true)
    public Time getBuytime() {
        return buytime;
    }

    public void setBuytime(Time buytime) {
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

    @ManyToOne
    @JoinColumn(name = "ID", referencedColumnName = "ID", nullable = false)
    public TbSort getSort() {
        return sort;
    }

    public void setSort(TbSort sort) {
        this.sort = sort;
    }
}

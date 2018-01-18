package com.mwj.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TB_BOOKS", schema = "SCOTT", catalog = "")
public class TbBooks {
    private long id;
    private String name;
    private String author;
    private Date buyDate;
    private TbSort sort;
    private Object buytime;

    public Object getBuytime() {
        return buytime;
    }

    public void setBuytime(Object buytime) {
        this.buytime = buytime;
    }

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
    @Column(name = "BUYDate", nullable = true)
    public Date getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbBooks tbBooks = (TbBooks) o;

        if (id != tbBooks.id) return false;
        if (name != null ? !name.equals(tbBooks.name) : tbBooks.name != null) return false;
        if (author != null ? !author.equals(tbBooks.author) : tbBooks.author != null) return false;
        if (buyDate != null ? !buyDate.equals(tbBooks.buyDate) : tbBooks.buyDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (buyDate != null ? buyDate.hashCode() : 0);
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

    public TbBooks() {
    }

    public TbBooks(long id, String name, String author, Date buyDate, TbSort sort) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.buyDate = buyDate;
        this.sort = sort;
    }
}

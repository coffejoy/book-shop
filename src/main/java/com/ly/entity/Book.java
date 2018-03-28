package com.ly.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * <p>  </p>
 *
 * @author ly
 * @since 2018/3/28
 */
@Table(name = "t_book")
@Entity
public class Book {

    @Id
    @Column(columnDefinition = "bigint")
    private Long bookId;
    private String bookName;
    private String bookAuthor;
    private int bookPrice;
    private int bookDiscount;
    private int currPrice;
    private Date bookPublishTime;
    private String bookImg;

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public int getBookDiscount() {
        return bookDiscount;
    }

    public void setBookDiscount(int bookDiscount) {
        this.bookDiscount = bookDiscount;
    }

    public int getCurrPrice() {
        return currPrice;
    }

    public void setCurrPrice(int currPrice) {
        this.currPrice = currPrice;
    }

    public Date getBookPublishTime() {
        return bookPublishTime;
    }

    public void setBookPublishTime(Date bookPublishTime) {
        this.bookPublishTime = bookPublishTime;
    }

    public String getBookImg() {
        return bookImg;
    }

    public void setBookImg(String bookImg) {
        this.bookImg = bookImg;
    }
}

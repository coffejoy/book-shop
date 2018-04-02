package com.ly.dto;

import java.util.Date;

/**
 * <p>  </p>
 *
 * @author ly
 * @since 2018/4/2
 */
public class BookDto {

    private String bookName;
    private String bookAuthor;
    private Double bookPrice;
    private Double bookDiscount;
    private Double bookCurrprice;
    private Date bookPublishTime;
    private String bookImg;
    private Integer cateId;

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

    public Double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public Double getBookDiscount() {
        return bookDiscount;
    }

    public void setBookDiscount(Double bookDiscount) {
        this.bookDiscount = bookDiscount;
    }

    public Double getBookCurrprice() {
        return bookCurrprice;
    }

    public void setBookCurrprice(Double bookCurrprice) {
        this.bookCurrprice = bookCurrprice;
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

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }
}

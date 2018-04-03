package com.ly.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * <p>  </p>
 *
 * @author ly
 * @since 2018/3/28
 */
@Table(name = "t_book")
@Entity
public class BookEntity {

    @Id
    @Column(columnDefinition = "bigInteger")
    @GeneratedValue
    private Long bookId;
    private String bookName;
    private String bookAuthor;
    private Double bookPrice;
    private Double bookDiscount;
    private Double bookCurrprice;
    private Date bookPublishTime;
    private String bookImg;
    private Integer cateId;
    private Integer status;//图书状态   0未上架 、1 可以购买 、2、已下架
    private Date createTime;
    private Date updateTime;

    public Integer getCateId() {
        return cateId;
    }
    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}

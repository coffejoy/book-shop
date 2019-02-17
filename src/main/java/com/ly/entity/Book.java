package com.ly.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author xigua
 * @since 2019-02-16
 */
@TableName("t_book")
public class Book extends Model<Book> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "book_id", type = IdType.AUTO)
    private Long bookId;
    private String bookName;
    private String bookAuthor;
    private Double bookPrice;
    private Double bookDiscount;
    private Double bookCurrprice;
    private Date bookPublishTime;
    private String bookImg;
    private Integer cateId;
    private Integer status;
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;


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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getBookPublishTime() {
        return bookPublishTime;
    }

    public void setBookPublishTime(Date bookPublishTime) {
        this.bookPublishTime = bookPublishTime;
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

    @Override
    protected Serializable pkVal() {
        return this.bookId;
    }

    @Override
    public String toString() {
        return "Book{" +
        ", bookId=" + bookId +
        ", bookName=" + bookName +
        ", bookAuthor=" + bookAuthor +
        ", bookPrice=" + bookPrice +
        ", bookDiscount=" + bookDiscount +
        ", bookCurrprice=" + bookCurrprice +
        ", bookPublishTime=" + bookPublishTime +
        ", bookImg=" + bookImg +
        ", cateId=" + cateId +
        ", status=" + status +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}

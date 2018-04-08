package com.ly.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>  </p>
 *
 * @author ly
 * @since 2018/3/28
 */
@Table(name="t_order_item")
@Entity
public class OrderItemEntity {

    @Id
    @GeneratedValue
    private Long id;
    private Long bookId;
    private String orderId;
    private Integer quantity;
    private Double bookPrice;
    private String bookName;
    private Double bookCurrprice;
    private Double bookTotalPrice;
    private Date createTime;
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public Double getBookCurrprice() {
        return bookCurrprice;
    }

    public void setBookCurrprice(Double bookCurrprice) {
        this.bookCurrprice = bookCurrprice;
    }

    public Double getBookTotalPrice() {
        return bookTotalPrice;
    }

    public void setBookTotalPrice(Double bookTotalPrice) {
        this.bookTotalPrice = bookTotalPrice;
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

}

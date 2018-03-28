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
@Table(name="t_order_item")
@Entity
public class OrderItem {

    @Id
    @Column(columnDefinition = "bigint")
    private Long bookId;
    @Id
    @Column(columnDefinition = "bigint")
    private Long orderId;
    private int quantity;
    private int bookPrice;
    private String bookName;
    private int bookcurrprice;
    private int bookTotalPrice;
    private Date createTime;
    private Date updateTime;

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookcurrprice() {
        return bookcurrprice;
    }

    public void setBookcurrprice(int bookcurrprice) {
        this.bookcurrprice = bookcurrprice;
    }

    public int getBookTotalPrice() {
        return bookTotalPrice;
    }

    public void setBookTotalPrice(int bookTotalPrice) {
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

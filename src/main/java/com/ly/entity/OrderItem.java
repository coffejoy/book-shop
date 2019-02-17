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
@TableName("t_order_item")
public class OrderItem extends Model<OrderItem> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String orderId;
    private Long bookId;
    private Integer quantity;
    private Double bookPrice;
    private String bookName;
    private Double bookCurrprice;
    private Double bookTotalPrice;
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
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

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
        ", id=" + id +
        ", orderId=" + orderId +
        ", bookId=" + bookId +
        ", quantity=" + quantity +
        ", bookPrice=" + bookPrice +
        ", bookName=" + bookName +
        ", bookCurrprice=" + bookCurrprice +
        ", bookTotalPrice=" + bookTotalPrice +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}

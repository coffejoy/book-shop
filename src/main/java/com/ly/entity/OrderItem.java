package com.ly.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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
public class OrderItem {

    @Id
    private Long bookId;
    @Id
    private Long orderId;
    private Integer quantity;
    private Integer bookPrice;
    private String bookName;
    private Integer bookCurrprice;
    private Integer bookTotalPrice;
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Integer bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getBookCurrprice() {
        return bookCurrprice;
    }

    public void setBookCurrprice(Integer bookCurrprice) {
        this.bookCurrprice = bookCurrprice;
    }

    public Integer getBookTotalPrice() {
        return bookTotalPrice;
    }

    public void setBookTotalPrice(Integer bookTotalPrice) {
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
    public static class RelationPK implements Serializable {

        private static final long serialVersionUID = -7189167162738318201L;
        @Column(length = 12, nullable = false)
        private Long orderId;
        @Column(length = 12, nullable = false)
        private Long bookId;

        public RelationPK() {
        }

        public RelationPK(Long bookId, Long orderId) {
            this.bookId = bookId;
            this.orderId = orderId;
        }


        public Long getbookId() {
            return bookId;
        }

        public void setbookId(long bookId) {
            this.bookId = bookId;
        }

        public Long getorderId() {
            return orderId;
        }

        public void setorderId(Long orderId) {
            this.orderId = orderId;
        }

        @Override
        public int hashCode() {
            final Integer prime = 31;
            Integer result = 1;
            result = prime * result + ((bookId == null) ? 0 : bookId.hashCode());
            result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            OrderItem.RelationPK other = (OrderItem.RelationPK) obj;
            if (bookId == null) {
                if (other.bookId != null)
                    return false;
            } else if (!bookId.equals(other.bookId))
                return false;
            if (orderId == null) {
                if (other.orderId != null)
                    return false;
            } else if (!orderId.equals(other.orderId))
                return false;
            return true;
        }
    }

}

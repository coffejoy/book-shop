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
@Table(name = "t_order")
@Entity
@IdClass(Order.RelationPK.class)
public class Order {

    @Id
    @Column(columnDefinition = "bigInteger")
    private Long userId;
    @Id
    @Column(columnDefinition = "bigInteger")
    private Long orderId;
    private String userAddress;
    private Date orderTime;
    private Integer status;
    private Integer totalPrice;
    private Date createTime;
    private Date updateTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
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
            RelationPK other = (RelationPK) obj;
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

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
@Table(name = "t_car")
@Entity
@IdClass(CarEntity.RelationPK.class)
public class CarEntity {
    @Id
    @GeneratedValue
    private Integer carId;
    @Id
    private Long bookId;
    @Id
    private Long userId;
    private Integer quantity;
    private Date createTime;
    private Date updateTime;

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

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public static class RelationPK implements Serializable {

        private static final long serialVersionUID = -7189167162738318201L;
        @Column(length = 12, nullable = false)
        private Integer carId;
        @Column(length = 12, nullable = false)
        private Long bookId;
        @Column(length = 12, nullable = false)
        private Long userId;


        public RelationPK() {
        }

        public RelationPK(Long bookId, Long UserId,Integer carId) {
            this.bookId = bookId;
            this.userId = userId;
            this.carId = carId;
        }

        public Integer getCarId() {
            return carId;
        }

        public void setCarId(Integer carId) {
            this.carId = carId;
        }

        public Long getbookId() {
            return bookId;
        }

        public void setbookId(long bookId) {
            this.bookId = bookId;
        }

        public Long getuserId() {
            return userId;
        }

        public void setuserId(Long userId) {
            this.userId = userId;
        }

        @Override
        public int hashCode() {
            final Integer prime = 31;
            Integer result = 1;
            result = prime * result + ((bookId == null) ? 0 : bookId.hashCode());
            result = prime * result + ((userId == null) ? 0 : userId.hashCode());
            result = prime * result + ((carId == null) ? 0 : carId.hashCode());
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
            CarEntity.RelationPK other = (CarEntity.RelationPK) obj;
            if (bookId == null) {
                if (other.bookId != null)
                    return false;
            } else if (!bookId.equals(other.bookId))
                return false;
            if (userId == null) {
                if (other.userId != null)
                    return false;
            } else if (!userId.equals(other.userId))
                return false;
            if (carId == null) {
                if (other.carId != null)
                    return false;
            } else if (!carId.equals(other.carId))
                return false;
            return true;
        }
    }

}



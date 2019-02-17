package com.ly.dto;

/**
 * <p>  </p>
 *
 * @author ly
 * @since 2018/4/2
 */
public class CarDto {

    private Long bookId;
    private Long userId;
    private Integer quantity;

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
}

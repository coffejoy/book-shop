package com.ly.vo;

/**
 * <p>  </p>
 *
 * @author ly
 * @since 2018/4/5
 */
public class CarVo {

    private Long bookId;
    private Long userId;
    private Integer carId;
    private Integer quantity;
    private String bookName;
    private double bookCurrprice;
    private double bookPrice;
    private double bookDiscount;
    private String bookImg;

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

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
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

    public double getBookCurrprice() {
        return bookCurrprice;
    }

    public void setBookCurrprice(double bookCurrprice) {
        this.bookCurrprice = bookCurrprice;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public double getBookDiscount() {
        return bookDiscount;
    }

    public void setBookDiscount(double bookDiscount) {
        this.bookDiscount = bookDiscount;
    }

    public String getBookImg() {
        return bookImg;
    }

    public void setBookImg(String bookImg) {
        this.bookImg = bookImg;
    }
}

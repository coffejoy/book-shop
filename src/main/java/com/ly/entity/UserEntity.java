package com.ly.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * <p>  </p>
 *
 * @author ly
 * @since 2018/3/28
 */
@Table(name="t_user")
@Entity
public class UserEntity {

    @Id
    @Column(columnDefinition = "bigInteger")
    @GeneratedValue
    private Long userId;//用户id
    private String userName;//用户名
    private Integer userPassword;//用户密码
    private String userAddress;//用户地址
    private Integer status;//状态：0表示未激活，1表示已激活
    private String activeCode;//激活码，它是唯一值！即每个用户的激活码是不同的！
    private Date createTime;
    private Date updateTime;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getActiveCode() {
        return activeCode;
    }

    public void setActiveCode(String activeCode) {
        this.activeCode = activeCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Integer getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(Integer userPassword) {
        this.userPassword = userPassword;
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

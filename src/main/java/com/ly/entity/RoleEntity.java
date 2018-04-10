package com.ly.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * <p>
 * title
 * </p>
 *
 * @author Michael Fang
 * @since 2018-04-10
 */
public class RoleEntity {

    /**
     * id  数据库自增长
     */
    @Id
    @GeneratedValue
    private Integer id;

    /**
     * 角色名
     */
    private String roleName;

    /**
     * 对角色名的描述
     */
    private String description;

    /**
     * 对应的用户
     */
    @ManyToMany
    @JoinTable(name = "t_user_role",
            joinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")})
    private Set<UserEntity> users = new HashSet<>();

    /**
     * 对应的权限
     */
    @ManyToMany
    @JoinTable(name = "t_role_authority",
            joinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "authority_id", referencedColumnName = "id")})
    private Set<AuthorityEntity> authority = new HashSet<>();

    /**
     * 创建时间
     */
    @Column(updatable = false)
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<UserEntity> getUsers() {
        return users;
    }

    public void setUsers(Set<UserEntity> users) {
        this.users = users;
    }

    public Set<AuthorityEntity> getAuthority() {
        return authority;
    }

    public void setAuthority(Set<AuthorityEntity> authority) {
        this.authority = authority;
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

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
public class AuthorityEntity {

    /**
     * id  数据库自增长
     */
    @Id
    @GeneratedValue
    private Integer id;

    /**
     * 权限url
     */
    private String url;

    /**
     * 对url的描述
     */
    private String description;

    /**
     * 对应的角色
     */
    @ManyToMany
    @JoinTable(name = "t_role_authority",
            joinColumns = {@JoinColumn(name = "authority_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")})
    private Set<RoleEntity> roles = new HashSet<>();

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<RoleEntity> getRoles() {
        return roles;
    }

    public void setRoles(Set<RoleEntity> roles) {
        this.roles = roles;
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

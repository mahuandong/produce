package com.fabricate.produce.entity;

import java.io.Serializable;

/**
 * 员工表
 */
public class User implements Serializable {
    /**
    * 员工id
    */
    private Integer userId;

    /**
    * 账号
    */
    private String account;

    /**
    * 员工姓名
    */
    private String userName;

    /**
    * 密码
    */
    private String password;

    /**
    * 角色
    */
    private String role;

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
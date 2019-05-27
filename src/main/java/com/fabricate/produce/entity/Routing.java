package com.fabricate.produce.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 工艺路线表
 */
public class Routing implements Serializable {
    /**
    * 工艺路线编码
    */
    private Integer routingId;

    /**
    * 工艺路线名称
    */
    private String routingName;

    /**
    * 员工编码
    */
    private Integer userId;

    /**
    * 开始时间
    */
    private Date rStartTime;

    /**
    * 结束时间
    */
    private Date rEndTime;

    /**
    * 产线名称
    */
    private String productionLine;

    private User user;

    private static final long serialVersionUID = 1L;

    public Integer getRoutingId() {
        return routingId;
    }

    public void setRoutingId(Integer routingId) {
        this.routingId = routingId;
    }

    public String getRoutingName() {
        return routingName;
    }

    public void setRoutingName(String routingName) {
        this.routingName = routingName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getrStartTime() {
        return rStartTime;
    }

    public void setrStartTime(Date rStartTime) {
        this.rStartTime = rStartTime;
    }

    public Date getrEndTime() {
        return rEndTime;
    }

    public void setrEndTime(Date rEndTime) {
        this.rEndTime = rEndTime;
    }

    public String getProductionLine() {
        return productionLine;
    }

    public void setProductionLine(String productionLine) {
        this.productionLine = productionLine;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
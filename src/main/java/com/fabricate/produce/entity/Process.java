package com.fabricate.produce.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 工序表
 */
public class Process implements Serializable {
    /**
    * 工序编码
    */
    private Integer processId;

    /**
    * 工序名称
    */
    private String processName;

    /**
    * 创建人编码
    */
    private Integer userId;

    /**
    * 创建时间
    */
    private Date startTime;

    /**
    * 工艺路线编码
    */
    private String routingId;

    private User user;

    private Routing routing;

    private static final long serialVersionUID = 1L;

    public Integer getProcessId() {
        return processId;
    }

    public void setProcessId(Integer processId) {
        this.processId = processId;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getRoutingId() {
        return routingId;
    }

    public void setRoutingId(String routingId) {
        this.routingId = routingId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Routing getRouting() {
        return routing;
    }

    public void setRouting(Routing routing) {
        this.routing = routing;
    }
}
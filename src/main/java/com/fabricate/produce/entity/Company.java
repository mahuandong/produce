package com.fabricate.produce.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 企业表
 */
public class Company implements Serializable {
    /**
    * 企业模型编码
    */
    private Integer companyId;

    /**
    * 企业名称
    */
    private String companyName;

    /**
    * 车间名称
    */
    private String workshopName;

    /**
    * 产线名称
    */
    private String productionLine;

    /**
    * 开始时间
    */
    private Date cStartTime;

    /**
    * 结束时间
    */
    private Date cEndTime;

    /**
    * 员工编码
    */
    private Integer userId;

    private static final long serialVersionUID = 1L;

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getWorkshopName() {
        return workshopName;
    }

    public void setWorkshopName(String workshopName) {
        this.workshopName = workshopName;
    }

    public String getProductionLine() {
        return productionLine;
    }

    public void setProductionLine(String productionLine) {
        this.productionLine = productionLine;
    }

    public Date getcStartTime() {
        return cStartTime;
    }

    public void setcStartTime(Date cStartTime) {
        this.cStartTime = cStartTime;
    }

    public Date getcEndTime() {
        return cEndTime;
    }

    public void setcEndTime(Date cEndTime) {
        this.cEndTime = cEndTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
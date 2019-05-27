package com.fabricate.produce.entity;

import java.io.Serializable;

/**
 * 生产条码表
 */
public class Barcode implements Serializable {
    /**
    * 条码编号
    */
    private String barcodeId;

    /**
    * 数量
    */
    private Integer quantity;

    /**
    * 工单编号
    */
    private Integer ordersId;

    /**
    * 条码状态
    */
    private Integer status;

    /**
    * 用户编码
    */
    private Integer userId;

    private static final long serialVersionUID = 1L;

    public String getBarcodeId() {
        return barcodeId;
    }

    public void setBarcodeId(String barcodeId) {
        this.barcodeId = barcodeId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
package com.fabricate.produce.entity;

import java.io.Serializable;

/**
 * 配送表
 */
public class Delivery implements Serializable {
    /**
    * 配送单编码
    */
    private Integer deliveryId;

    /**
    * 物料编码
    */
    private Integer materileId;

    /**
    * 工单编码
    */
    private Integer ordersId;

    /**
    * 单位
    */
    private String unit;

    /**
    * 发货数量
    */
    private Integer dQuantity;

    private static final long serialVersionUID = 1L;

    public Integer getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Integer deliveryId) {
        this.deliveryId = deliveryId;
    }

    public Integer getMaterileId() {
        return materileId;
    }

    public void setMaterileId(Integer materileId) {
        this.materileId = materileId;
    }

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getdQuantity() {
        return dQuantity;
    }

    public void setdQuantity(Integer dQuantity) {
        this.dQuantity = dQuantity;
    }
}
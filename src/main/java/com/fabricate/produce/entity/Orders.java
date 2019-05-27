package com.fabricate.produce.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 工单表
 */
public class Orders implements Serializable {
    /**
    * 工单编码
    */
    private Integer orderId;

    /**
    * 工单类型
    */
    private String orderType;

    /**
    * 车间名称
    */
    private String workshopName;

    /**
    * 产线名称
    */
    private String productionLine;

    /**
    * 物料编码
    */
    private Integer materielId;

    /**
    * 计划数量
    */
    private Integer plannedQuantity;

    /**
    * 订单数量
    */
    private Integer orderQuantuty;

    /**
    * 计划开始时间
    */
    private Date oStartTime;

    /**
    * 计划结束时间
    */
    private Date oEndTime;

    /**
    * 工艺路线编码
    */
    private Integer routingId;

    private static final long serialVersionUID = 1L;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
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

    public Integer getMaterielId() {
        return materielId;
    }

    public void setMaterielId(Integer materielId) {
        this.materielId = materielId;
    }

    public Integer getPlannedQuantity() {
        return plannedQuantity;
    }

    public void setPlannedQuantity(Integer plannedQuantity) {
        this.plannedQuantity = plannedQuantity;
    }

    public Integer getOrderQuantuty() {
        return orderQuantuty;
    }

    public void setOrderQuantuty(Integer orderQuantuty) {
        this.orderQuantuty = orderQuantuty;
    }

    public Date getoStartTime() {
        return oStartTime;
    }

    public void setoStartTime(Date oStartTime) {
        this.oStartTime = oStartTime;
    }

    public Date getoEndTime() {
        return oEndTime;
    }

    public void setoEndTime(Date oEndTime) {
        this.oEndTime = oEndTime;
    }

    public Integer getRoutingId() {
        return routingId;
    }

    public void setRoutingId(Integer routingId) {
        this.routingId = routingId;
    }
}
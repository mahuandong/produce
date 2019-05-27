package com.fabricate.produce.entity;

import java.io.Serializable;

/**
 * 装配表
 */
public class Assembly implements Serializable {
    /**
    * 配送单id
    */
    private Integer assemblyId;

    /**
    * 物料id
    */
    private Integer materileId;

    /**
    * 需求数量
    */
    private Integer demandQuantity;

    /**
    * 已扫数量
    */
    private Integer sweepedQuantity;

    /**
    * 剩余数量
    */
    private Integer remainingQuantity;

    private static final long serialVersionUID = 1L;

    public Integer getAssemblyId() {
        return assemblyId;
    }

    public void setAssemblyId(Integer assemblyId) {
        this.assemblyId = assemblyId;
    }

    public Integer getMaterileId() {
        return materileId;
    }

    public void setMaterileId(Integer materileId) {
        this.materileId = materileId;
    }

    public Integer getDemandQuantity() {
        return demandQuantity;
    }

    public void setDemandQuantity(Integer demandQuantity) {
        this.demandQuantity = demandQuantity;
    }

    public Integer getSweepedQuantity() {
        return sweepedQuantity;
    }

    public void setSweepedQuantity(Integer sweepedQuantity) {
        this.sweepedQuantity = sweepedQuantity;
    }

    public Integer getRemainingQuantity() {
        return remainingQuantity;
    }

    public void setRemainingQuantity(Integer remainingQuantity) {
        this.remainingQuantity = remainingQuantity;
    }
}
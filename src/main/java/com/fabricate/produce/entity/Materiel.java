package com.fabricate.produce.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 物料表
 */
public class Materiel implements Serializable {
    /**
    * 物料编码
    */
    private Integer materielId;

    /**
    * 物料名称
    */
    private String materielName;

    /**
    * 基本计量单位
    */
    private String unit;

    /**
    * 基本分类
    */
    private String classification;

    /**
    * 来源
    */
    private String source;

    /**
    * 更新时间
    */
    private Date mUpdateTime;

    /**
    * 单位耗用量
    */
    private String uconsumptio;

    private static final long serialVersionUID = 1L;

    public Integer getMaterielId() {
        return materielId;
    }

    public void setMaterielId(Integer materielId) {
        this.materielId = materielId;
    }

    public String getMaterielName() {
        return materielName;
    }

    public void setMaterielName(String materielName) {
        this.materielName = materielName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Date getmUpdateTime() {
        return mUpdateTime;
    }

    public void setmUpdateTime(Date mUpdateTime) {
        this.mUpdateTime = mUpdateTime;
    }

    public String getUconsumptio() {
        return uconsumptio;
    }

    public void setUconsumptio(String uconsumptio) {
        this.uconsumptio = uconsumptio;
    }
}
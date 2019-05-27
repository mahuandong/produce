package com.fabricate.produce.entity;

import java.io.Serializable;

/**
 * 检验采集表
 */
public class Examine implements Serializable {
    private Integer examineId;

    private String barcodeId;

    private Integer collectionResult;

    private static final long serialVersionUID = 1L;

    public Integer getExamineId() {
        return examineId;
    }

    public void setExamineId(Integer examineId) {
        this.examineId = examineId;
    }

    public String getBarcodeId() {
        return barcodeId;
    }

    public void setBarcodeId(String barcodeId) {
        this.barcodeId = barcodeId;
    }

    public Integer getCollectionResult() {
        return collectionResult;
    }

    public void setCollectionResult(Integer collectionResult) {
        this.collectionResult = collectionResult;
    }
}
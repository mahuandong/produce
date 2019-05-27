package com.fabricate.produce.entity;

import java.io.Serializable;

/**
 * 包装表
 */
public class Package implements Serializable {
    /**
    * 包装编码
    */
    private Integer packageId;

    /**
    * 生产条码
    */
    private String barcodeId;

    /**
    * 采集结果
    */
    private Integer collectionResult;

    private static final long serialVersionUID = 1L;

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
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
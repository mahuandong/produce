package com.fabricate.produce.entity;

import java.io.Serializable;

/**
 * 上料表
 */
public class Feeding implements Serializable {
    private Integer feedingId;

    private String barcodeId;

    private Integer collectionResult;

    private static final long serialVersionUID = 1L;

    public Integer getFeedingId() {
        return feedingId;
    }

    public void setFeedingId(Integer feedingId) {
        this.feedingId = feedingId;
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
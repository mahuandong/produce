package com.fabricate.produce.entity;

import java.io.Serializable;

/**
 * 工位表
 */
public class Station implements Serializable {
    /**
    * 工位编码
    */
    private Integer stationId;

    /**
    * 工位名称
    */
    private String stationName;

    /**
    * 工序名称
    */
    private Integer processId;

    /**
    * 产线名称
    */
    private String productionLine;

    private static final long serialVersionUID = 1L;

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public Integer getProcessId() {
        return processId;
    }

    public void setProcessId(Integer processId) {
        this.processId = processId;
    }

    public String getProductionLine() {
        return productionLine;
    }

    public void setProductionLine(String productionLine) {
        this.productionLine = productionLine;
    }
}
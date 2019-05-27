package com.fabricate.produce.mapper;

import com.fabricate.produce.entity.Barcode;

public interface BarcodeMapper {
    int deleteByPrimaryKey(String barcodeId);

    int insert(Barcode record);

    int insertSelective(Barcode record);

    Barcode selectByPrimaryKey(String barcodeId);

    int updateByPrimaryKeySelective(Barcode record);

    int updateByPrimaryKey(Barcode record);
}
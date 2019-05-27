package com.fabricate.produce.service;

import com.fabricate.produce.entity.Delivery;
public interface DeliveryService{


    int deleteByPrimaryKey(Integer deliveryId);

    int insert(Delivery record);

    int insertSelective(Delivery record);

    Delivery selectByPrimaryKey(Integer deliveryId);

    int updateByPrimaryKeySelective(Delivery record);

    int updateByPrimaryKey(Delivery record);

}

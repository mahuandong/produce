package com.fabricate.produce.service;

import com.fabricate.produce.entity.Orders;
public interface OrdersService{


    int deleteByPrimaryKey(Integer orderId);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);

}

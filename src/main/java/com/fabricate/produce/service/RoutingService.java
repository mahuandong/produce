package com.fabricate.produce.service;

import com.fabricate.produce.entity.Routing;
public interface RoutingService{


    int deleteByPrimaryKey(Integer routingId);

    int insert(Routing record);

    int insertSelective(Routing record);

    Routing selectByPrimaryKey(Integer routingId);

    int updateByPrimaryKeySelective(Routing record);

    int updateByPrimaryKey(Routing record);

}

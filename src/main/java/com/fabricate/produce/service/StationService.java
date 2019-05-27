package com.fabricate.produce.service;

import com.fabricate.produce.entity.Station;
public interface StationService{


    int deleteByPrimaryKey(Integer stationId);

    int insert(Station record);

    int insertSelective(Station record);

    Station selectByPrimaryKey(Integer stationId);

    int updateByPrimaryKeySelective(Station record);

    int updateByPrimaryKey(Station record);

}

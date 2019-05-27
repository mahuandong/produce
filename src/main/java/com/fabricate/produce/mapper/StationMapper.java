package com.fabricate.produce.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.fabricate.produce.entity.Station;

public interface StationMapper {
    int deleteByPrimaryKey(Integer stationId);

    int insert(Station record);

    int insertSelective(Station record);

    Station selectByPrimaryKey(Integer stationId);

    int updateByPrimaryKeySelective(Station record);

    int updateByPrimaryKey(Station record);

    List<Station> findAll();


}
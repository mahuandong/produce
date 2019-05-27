package com.fabricate.produce.mapper;

import com.fabricate.produce.entity.Feeding;

public interface FeedingMapper {
    int deleteByPrimaryKey(Integer feedingId);

    int insert(Feeding record);

    int insertSelective(Feeding record);

    Feeding selectByPrimaryKey(Integer feedingId);

    int updateByPrimaryKeySelective(Feeding record);

    int updateByPrimaryKey(Feeding record);
}
package com.fabricate.produce.service;

import com.fabricate.produce.entity.Feeding;
public interface FeedingService{


    int deleteByPrimaryKey(Integer feedingId);

    int insert(Feeding record);

    int insertSelective(Feeding record);

    Feeding selectByPrimaryKey(Integer feedingId);

    int updateByPrimaryKeySelective(Feeding record);

    int updateByPrimaryKey(Feeding record);

}

package com.fabricate.produce.mapper;

import com.fabricate.produce.entity.Examine;

public interface ExamineMapper {
    int deleteByPrimaryKey(Integer examineId);

    int insert(Examine record);

    int insertSelective(Examine record);

    Examine selectByPrimaryKey(Integer examineId);

    int updateByPrimaryKeySelective(Examine record);

    int updateByPrimaryKey(Examine record);
}
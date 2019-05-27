package com.fabricate.produce.mapper;

import com.fabricate.produce.entity.Assembly;

public interface AssemblyMapper {
    int deleteByPrimaryKey(Integer assemblyId);

    int insert(Assembly record);

    int insertSelective(Assembly record);

    Assembly selectByPrimaryKey(Integer assemblyId);

    int updateByPrimaryKeySelective(Assembly record);

    int updateByPrimaryKey(Assembly record);
}
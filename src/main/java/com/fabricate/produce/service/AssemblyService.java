package com.fabricate.produce.service;

import com.fabricate.produce.entity.Assembly;
public interface AssemblyService{


    int deleteByPrimaryKey(Integer assemblyId);

    int insert(Assembly record);

    int insertSelective(Assembly record);

    Assembly selectByPrimaryKey(Integer assemblyId);

    int updateByPrimaryKeySelective(Assembly record);

    int updateByPrimaryKey(Assembly record);

}

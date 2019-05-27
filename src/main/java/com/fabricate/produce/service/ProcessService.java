package com.fabricate.produce.service;

import com.fabricate.produce.entity.Process;
public interface ProcessService{


    int deleteByPrimaryKey(Integer processId);

    int insert(Process record);

    int insertSelective(Process record);

    Process selectByPrimaryKey(Integer processId);

    int updateByPrimaryKeySelective(Process record);

    int updateByPrimaryKey(Process record);

}

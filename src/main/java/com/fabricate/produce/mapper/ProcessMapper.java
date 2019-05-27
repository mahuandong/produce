package com.fabricate.produce.mapper;

import com.fabricate.produce.entity.Process;

import java.util.List;

public interface ProcessMapper {
    int deleteByPrimaryKey(Integer processId);

    int insert(Process record);

    int insertSelective(Process record);

    Process selectByPrimaryKey(Integer processId);

    int updateByPrimaryKeySelective(Process record);

    int updateByPrimaryKey(Process record);

    List<Process> findAll();
}
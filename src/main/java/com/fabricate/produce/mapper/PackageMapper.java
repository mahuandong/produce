package com.fabricate.produce.mapper;

import com.fabricate.produce.entity.Package;

public interface PackageMapper {
    int deleteByPrimaryKey(Integer packageId);

    int insert(Package record);

    int insertSelective(Package record);

    Package selectByPrimaryKey(Integer packageId);

    int updateByPrimaryKeySelective(Package record);

    int updateByPrimaryKey(Package record);
}
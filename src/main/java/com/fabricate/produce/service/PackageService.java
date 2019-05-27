package com.fabricate.produce.service;

import com.fabricate.produce.entity.Package;
public interface PackageService{


    int deleteByPrimaryKey(Integer packageId);

    int insert(Package record);

    int insertSelective(Package record);

    Package selectByPrimaryKey(Integer packageId);

    int updateByPrimaryKeySelective(Package record);

    int updateByPrimaryKey(Package record);

}

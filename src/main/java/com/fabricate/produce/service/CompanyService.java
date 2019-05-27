package com.fabricate.produce.service;

import com.fabricate.produce.entity.Company;
public interface CompanyService{


    int deleteByPrimaryKey(Integer companyId);

    int insert(Company record);

    int insertSelective(Company record);

    Company selectByPrimaryKey(Integer companyId);

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKey(Company record);

}

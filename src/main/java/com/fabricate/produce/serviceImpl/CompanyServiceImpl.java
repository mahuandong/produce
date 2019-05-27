package com.fabricate.produce.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.fabricate.produce.entity.Company;
import com.fabricate.produce.mapper.CompanyMapper;
import com.fabricate.produce.service.CompanyService;
@Service
public class CompanyServiceImpl implements CompanyService{

    @Resource
    private CompanyMapper companyMapper;

    @Override
    public int deleteByPrimaryKey(Integer companyId) {
        return companyMapper.deleteByPrimaryKey(companyId);
    }

    @Override
    public int insert(Company record) {
        return companyMapper.insert(record);
    }

    @Override
    public int insertSelective(Company record) {
        return companyMapper.insertSelective(record);
    }

    @Override
    public Company selectByPrimaryKey(Integer companyId) {
        return companyMapper.selectByPrimaryKey(companyId);
    }

    @Override
    public int updateByPrimaryKeySelective(Company record) {
        return companyMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Company record) {
        return companyMapper.updateByPrimaryKey(record);
    }

}

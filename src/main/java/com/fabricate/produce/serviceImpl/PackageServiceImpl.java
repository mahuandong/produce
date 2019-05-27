package com.fabricate.produce.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.fabricate.produce.entity.Package;
import com.fabricate.produce.mapper.PackageMapper;
import com.fabricate.produce.service.PackageService;
@Service
public class PackageServiceImpl implements PackageService{

    @Resource
    private PackageMapper packageMapper;

    @Override
    public int deleteByPrimaryKey(Integer packageId) {
        return packageMapper.deleteByPrimaryKey(packageId);
    }

    @Override
    public int insert(Package record) {
        return packageMapper.insert(record);
    }

    @Override
    public int insertSelective(Package record) {
        return packageMapper.insertSelective(record);
    }

    @Override
    public Package selectByPrimaryKey(Integer packageId) {
        return packageMapper.selectByPrimaryKey(packageId);
    }

    @Override
    public int updateByPrimaryKeySelective(Package record) {
        return packageMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Package record) {
        return packageMapper.updateByPrimaryKey(record);
    }

}

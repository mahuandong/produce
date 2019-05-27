package com.fabricate.produce.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.fabricate.produce.entity.Assembly;
import com.fabricate.produce.mapper.AssemblyMapper;
import com.fabricate.produce.service.AssemblyService;
@Service
public class AssemblyServiceImpl implements AssemblyService{

    @Resource
    private AssemblyMapper assemblyMapper;

    @Override
    public int deleteByPrimaryKey(Integer assemblyId) {
        return assemblyMapper.deleteByPrimaryKey(assemblyId);
    }

    @Override
    public int insert(Assembly record) {
        return assemblyMapper.insert(record);
    }

    @Override
    public int insertSelective(Assembly record) {
        return assemblyMapper.insertSelective(record);
    }

    @Override
    public Assembly selectByPrimaryKey(Integer assemblyId) {
        return assemblyMapper.selectByPrimaryKey(assemblyId);
    }

    @Override
    public int updateByPrimaryKeySelective(Assembly record) {
        return assemblyMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Assembly record) {
        return assemblyMapper.updateByPrimaryKey(record);
    }

}

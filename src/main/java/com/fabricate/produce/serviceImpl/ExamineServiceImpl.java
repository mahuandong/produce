package com.fabricate.produce.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.fabricate.produce.entity.Examine;
import com.fabricate.produce.mapper.ExamineMapper;
import com.fabricate.produce.service.ExamineService;
@Service
public class ExamineServiceImpl implements ExamineService{

    @Resource
    private ExamineMapper examineMapper;

    @Override
    public int deleteByPrimaryKey(Integer examineId) {
        return examineMapper.deleteByPrimaryKey(examineId);
    }

    @Override
    public int insert(Examine record) {
        return examineMapper.insert(record);
    }

    @Override
    public int insertSelective(Examine record) {
        return examineMapper.insertSelective(record);
    }

    @Override
    public Examine selectByPrimaryKey(Integer examineId) {
        return examineMapper.selectByPrimaryKey(examineId);
    }

    @Override
    public int updateByPrimaryKeySelective(Examine record) {
        return examineMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Examine record) {
        return examineMapper.updateByPrimaryKey(record);
    }

}

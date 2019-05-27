package com.fabricate.produce.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.fabricate.produce.mapper.ProcessMapper;
import com.fabricate.produce.entity.Process;
import com.fabricate.produce.service.ProcessService;
@Service
public class ProcessServiceImpl implements ProcessService{

    @Resource
    private ProcessMapper processMapper;

    @Override
    public int deleteByPrimaryKey(Integer processId) {
        return processMapper.deleteByPrimaryKey(processId);
    }

    @Override
    public int insert(Process record) {
        return processMapper.insert(record);
    }

    @Override
    public int insertSelective(Process record) {
        return processMapper.insertSelective(record);
    }

    @Override
    public Process selectByPrimaryKey(Integer processId) {
        return processMapper.selectByPrimaryKey(processId);
    }

    @Override
    public int updateByPrimaryKeySelective(Process record) {
        return processMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Process record) {
        return processMapper.updateByPrimaryKey(record);
    }

}

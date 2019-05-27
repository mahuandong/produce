package com.fabricate.produce.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.fabricate.produce.entity.Feeding;
import com.fabricate.produce.mapper.FeedingMapper;
import com.fabricate.produce.service.FeedingService;
@Service
public class FeedingServiceImpl implements FeedingService{

    @Resource
    private FeedingMapper feedingMapper;

    @Override
    public int deleteByPrimaryKey(Integer feedingId) {
        return feedingMapper.deleteByPrimaryKey(feedingId);
    }

    @Override
    public int insert(Feeding record) {
        return feedingMapper.insert(record);
    }

    @Override
    public int insertSelective(Feeding record) {
        return feedingMapper.insertSelective(record);
    }

    @Override
    public Feeding selectByPrimaryKey(Integer feedingId) {
        return feedingMapper.selectByPrimaryKey(feedingId);
    }

    @Override
    public int updateByPrimaryKeySelective(Feeding record) {
        return feedingMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Feeding record) {
        return feedingMapper.updateByPrimaryKey(record);
    }

}

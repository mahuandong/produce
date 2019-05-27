package com.fabricate.produce.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.fabricate.produce.entity.Station;
import com.fabricate.produce.mapper.StationMapper;
import com.fabricate.produce.service.StationService;
@Service
public class StationServiceImpl implements StationService{

    @Resource
    private StationMapper stationMapper;

    @Override
    public int deleteByPrimaryKey(Integer stationId) {
        return stationMapper.deleteByPrimaryKey(stationId);
    }

    @Override
    public int insert(Station record) {
        return stationMapper.insert(record);
    }

    @Override
    public int insertSelective(Station record) {
        return stationMapper.insertSelective(record);
    }

    @Override
    public Station selectByPrimaryKey(Integer stationId) {
        return stationMapper.selectByPrimaryKey(stationId);
    }

    @Override
    public int updateByPrimaryKeySelective(Station record) {
        return stationMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Station record) {
        return stationMapper.updateByPrimaryKey(record);
    }

}

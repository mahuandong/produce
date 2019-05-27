package com.fabricate.produce.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.fabricate.produce.mapper.RoutingMapper;
import com.fabricate.produce.entity.Routing;
import com.fabricate.produce.service.RoutingService;
@Service
public class RoutingServiceImpl implements RoutingService{

    @Resource
    private RoutingMapper routingMapper;

    @Override
    public int deleteByPrimaryKey(Integer routingId) {
        return routingMapper.deleteByPrimaryKey(routingId);
    }

    @Override
    public int insert(Routing record) {
        return routingMapper.insert(record);
    }

    @Override
    public int insertSelective(Routing record) {
        return routingMapper.insertSelective(record);
    }

    @Override
    public Routing selectByPrimaryKey(Integer routingId) {
        return routingMapper.selectByPrimaryKey(routingId);
    }

    @Override
    public int updateByPrimaryKeySelective(Routing record) {
        return routingMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Routing record) {
        return routingMapper.updateByPrimaryKey(record);
    }

}

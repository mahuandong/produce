package com.fabricate.produce.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.fabricate.produce.mapper.DeliveryMapper;
import com.fabricate.produce.entity.Delivery;
import com.fabricate.produce.service.DeliveryService;
@Service
public class DeliveryServiceImpl implements DeliveryService{

    @Resource
    private DeliveryMapper deliveryMapper;

    @Override
    public int deleteByPrimaryKey(Integer deliveryId) {
        return deliveryMapper.deleteByPrimaryKey(deliveryId);
    }

    @Override
    public int insert(Delivery record) {
        return deliveryMapper.insert(record);
    }

    @Override
    public int insertSelective(Delivery record) {
        return deliveryMapper.insertSelective(record);
    }

    @Override
    public Delivery selectByPrimaryKey(Integer deliveryId) {
        return deliveryMapper.selectByPrimaryKey(deliveryId);
    }

    @Override
    public int updateByPrimaryKeySelective(Delivery record) {
        return deliveryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Delivery record) {
        return deliveryMapper.updateByPrimaryKey(record);
    }

}

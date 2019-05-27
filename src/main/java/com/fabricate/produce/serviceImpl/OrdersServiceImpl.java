package com.fabricate.produce.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.fabricate.produce.mapper.OrdersMapper;
import com.fabricate.produce.entity.Orders;
import com.fabricate.produce.service.OrdersService;
@Service
public class OrdersServiceImpl implements OrdersService{

    @Resource
    private OrdersMapper ordersMapper;

    @Override
    public int deleteByPrimaryKey(Integer orderId) {
        return ordersMapper.deleteByPrimaryKey(orderId);
    }

    @Override
    public int insert(Orders record) {
        return ordersMapper.insert(record);
    }

    @Override
    public int insertSelective(Orders record) {
        return ordersMapper.insertSelective(record);
    }

    @Override
    public Orders selectByPrimaryKey(Integer orderId) {
        return ordersMapper.selectByPrimaryKey(orderId);
    }

    @Override
    public int updateByPrimaryKeySelective(Orders record) {
        return ordersMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Orders record) {
        return ordersMapper.updateByPrimaryKey(record);
    }

}

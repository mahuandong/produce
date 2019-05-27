package com.fabricate.produce.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.fabricate.produce.entity.Routing;

public interface RoutingMapper {
    int deleteByPrimaryKey(Integer routingId);

    int insert(Routing record);

    int insertSelective(Routing record);

    Routing selectByPrimaryKey(Integer routingId);

    int updateByPrimaryKeySelective(Routing record);

    int updateByPrimaryKey(Routing record);

    List<Routing> findAllByUserId(@Param("userId")Integer userId);

    List<Routing> findAll();

}
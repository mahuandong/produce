package com.fabricate.produce.mapper;
import java.util.List;

import com.fabricate.produce.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(@Param("userId") Integer userId, @Param("account") String account);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(@Param("userId") Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> findAllByAccount(@Param("account")String account);

}
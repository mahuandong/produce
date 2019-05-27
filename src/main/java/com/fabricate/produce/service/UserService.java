package com.fabricate.produce.service;

import com.fabricate.produce.entity.User;
public interface UserService{


    int deleteByPrimaryKey(Integer userId,String account);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId,String account);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}

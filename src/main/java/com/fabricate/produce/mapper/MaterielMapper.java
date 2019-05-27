package com.fabricate.produce.mapper;

import com.fabricate.produce.entity.Materiel;

public interface MaterielMapper {
    int deleteByPrimaryKey(Integer materielId);

    int insert(Materiel record);

    int insertSelective(Materiel record);

    Materiel selectByPrimaryKey(Integer materielId);

    int updateByPrimaryKeySelective(Materiel record);

    int updateByPrimaryKey(Materiel record);
}
package com.fabricate.produce.service;

import com.fabricate.produce.entity.Materiel;
public interface MaterielService{


    int deleteByPrimaryKey(Integer materielId);

    int insert(Materiel record);

    int insertSelective(Materiel record);

    Materiel selectByPrimaryKey(Integer materielId);

    int updateByPrimaryKeySelective(Materiel record);

    int updateByPrimaryKey(Materiel record);

}

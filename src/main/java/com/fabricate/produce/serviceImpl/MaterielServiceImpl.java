package com.fabricate.produce.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.fabricate.produce.mapper.MaterielMapper;
import com.fabricate.produce.entity.Materiel;
import com.fabricate.produce.service.MaterielService;
@Service
public class MaterielServiceImpl implements MaterielService{

    @Resource
    private MaterielMapper materielMapper;

    @Override
    public int deleteByPrimaryKey(Integer materielId) {
        return materielMapper.deleteByPrimaryKey(materielId);
    }

    @Override
    public int insert(Materiel record) {
        return materielMapper.insert(record);
    }

    @Override
    public int insertSelective(Materiel record) {
        return materielMapper.insertSelective(record);
    }

    @Override
    public Materiel selectByPrimaryKey(Integer materielId) {
        return materielMapper.selectByPrimaryKey(materielId);
    }

    @Override
    public int updateByPrimaryKeySelective(Materiel record) {
        return materielMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Materiel record) {
        return materielMapper.updateByPrimaryKey(record);
    }

}

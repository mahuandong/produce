package com.fabricate.produce.serviceImpl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.fabricate.produce.entity.Barcode;
import com.fabricate.produce.mapper.BarcodeMapper;
import com.fabricate.produce.service.BarcodeService;
@Service
public class BarcodeServiceImpl implements BarcodeService{

    @Resource
    private BarcodeMapper barcodeMapper;

    @Override
    public int deleteByPrimaryKey(String barcodeId) {
        return barcodeMapper.deleteByPrimaryKey(barcodeId);
    }

    @Override
    public int insert(Barcode record) {
        return barcodeMapper.insert(record);
    }

    @Override
    public int insertSelective(Barcode record) {
        return barcodeMapper.insertSelective(record);
    }

    @Override
    public Barcode selectByPrimaryKey(String barcodeId) {
        return barcodeMapper.selectByPrimaryKey(barcodeId);
    }

    @Override
    public int updateByPrimaryKeySelective(Barcode record) {
        return barcodeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Barcode record) {
        return barcodeMapper.updateByPrimaryKey(record);
    }

}

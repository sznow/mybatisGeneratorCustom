package cn.manytag.iamServiceModule.dao;

import cn.manytag.iamServiceModule.entity.Outstock;

public interface OutstockMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Outstock record);

    int insertSelective(Outstock record);

    Outstock selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Outstock record);

    int updateByPrimaryKey(Outstock record);
}
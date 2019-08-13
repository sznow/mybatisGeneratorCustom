package cn.manytag.iamServiceModule.dao;

import cn.manytag.iamServiceModule.entity.OutstockInstance;

public interface OutstockInstanceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OutstockInstance record);

    int insertSelective(OutstockInstance record);

    OutstockInstance selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OutstockInstance record);

    int updateByPrimaryKey(OutstockInstance record);
}
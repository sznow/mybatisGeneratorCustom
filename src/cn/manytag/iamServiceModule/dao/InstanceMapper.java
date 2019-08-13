package cn.manytag.iamServiceModule.dao;

import cn.manytag.iamServiceModule.entity.Instance;

public interface InstanceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Instance record);

    int insertSelective(Instance record);

    Instance selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Instance record);

    int updateByPrimaryKey(Instance record);
}
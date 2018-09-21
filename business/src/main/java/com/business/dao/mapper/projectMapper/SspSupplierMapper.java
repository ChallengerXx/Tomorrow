package com.business.dao.mapper.projectMapper;

import com.business.dao.entity.projectEntity.SspSupplier;
import com.business.dao.entity.projectEntity.SspSupplierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SspSupplierMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SspSupplier record);

    int insertSelective(SspSupplier record);

    List<SspSupplier> selectByExample(SspSupplierExample example);

    SspSupplier selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SspSupplier record, @Param("example") SspSupplierExample example);

    int updateByExample(@Param("record") SspSupplier record, @Param("example") SspSupplierExample example);

    int updateByPrimaryKeySelective(SspSupplier record);

    int updateByPrimaryKey(SspSupplier record);
}
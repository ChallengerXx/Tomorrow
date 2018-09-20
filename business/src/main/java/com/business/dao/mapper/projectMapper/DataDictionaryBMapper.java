package com.business.dao.mapper.projectMapper;

import com.business.dao.entity.projectEntity.DataDictionaryB;
import com.business.dao.entity.projectEntity.DataDictionaryBExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataDictionaryBMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DataDictionaryB record);

    int insertSelective(DataDictionaryB record);

    List<DataDictionaryB> selectByExample(DataDictionaryBExample example);

    DataDictionaryB selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataDictionaryB record, @Param("example") DataDictionaryBExample example);

    int updateByExample(@Param("record") DataDictionaryB record, @Param("example") DataDictionaryBExample example);

    int updateByPrimaryKeySelective(DataDictionaryB record);

    int updateByPrimaryKey(DataDictionaryB record);
}
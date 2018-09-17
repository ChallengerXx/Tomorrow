package com.business.dao.mapper.projectMapper;

import com.business.dao.entity.projectEntity.DataDictionaryA;
import com.business.dao.entity.projectEntity.DataDictionaryAExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataDictionaryAMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DataDictionaryA record);

    int insertSelective(DataDictionaryA record);

    List<DataDictionaryA> selectByExample(DataDictionaryAExample example);

    DataDictionaryA selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataDictionaryA record, @Param("example") DataDictionaryAExample example);

    int updateByExample(@Param("record") DataDictionaryA record, @Param("example") DataDictionaryAExample example);

    int updateByPrimaryKeySelective(DataDictionaryA record);

    int updateByPrimaryKey(DataDictionaryA record);
}
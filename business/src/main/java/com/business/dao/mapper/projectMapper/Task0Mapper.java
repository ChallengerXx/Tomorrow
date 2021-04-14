package com.business.dao.mapper.projectMapper;

import com.business.dao.entity.projectEntity.Task0;
import com.business.dao.entity.projectEntity.Task0Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Task0Mapper {
    int deleteByPrimaryKey(String taskNo);

    int insert(Task0 record);

    int insertSelective(Task0 record);

    List<Task0> selectByExample(Task0Example example);

    Task0 selectByPrimaryKey(String taskNo);

    int updateByExampleSelective(@Param("record") Task0 record, @Param("example") Task0Example example);

    int updateByExample(@Param("record") Task0 record, @Param("example") Task0Example example);

    int updateByPrimaryKeySelective(Task0 record);

    int updateByPrimaryKey(Task0 record);
}
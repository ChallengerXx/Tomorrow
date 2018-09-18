package com.business.dao.mapper.projectMapper;

import com.business.dao.entity.projectEntity.SspMachineNum;
import com.business.dao.entity.projectEntity.SspMachineNumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SspMachineNumMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SspMachineNum record);

    int insertSelective(SspMachineNum record);

    List<SspMachineNum> selectByExample(SspMachineNumExample example);

    SspMachineNum selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SspMachineNum record, @Param("example") SspMachineNumExample example);

    int updateByExample(@Param("record") SspMachineNum record, @Param("example") SspMachineNumExample example);

    int updateByPrimaryKeySelective(SspMachineNum record);

    int updateByPrimaryKey(SspMachineNum record);
}
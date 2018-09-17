package com.business.dao.mapper.projectMapper;

import com.business.dao.entity.projectEntity.SspPremises;
import com.business.dao.entity.projectEntity.SspPremisesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SspPremisesMapper {
    int deleteByPrimaryKey(Integer primaryId);

    int insert(SspPremises record);

    int insertSelective(SspPremises record);

    List<SspPremises> selectByExampleWithBLOBs(SspPremisesExample example);

    List<SspPremises> selectByExample(SspPremisesExample example);

    SspPremises selectByPrimaryKey(Integer primaryId);

    int updateByExampleSelective(@Param("record") SspPremises record, @Param("example") SspPremisesExample example);

    int updateByExampleWithBLOBs(@Param("record") SspPremises record, @Param("example") SspPremisesExample example);

    int updateByExample(@Param("record") SspPremises record, @Param("example") SspPremisesExample example);

    int updateByPrimaryKeySelective(SspPremises record);

    int updateByPrimaryKeyWithBLOBs(SspPremises record);

    int updateByPrimaryKey(SspPremises record);
}
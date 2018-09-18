package com.business.dao.mapper.custom;

import com.req.TableReq;
import com.vo.PremisesVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PremisesCustomerMapper {

    List<PremisesVo> searchPremisesByNum(@Param("queryList")List<TableReq> queryList,@Param("aCode")String aCode);
}

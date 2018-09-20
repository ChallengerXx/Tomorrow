package com.business.dao.mapper.custom;

import com.req.TableReq;
import com.vo.PremisesGPSVo;
import com.vo.PremisesVo;
import com.vo.SellAppPremisesVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PremisesCustomerMapper {

    List<PremisesVo> searchPremisesByNum(@Param("queryList")List<TableReq> queryList,@Param("aCode")String aCode);

    List<PremisesGPSVo> getPremisesByIds(@Param("pids")List<Integer> pids);

    List<PremisesGPSVo> getPremisesNameLike(@Param("cityCodes")List<String> cityCodes,@Param("searchWord") String searchWord);

    List<SellAppPremisesVo> getAppPremisesByIds(@Param("pidList")List<Integer> pidList);
}

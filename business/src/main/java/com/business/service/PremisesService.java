package com.business.service;

import com.vo.PremisesGPSVo;
import com.vo.PremisesVo;

import java.util.List;

public interface PremisesService {

    /**
     * 通过机器码查询楼盘信息
     * @param numList
     * @return
     */
    List<PremisesVo> getByMachineNum(List<String> numList);

    /**
     * 通过楼盘id查询楼盘信息（只支持梯内屏）
     * @param pids
     * @return
     */
    List<PremisesGPSVo> getPremisesByIds(List<Integer> pids);
}

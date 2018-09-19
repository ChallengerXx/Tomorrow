package com.appInterface;

import com.vo.PremisesGPSVo;
import com.vo.PremisesVo;

import java.util.List;
import java.util.Map;

public interface IBuildingsAPI {

    /**
     * 根据机器码查询楼盘信息（form-data）
     *
     * @param nums
     * @return
     */
    List<PremisesVo> getByMachineNum(String nums);

    /**
     * 根据楼盘pid获取楼盘名称(只支持梯内屏)
     * json数组
     *
     * @param pids
     * @return
     */
    List<PremisesGPSVo> getByIds(Map<String, List<Integer>> pids);
}

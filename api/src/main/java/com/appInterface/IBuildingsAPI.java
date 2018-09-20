package com.appInterface;

import com.vo.PremisesGPSVo;
import com.vo.PremisesVo;
import com.vo.SellAppPremisesVo;

import java.util.List;
import java.util.Map;

public interface IBuildingsAPI {

    /**
     * 根据机器码查询楼盘信息
     * （form-data）
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

    /**
     * 根据楼宇名称模糊查找
     * json
     *
     * @param body
     * @return
     */
    List<PremisesGPSVo> getByNameLike(String body);

    /**
     * 提供给售卖系统接口,根据楼盘ID查询楼盘信息
     * （form-data）
     *
     * @param pids
     * @return
     */
    List<SellAppPremisesVo> getListByIdsV2(String pids);
}

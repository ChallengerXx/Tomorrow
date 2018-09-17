package com.appInterface;

import com.vo.PremisesVo;

import java.util.List;

public interface IBuildingsAPI {

    /**
     * 根据机器码查询楼盘信息（form-data）
     * @param nums
     * @return
     */
    List<PremisesVo> getByMachineNum(String nums);
}

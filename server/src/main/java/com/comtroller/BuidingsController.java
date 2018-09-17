package com.comtroller;

import com.appInterface.IBuildingsAPI;
import com.util.AppStringUtil;
import com.vo.PremisesVo;

import java.util.List;

public class BuidingsController implements IBuildingsAPI {

    /**
     * 根据机器码查询楼盘信息（form-data）
     * @param nums
     * @return
     */
    @Override
    public List<PremisesVo> getByMachineNum(String nums) {
        List<String> numList = AppStringUtil.strToList(nums, ",");
        return null;
    }
}

package com.comtroller;

import com.alibaba.fastjson.JSONObject;
import com.appInterface.IBuildingsAPI;
import com.business.service.PremisesService;
import com.exception.BusinessException;
import com.util.AppStringUtil;
import com.vo.PremisesGPSVo;
import com.vo.PremisesVo;
import com.vo.SellAppPremisesVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Slf4j
@RestController
public class BuidingsController implements IBuildingsAPI {

    @Autowired
    private PremisesService premisesService;

    /**
     * 根据机器码查询楼盘信息（form-data）
     *
     * @param nums
     * @return
     */
    @Override
    @RequestMapping(value = "/getByMachineNum", method = RequestMethod.POST)
    public List<PremisesVo> getByMachineNum(String nums) {
        if (nums == null || StringUtils.isEmpty(nums.trim())) {
            throw new BusinessException("机器码不能为空");
        }
        List<String> numList = AppStringUtil.strToList(nums, ",");
        List<PremisesVo> voList = premisesService.getByMachineNum(numList);
        return voList;
    }

    /**
     * 根据楼盘pid获取楼盘名称(只支持梯内屏)
     * json数组
     *
     * @param pids
     * @return
     */
    @Override
    @PostMapping("/getByIds")
    public List<PremisesGPSVo> getByIds(@RequestBody Map<String, List<Integer>> pids) {
        if (pids == null) {
            throw new BusinessException("楼盘id不能为空");
        }
        List<PremisesGPSVo> voList = premisesService.getPremisesByIds(pids.get("pids"));
        return voList;
    }

    /**
     * 根据楼宇名称模糊查找
     * json
     *
     * @param body
     * @return
     */
    @Override
    @PostMapping("/getByNameLike")
    public List<PremisesGPSVo> getByNameLike(@RequestBody String body) {
        JSONObject json = JSONObject.parseObject(body);
        String searchWord = json.getString("searchWord");
        List<String> cityCodes = AppStringUtil.strToList(json.getString("city"), ",");
        List<PremisesGPSVo> voList = premisesService.getPremisesNameLike(searchWord, cityCodes);
        return voList;
    }

    /**
     * 提供给售卖系统接口,根据楼盘ID查询楼盘信息
     * （form-data）
     *
     * @param pids
     * @return
     */
    @Override
    @PostMapping("/getListByIdsV2")
    public List<SellAppPremisesVo> getListByIdsV2(String pids) {
        if (pids != null && StringUtils.isEmpty(pids.trim()))
            throw new BusinessException("楼兰id不能为空");
        List<String> pidList = AppStringUtil.strToList(pids, ",");
        List<SellAppPremisesVo> voList = premisesService.getAppPremisesByIds(pidList);
        return voList;
    }
}

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
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
public class BuidingsController implements IBuildingsAPI {

    @Autowired
    private PremisesService premisesService;

    @Value("${testValue:200}")
    private String testValue;

    /**
     * @api {POST} /test/:id 测试二
     * @apiGroup test
     * @apiVersion 0.0.1
     * @apiDescription 这是第二个测试
     * @apiParam  {String} name 名字
     * @apiParam  {String} [phone] 手机
     * @apiSuccess (Success) {String} msg 信息
     * @apiSuccess (Success) {int} code 0 代表无错误 1代表有错误
     * @apiError (Error) {String} msg 信息
     * @apiError (Error) {String} m 信息
     * @apiParamExample 请求样例
     * /index.php?i=8888
     * @apiSuccessExample {json} 返回样例
     *                {"code":"0","msg":"修改成功"}
     * @apiErrorExample {json} 失败返回样例
     *                {"code":"0","msg":"修改成功"}
     */
    @RequestMapping(value = "/testValue", method = RequestMethod.GET)
    public String getTestValue(){
        return testValue;
    }


    /**
     * 根据机器码查询楼盘信息（form-data）
     *
     * @param nums
     * @return
     */
    @Override
    @RequestMapping(value = "/getByMachineNum", method = RequestMethod.POST)
    public List<PremisesVo> getByMachineNum(String nums) {
        return new ArrayList<>();
//        if (nums == null || StringUtils.isEmpty(nums.trim())) {
//            throw new BusinessException("机器码不能为空");
//        }
//        List<String> numList = AppStringUtil.strToList(nums, ",");
//        List<PremisesVo> voList = premisesService.getByMachineNum(numList);
//        return voList;
    }

    /**
     * @api {POST}/getByIds 根据楼盘pid获取楼盘名称
     * @apiGroup test
     * @apiName getByIds
     * @apiVersion 0.0.1
     * @apiDescription 只支持梯内屏
     * @apiParam pids 楼盘id集合
     * @apiParamExample 请求示例
     * {"pids":[111,112,113,114,115]}
     * @apiSuccess code 响应状态码
     * @apiSuccess msg 响应信息
     * @apiSuccess data 返回数据
     * @apiSuccessExample 响应结果示例
     * {"code":"200", "msg":"success", "data":""}
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

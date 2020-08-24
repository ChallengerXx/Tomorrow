package com.test;


import com.business.dispatcher.RuleDispatcherService;
import com.business.service.DeviceService;
import com.business.service.PremisesService;
import com.vo.PremisesVo;
import com.vo.SellAppPremisesVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BuildingsTest {

    @Autowired
    private PremisesService premisesService;
    @Autowired
    private DeviceService deviceService;
    @Autowired
    private RuleDispatcherService ruleDispatcherService;

    @Test
    public void testRuleDispatcher() {
        ruleDispatcherService.dispatcher("1");
    }

    @Test
    public void deviceExport(){
        String file = "D:/nmyslog";
        deviceService.deviceExport(123456L,1,file);
    }
    @Test
    public void getByMachineNum() {
        List<PremisesVo> voList = premisesService.getByMachineNum(Arrays.asList("CD-B74-323", "BJB-E11-039"));
        System.out.println(voList);
    }

    @Test
    public void getPremisesByIds() {
        premisesService.getPremisesByIds(Arrays.asList(197773));
    }

    @Test
    public void getAppPremisesByIds() {
        List<SellAppPremisesVo> list = premisesService.getAppPremisesByIds(Arrays.asList("197773"));
        System.out.println(list);
    }
}

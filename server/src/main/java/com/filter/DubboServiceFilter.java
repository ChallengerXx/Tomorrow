package com.filter;

import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.*;
import com.business.dispatcher.RuleDispatcherService;
import com.dubbo.service.ResultDTO;
import com.dubbo.service.request.DubboRequestDTO;
import com.util.JacksonUtils;
import org.apache.commons.lang.StringUtils;

@Activate
public class DubboServiceFilter implements Filter {

    private RuleDispatcherService ruleDispatcherService;

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        System.out.println("进入 dubbo 过滤器");
        Object[] arguments = invocation.getArguments();
        DubboRequestDTO map = JacksonUtils.jsonToObject(JacksonUtils.ObjectToJson(arguments[0]), DubboRequestDTO.class);
        System.out.println(JacksonUtils.ObjectToJson(arguments));
        ruleDispatcherService.dispatcher("1");
        if (StringUtils.isBlank(map.getToken())) {
            return new RpcResult(new ResultDTO("9999", "fail", null));
        }
        return invoker.invoke(invocation);
    }

    public void setRuleDispatcherService(RuleDispatcherService ruleDispatcherService) {
        this.ruleDispatcherService = ruleDispatcherService;
    }
}

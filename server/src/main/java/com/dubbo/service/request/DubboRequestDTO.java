package com.dubbo.service.request;

import java.util.Map;

public class DubboRequestDTO {

    private String serviceName;

    private String token;

    private Map<String, Object> parameters;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Map<String, Object> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return "DubboRequestDTO{" +
                "serviceName='" + serviceName + '\'' +
                ", token='" + token + '\'' +
                ", parameters=" + parameters +
                '}';
    }
}

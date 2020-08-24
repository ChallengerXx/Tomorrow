package com.controller.interceptor.config;

import com.controller.interceptor.AuthInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * 拦截器配置
 */
@Configuration
public class InterceptorConfiguration extends WebMvcConfigurationSupport {

    @Bean
    public AuthInterceptor authInterceptor(){
        return new AuthInterceptor();
    }

    /**
     * 多个拦截器组成一个拦截器链
     *
     * @param registry
     */
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authInterceptor()).addPathPatterns("/api/**")
                .excludePathPatterns("/api/excludePath/test");
    }
}

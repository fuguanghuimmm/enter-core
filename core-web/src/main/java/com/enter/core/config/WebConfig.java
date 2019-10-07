package com.enter.core.config;

import com.enter.core.interceptor.AccessControlInterceptor;
import com.enter.core.interceptor.JwtInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Liquid
 * @类名： WebConfig
 * @描述：
 * @date 2019/5/18
 */

@Configuration
public class WebConfig implements WebMvcConfigurer {


    private AccessControlInterceptor accessControlInterceptor;

    private JwtInterceptor jwtInterceptor ;

    @Autowired
    public WebConfig(JwtInterceptor jwtInterceptor, AccessControlInterceptor accessControlInterceptor) {
        this.accessControlInterceptor = accessControlInterceptor;
        this.jwtInterceptor=jwtInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(jwtInterceptor)
//                .addPathPatterns("/**")
//                .excludePathPatterns("/login");
//        registry.addInterceptor(accessControlInterceptor).addPathPatterns("/**");
    }
}

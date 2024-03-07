package com.example.es13;

import com.example.es13.Interceptors.APILoggingInterceptor;
import com.example.es13.Interceptors.LegacyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Component
public class SpringMVCConfiguration implements WebMvcConfigurer {
    @Autowired
    APILoggingInterceptor apiLoggingInterceptor;
    @Autowired
    LegacyInterceptor legacyInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(apiLoggingInterceptor).addPathPatterns("/time");
        registry.addInterceptor(legacyInterceptor).addPathPatterns("/legacy");
    }
}

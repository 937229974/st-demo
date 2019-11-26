package com.st.comment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Component
public class MyWebConfiguration extends WebMvcConfigurationSupport {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    protected void addInterceptors(InterceptorRegistry registry){

        registry.addInterceptor(new LoginHandlerInterceptor())
                .addPathPatterns("/**").excludePathPatterns("/","/login");
        super.addInterceptors(registry);

    }

}

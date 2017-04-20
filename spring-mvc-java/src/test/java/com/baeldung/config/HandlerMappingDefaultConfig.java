package com.nklkarthi.config;

import com.nklkarthi.web.controller.handlermapping.BeanNameHandlerMappingController;
import com.nklkarthi.web.controller.handlermapping.SimpleUrlMappingController;
import com.nklkarthi.web.controller.handlermapping.WelcomeController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;

import java.util.HashMap;
import java.util.Map;


@Configuration
public class HandlerMappingDefaultConfig {

    @Bean("/welcome")
    public BeanNameHandlerMappingController beanNameHandlerMapping() {
        return new BeanNameHandlerMappingController();
    }

    @Bean
    public WelcomeController welcome() {
        return new WelcomeController();
    }

}
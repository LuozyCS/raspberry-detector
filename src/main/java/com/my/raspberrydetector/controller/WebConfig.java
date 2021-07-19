package com.my.raspberrydetector.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@Configuration
public class WebConfig {

    // 这个方法是用来配置静态资源的，比如html，js，css，等等
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//    }

//    @Override
    public void addViewController(ViewControllerRegistry registry){
        System.out.println("-----------");
        registry.addViewController("home").setViewName("home");

    }
}

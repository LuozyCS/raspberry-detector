package com.my.raspberrydetector.controller;

import com.my.raspberrydetector.dataAccessObject.DHT11Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
    @Autowired
    private DHT11Mapper dht11Mapper;

    @GetMapping({"/","/home"})
    public  String home(
            Model model
    ){
        System.out.println(dht11Mapper.getAllInfo());
        model.addAttribute("DHT11",dht11Mapper.getAllInfo());
//        model.addAttribute("");
        return "home";
    }
}

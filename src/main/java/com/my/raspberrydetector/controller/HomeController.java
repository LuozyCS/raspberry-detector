package com.my.raspberrydetector.controller;

import com.my.raspberrydetector.dataAccessObject.DHT11;
import com.my.raspberrydetector.dataAccessObject.DHT11Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private DHT11Mapper dht11Mapper;

    @GetMapping({"/","/home"})
    public  String home(
            Model model
    ){
//        System.out.println(dht11Mapper.getAllInfo());

        return "home";
    }

    @ResponseBody
    @RequestMapping("/home_request")
    public List<DHT11> homeRequest(

    ){
        List<DHT11> DHT11List_rec =  dht11Mapper.getAllInfo().subList(0,Math.min(15, dht11Mapper.getAllInfo().size()));
        for(DHT11 each:DHT11List_rec){
            each.setTIME(each.getTIME().substring(each.getTIME().indexOf(" "),each.getTIME().indexOf(" ")+6));
        }
        Collections.reverse(DHT11List_rec);
        return DHT11List_rec;
    }

    @ResponseBody
    @RequestMapping("/home_request_table")
    public ArrayList<DHT11> homeRequestTable(
    ){
        ArrayList<DHT11> DHT11List = (ArrayList<DHT11>) dht11Mapper.getAllInfo();
        return DHT11List;

    }
}

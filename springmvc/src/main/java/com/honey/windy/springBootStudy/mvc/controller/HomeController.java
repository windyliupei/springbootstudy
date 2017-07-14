package com.honey.windy.springBootStudy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by H144198 on 7/13/2017.
 */

@Controller
@RequestMapping("admin")
public class HomeController {

    //RequestMapping 不要写 name="xxxx"
    @RequestMapping("/home1")
    public String home1(){
        return "home1";
    }

    @RequestMapping("/home")
    public String home() {
       return "home";
    }

    @RequestMapping("/greeting")
    public String greeting() {
        return "greeting";
    }

}

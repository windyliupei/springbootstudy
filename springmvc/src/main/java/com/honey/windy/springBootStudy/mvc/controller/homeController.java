package com.honey.windy.springBootStudy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by H144198 on 7/13/2017.
 */

@Controller
@RequestMapping("admin")
public class homeController {

    @RequestMapping(name = "home",produces = "text/html")
    public String home(){
        return "home";
    }



}

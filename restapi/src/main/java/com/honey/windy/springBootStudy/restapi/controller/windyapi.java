package com.honey.windy.springBootStudy.restapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by H144198 on 7/13/2017.
 */
@RestController
@RequestMapping(value = "/v1/api/windyapi")
public class windyapi {

    @RequestMapping(value = "get",method = RequestMethod.GET)
    public String getHello(){
        return "This is get response.";
    }

    @PostMapping("post")
    public String postHello(){
        return "This is post response";
    }

    //get 和 delete 都可以映射这个方法，但是和上面的get会产生奇异性
    @RequestMapping(value = {"/get","/delete"},method = RequestMethod.GET)
    public String multipleMapping(){
        return "This is post get or delete";
    }


}

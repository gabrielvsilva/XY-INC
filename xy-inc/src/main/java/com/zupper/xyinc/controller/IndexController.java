package com.zupper.xyinc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by gabriel on 13/04/18.
 */

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

}

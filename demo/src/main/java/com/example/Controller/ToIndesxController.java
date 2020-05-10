package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ToIndesxController {


    @RequestMapping()
    public String toIndex(){
        return "index";
    }






}

package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "register")
public class RegisterController {

    @RequestMapping(value = "test")
    public String toRegister(){
        return "python";
    }

}

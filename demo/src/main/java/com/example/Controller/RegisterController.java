package com.example.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "register")
@Api(value = "用户注册相关Controller", tags = {"用户注册相关Controller"})
public class RegisterController {

    @ApiOperation(value = "测试Controller", notes = "测试Controller", httpMethod = "POST")
    @RequestMapping(value = "test")
    public String toRegister(){
        return "python";
    }

}

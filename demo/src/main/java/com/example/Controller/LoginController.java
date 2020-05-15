package com.example.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("login")
@Api(value = "用户登录相关接口", tags = {"用户登录相关接口"})
public class LoginController {

    @RequestMapping("do_login")
    @ApiOperation(value = "用户跳转登录页面Controller", notes = "跳转页面", httpMethod = "POST")
    public String Login(){
        return "ccc";
    }

}

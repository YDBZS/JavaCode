package com.example.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Api(value = "thymleaf模板引擎跳转首页Controller", tags = {"默认跳转"})
public class ToIndesxController {

    @ApiOperation(value = "跳转默认模板引擎页面Controller", httpMethod = "GET")
    @RequestMapping()
    public String toIndex(){
        return "index";
    }

}

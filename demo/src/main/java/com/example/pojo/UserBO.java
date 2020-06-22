package com.example.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 用户BO
 *
 * @author ：多宝
 * @since ：2020/6/19 14:59
 */
@ApiModel(value = "用户注册的参数", description = "用户注册参数说明")
@Data
public class UserBO {

    @ApiModelProperty(value = "用户名", name = "name", allowableValues = "只能提供2-3个中文字符", readOnly = true, required = true)
    private String name;

    @ApiModelProperty(value = "性别", name = "sex", notes = "0 -> 女， 1 -> 男", readOnly = true, required = true)
    private Integer sex;

    @ApiModelProperty(value = "用户密码", name = "password", allowableValues = "必须包含英文字母大小写，数字，不能包含特殊字符", readOnly = true, required = true)
    private String password;

    @ApiModelProperty(value = "验证码", name = "code", allowableValues = "验证码,", required = true)
    private String code;

}

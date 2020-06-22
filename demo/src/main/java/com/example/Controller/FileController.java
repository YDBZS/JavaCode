package com.example.Controller;

import com.example.pojo.FileBo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文件上传Controller
 *
 * @author ：多宝
 * @since ：2020/6/19 15:58
 */
@Api(value = "文件上传Controller", tags = {"文件上传Controller"})
@RestController
@RequestMapping("/web/file")
public class FileController {
    @ApiOperation(value = "文件上传接口", httpMethod = "POST")
    @RequestMapping("/upload")
    public String upload(
            @RequestBody FileBo bo
    ){
        return "";
    }
}

package com.example.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件上传入参
 *
 * @author ：多宝
 * @since ：2020/6/19 16:02
 */
@ApiModel(value = "上传文件入参对象", description = "上传文件")
@Data
public class FileBo {

    @ApiModelProperty(value = "文件流", name = "file", allowableValues = "图片的话只支持jpg，视频的话只支持Mp4", required = true, dataType = "MultipartFile")
    private MultipartFile file;

    @ApiModelProperty(value = "图片文件的话上传的文件的要求width", allowableValues = "单位是px", required = false)
    private String width;

    @ApiModelProperty(value = "图片上传的话上传文件的要求Height", allowableValues = "单位是px", required = false)
    private String height;

}

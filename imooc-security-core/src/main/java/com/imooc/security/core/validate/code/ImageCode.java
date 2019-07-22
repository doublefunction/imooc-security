package com.imooc.security.core.validate.code;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.time.LocalDateTime;
@Data
@AllArgsConstructor
public class ImageCode {

    private BufferedImage image;
    //随机数，根据随机数生成图片
    private String code;
    //失效时间
    private LocalDateTime expireTime;

    public ImageCode(BufferedImage image,String code,int expireIn){
        this.image = image;
        this.code = code ;
        this.expireTime = LocalDateTime.now().plusSeconds(expireIn);
    }

}

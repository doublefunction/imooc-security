package com.imooc.security.core.properties;

import lombok.Data;

/**
 * 配置校验码的属性
 */
@Data
public class ImageCodeProperties {
    private int width =67;
    private  int height = 23;
    private int length = 4;
    private int expireIn = 60;
    private String url;
}

package com.imooc.security.core.properties;

import lombok.Data;

/**
 * 封装验证码：包括图形验证码和短信验证码等
 */
@Data
public class ValidateCodeProperties {

    private ImageCodeProperties image =new ImageCodeProperties();

}

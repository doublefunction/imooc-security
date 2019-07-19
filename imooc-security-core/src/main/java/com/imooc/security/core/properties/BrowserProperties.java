package com.imooc.security.core.properties;

import lombok.Data;

@Data
public class BrowserProperties {

    private String loginPage = "/imooc-signIn.html";//如果用户配置了就用用户的值

    private LoginType loginType=LoginType.JSON;


}

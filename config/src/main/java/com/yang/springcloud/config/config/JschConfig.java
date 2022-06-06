package com.yang.springcloud.config.config;

import com.jcraft.jsch.JSch;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Yang.JuHao
 * @Date: 2022/6/1
 * @Time: 16:18
 * @Description:
 */
@Configuration
public class JschConfig {

    //Shim to fix the way jGit configures JSch
    static{
        JSch.setConfig("signature.rsa", "com.jcraft.jsch.jce.SignatureRSA");
    }

}

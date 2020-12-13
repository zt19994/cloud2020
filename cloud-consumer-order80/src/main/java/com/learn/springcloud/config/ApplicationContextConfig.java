package com.learn.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 应用上下文配置类
 *
 * @author zt1994
 * @date 2020/12/13 19:59
 */
@Configuration
public class ApplicationContextConfig {

    /**
     * 获取restTemplate
     *
     * @return
     */
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }


}

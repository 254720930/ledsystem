package com.xcy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 *@Author feri
 *@Date Created in 2019/7/8 16:08
 */
@Configuration
public class SwaggerConfig {
    private ApiInfo createAI(){
        return new ApiInfoBuilder().title("锐拓显示官网").description("基于SpringBoot实现").version("0.1")
                .contact(new Contact("","http://111","1111111@163.com")).build();
    }
    @Bean
    public Docket createD(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(createAI()).select().apis
                (RequestHandlerSelectors.basePackage("com.xcy.controller")).build();
    }
}

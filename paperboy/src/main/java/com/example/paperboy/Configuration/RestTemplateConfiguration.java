package com.example.paperboy.Configuration;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class RestTemplateConfiguration {

    // @Bean vs @Component - both are used to create beans
    // but @Bean is written on a method and will create a return type class bean
    // @Component will create a bean for the class type.
    @Bean
    // Configuration code for the rest template
    public RestTemplate getRestTemplate(RestTemplateBuilder restTemplateBuilder){
        return restTemplateBuilder.build();
    }
}

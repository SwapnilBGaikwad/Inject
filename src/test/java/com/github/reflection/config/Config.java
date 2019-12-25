package com.github.reflection.config;

import com.github.reflection.Bean;
import com.github.reflection.Configuration;

@Configuration
public class Config {
    @Bean
    public String getName() {
        return "Hello World";
    }

    @Bean
    public Integer getMarks() {
        return 10;
    }
}

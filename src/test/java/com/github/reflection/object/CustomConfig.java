package com.github.reflection.object;

import com.github.reflection.Bean;
import com.github.reflection.Configuration;

@Configuration
public class CustomConfig {
    @Bean
    public String getName() {
        return "String value";
    }

    @Bean
    public Integer getMarks() {
        return 100;
    }
}
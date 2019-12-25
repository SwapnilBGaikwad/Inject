package app;

import reflection.Bean;
import reflection.Configuration;

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

package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.test")
public class Config {
    @Bean
    public Engine engine() {
        return new Engine("v8");
    }

    @Bean
    public Transmission transmission() {
        return new Transmission("sliding");
    }

    @Bean
    public Car car(){
        return new Car("Audi",new Engine("v8"),new Transmission("sliding"));
    }
}

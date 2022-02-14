package com.journaldev.IOC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.journaldev.IOC")
public class MyConfig {
    @Bean
    public MyService myService(){
        return new MyService();
    }
}

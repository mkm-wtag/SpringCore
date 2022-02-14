package com.journaldev.DI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.journaldev.DI")
public class DIConfiguration {
    @Bean
    public MessageService getMessageService(){
        return new EmailService();
    }
}

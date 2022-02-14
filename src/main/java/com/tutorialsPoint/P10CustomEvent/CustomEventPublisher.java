package com.tutorialsPoint.P10CustomEvent;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventPublisher implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher publisher;

    public ApplicationEventPublisher getPublisher() {
        return publisher;
    }

    public void publish(){
        CustomEvent customEvent=new CustomEvent(this);
        publisher.publishEvent(customEvent);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher=applicationEventPublisher;

    }
}

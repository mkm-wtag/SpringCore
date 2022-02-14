package com.tutorialsPoint.P4BeanPostProcessor;

public class BeanPrcsEg {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String
    toString() {
        return "BeanPrcsEg{" +
                "message='" + message + '\'' +
                '}';
    }
}

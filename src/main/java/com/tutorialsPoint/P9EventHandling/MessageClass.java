package com.tutorialsPoint.P9EventHandling;

public class MessageClass {
    private  String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MessageClass{" +
                "message='" + message + '\'' +
                '}';
    }
}

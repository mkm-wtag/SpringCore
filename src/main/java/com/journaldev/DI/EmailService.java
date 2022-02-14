package com.journaldev.DI;

public class EmailService implements MessageService{
    @Override
    public boolean sendMessage(String msg, String rec) {
        System.out.println("Email Sent to "+rec+" with message= "+msg);
        return true;
    }
}

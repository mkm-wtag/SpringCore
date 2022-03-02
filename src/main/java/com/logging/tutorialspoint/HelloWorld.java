package com.logging.tutorialspoint;

import org.apache.log4j.Logger;

public class HelloWorld {
    private Logger logger=Logger.getLogger(HelloWorld.class.getName());
    public void doSomething() {
//        logger.setLevel(Level.TRACE);
        logger.trace("Trace Message!");
        logger.debug("Debug Message!");
        logger.info("Info Message!");
        logger.warn("Warn Message!");
        logger.error("Error Message!");
        logger.fatal("Fatal Message!");
    }
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

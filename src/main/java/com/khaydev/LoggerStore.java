package com.khaydev;

import java.util.logging.Logger;

/**
 * A store that returns the only instance of {@link Logger} made available in the application
 * Makes use of the enum-based Singleton pattern to achieve this.
 *
 * @author  Ebenezer Buabeng
 * @see Logger
 */
public enum LoggerStore {
    INSTANCE;

    private Logger logger;

    LoggerStore(){
        logger = Logger.getLogger(LoggerStore.class.getName());
    }

    public Logger getLogger(){
        return logger;
    }

    public void setLogger(Logger logger){
        this.logger = logger;
    }
}

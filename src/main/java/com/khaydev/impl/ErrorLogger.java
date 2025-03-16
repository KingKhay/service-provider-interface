package com.khaydev.impl;

import com.khaydev.Logger;
import com.khaydev.LoggerStore;

/**
 * Represents an Implementation of {@link Logger} interface that prints out Error logs. typically for
 * debugging or monitoring purposes in an application.
 *
 * @author Ebenezer Buabeng
 *
 * @see Logger
 */
public class ErrorLogger implements Logger {

    private final java.util.logging.Logger logger;

    public ErrorLogger() {
        this.logger = LoggerStore.INSTANCE.getLogger();
    }

    @Override
    public void log(String message) {
        logger.severe(message);
    }
}

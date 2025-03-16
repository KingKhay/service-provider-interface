package com.khaydev.impl;

import com.khaydev.Logger;
import com.khaydev.LoggerStore;

/**
 * Represents an Implementation of {@link Logger} interface that prints out Info logs. typically for
 * tracking application flow.
 *
 * @author Ebenezer Buabeng
 *
 * @see Logger
 */
public class InfoLogger implements Logger {

    private final java.util.logging.Logger logger;


    public InfoLogger() {
        this.logger = LoggerStore.INSTANCE.getLogger();
    }

    @Override
    public void log(String message) {
        logger.info(message);
    }
}

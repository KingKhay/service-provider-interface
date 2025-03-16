package com.khaydev;

import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * @author Ebenezer Buabeng
 *
 * @see Logger
 */
class LoggerStoreTest {

    /**
     * Test to check if only one instance of {@link Logger} is made available throughout the application lifecycle
     */
    @Test
    void testSingletonInstance(){
        //given

        //when
        Logger logger1 = LoggerStore.INSTANCE.getLogger();
        Logger logger2 = LoggerStore.INSTANCE.getLogger();

        //then
        assertSame(logger1, logger2, "LoggerStore should always return the same logger instance");
    }

    /**
     * Test to assert that the instance returned by the LoggerStore is not null
     */
    @Test
    void testLoggerInstanceIsNotNull() {
        assertNotNull(LoggerStore.INSTANCE.getLogger(), "Logger instance should not be null");
    }
}
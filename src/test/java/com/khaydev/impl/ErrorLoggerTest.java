package com.khaydev.impl;

import com.khaydev.LoggerStore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.logging.Logger;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class ErrorLoggerTest {

    private Logger mockLogger;
    private ErrorLogger errorLogger;

    @BeforeEach
    void setUp(){
        mockLogger = Mockito.mock(Logger.class);
        LoggerStore.INSTANCE.setLogger(mockLogger);
        errorLogger = new ErrorLogger();
    }

    @Test
    void testErrorLogger(){
        //given
        String message = "Log Message";

        //when
        errorLogger.log(message);

        //then
        verify(mockLogger, times(1)).severe(message);
    }
}
package com.khaydev.impl;

import com.khaydev.LoggerStore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.logging.Logger;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class InfoLoggerTest {

    private Logger mockLogger;
    private InfoLogger infoLogger;

    @BeforeEach
    void setUp(){
        mockLogger = Mockito.mock(Logger.class);
        LoggerStore.INSTANCE.setLogger(mockLogger);
        infoLogger = new InfoLogger();
    }

    @Test
    void testInfoLogger(){
        //given
        String message = "Log Message";

        //when
        infoLogger.log(message);

        //then
        verify(mockLogger, times(1)).info(message);
    }
}
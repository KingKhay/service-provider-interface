package com.khaydev;

import org.junit.jupiter.api.Test;

import java.util.ServiceLoader;

import static org.junit.jupiter.api.Assertions.assertTrue;


class AppTest {

    @Test
    void testServiceLoaderLoadsImplementations() {
        ServiceLoader<Logger> loader = ServiceLoader.load(Logger.class);
        assertTrue(loader.iterator().hasNext(), "No implementations loaded!");
    }
}
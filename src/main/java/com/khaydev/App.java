package com.khaydev;

import java.util.ServiceLoader;

/**
 * @author Ebenezer Buabeng
 *
 * @see Logger
 * @see java.util.ServiceLoader
 */
public class App 
{
    public static void main( String[] args )
    {
        ServiceLoader<Logger> loader = ServiceLoader.load(Logger.class);
        loader.stream().forEach(serviceProvider -> serviceProvider.get().log("Hello Devs"));
    }
}

package com.test.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class Log4j2Test 
{
	public static final Logger logger=LogManager.getLogger(Log4j2Test.class);
    public static void main( String[] args )
    {
    	logger.error( "1.Hello World!" );
    	logger.info( "2.Hello World!" );
    	logger.debug( "3.Hello World!" );
    	logger.trace( "4.Hello World!" );
    	
    }
}

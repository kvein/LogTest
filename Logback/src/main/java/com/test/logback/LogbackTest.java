package com.test.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.test.other.Otherclass;
import com.test.other.TestObj;

/**
 * Hello world!
 *
 */
public class LogbackTest 
{
	final static Logger logger = LoggerFactory.getLogger(LogbackTest.class);
    public static void main( String[] args )
    {
    	
    	   logger.info("LogbackTest #1");
           logger.warn("LogbackTest #2");
           logger.error("LogbackTest #3");
           logger.debug("LogbackTest #4");
           
           System.out.println("calling other class");
           
           Otherclass obj=new Otherclass();
           obj.logTestTwo();
           
           TestObj testObj=new TestObj();
           System.out.println("test TestObj.java");
           logger.trace("print testOjb {}",testObj.longRunningProcess());
           
           testObj.testException();
           
           
    }
}

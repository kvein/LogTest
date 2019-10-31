package com.test.other;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Otherclass {
	final static Logger logger = LoggerFactory.getLogger(Otherclass.class);
	
	public void logTestTwo() 
	{
		   logger.info("Otherclass #1");
           logger.warn("Otherclass #2");
           logger.error("Otherclass #3");
           logger.debug("Otherclass #4");
	}
}

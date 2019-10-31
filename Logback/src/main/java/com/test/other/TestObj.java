package com.test.other;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestObj {
	final static Logger logger = LoggerFactory.getLogger(TestObj.class);

	public TestObj() {
		logger.info("constructor of TestObj");
	}

	@Override
	public String toString() {
		return "TestObj []";
	}
	
	public String longRunningProcess() 
	{
		logger.info("inside longRunningProcess");
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			logger.error(e.getMessage());
		}
		return "long running";
	}
	
	public boolean testException() 
	{
		boolean bSuccess=false;
		try {
		double result =12/0;
		}catch(Exception e) 
		{
			logger.error(e.getMessage(),e);
		}
		return bSuccess;
	}

}

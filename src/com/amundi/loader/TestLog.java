package com.amundi.loader;

import org.apache.log4j.Logger;

public class TestLog {

	static Logger logger = Logger.getLogger("SYSLOG");
	
	public static void main(String[] args) throws InterruptedException {
		
		int i = 0;
		while (true) {

			logger.info("echo " + i++);
			Thread.sleep(1000);
		}
	}
}

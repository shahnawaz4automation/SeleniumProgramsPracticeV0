package com.Practice.Selenium122024;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestExample {
	private static final Logger logger = LogManager.getLogger(TestExample.class);

	public static void main(String[] args) {
		logger.trace("trace");
		logger.debug("debug");
		logger.info("info");
		logger.warn("warn");
		logger.error("error");
		logger.fatal("fatal");
		System.out.println("Exit the program");
	}
}

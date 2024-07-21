package com.Practice.Selenium072024;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogger {

	public static WebDriver driver;
	public static final Logger logger = LogManager.getLogger(TestLogger.class);
	
	public static void main(String[] args) {

		driver = new ChromeDriver();
		logger.info("ChromeDriver object created");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		logger.fatal("Implicit wait of 10 seconds");
		driver.get("https://www.myntra.com/");
		logger.error("error Logged into Myntra");
		logger.warn("warn Logged into Myntra");
		logger.debug("debug Logged into Myntra");
		logger.trace("trace Logged into Myntra");
		try {
			boolean text= driver.findElement(By.xpath("//a[contains(text(),'Women')]")).isDisplayed();
		}
		catch(Exception e) {
			System.out.print(e.getMessage());
			logger.warn("Exception occured", new Exception("Element Not Found"));
		}
		finally {
			driver.quit();
			logger.debug("Quitting the driver");
		}
		System.out.println("Test completed");
	}	
}
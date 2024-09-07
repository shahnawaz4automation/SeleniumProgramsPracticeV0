package com.Practice.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium03 {

	@Test
	public void testMethod() {
		System.out.println("Method started");
		// Extension to the Edge Browser
		// YouTube video -. Ad blocker Extension
		// Selenium ?

		// Create ChromeOptions instance
		ChromeOptions options = new ChromeOptions();

		// Add headless mode to ChromeOptions
		options.addArguments("--headless");
		//options.addArguments("--window-size=1920,1080"); // Optional: set window size
		// edgeOptions.addExtensions(new File("/Users/pramod/Downloads/AdBlock1.crx"));
		
		// Initialize Chrome driver
		WebDriver driver = new ChromeDriver(options);
		System.out.println("Driver initiated");
		driver.get("https://www.youtube.com");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}

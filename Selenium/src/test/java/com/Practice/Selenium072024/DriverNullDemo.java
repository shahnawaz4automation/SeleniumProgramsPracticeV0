package com.Practice.Selenium072024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNullDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.quit();
		try {
			if(driver!=null) 
				driver.get("https://www.google.com");
		} catch (Exception e) {
			System.out.println("Driver not initialized");
		}
	}
}

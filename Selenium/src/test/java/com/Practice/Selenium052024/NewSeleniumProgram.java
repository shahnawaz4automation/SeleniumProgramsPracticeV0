package com.Practice.Selenium052024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewSeleniumProgram {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.google.com");
		
		Thread.sleep(1000);
		
		driver.quit();
		driver.close();
		// Testing the pull request
		//driver.close();
	}

}

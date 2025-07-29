package com.Practice.Selenium032025;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class plan2206 {
	public WebDriver driver;

	@Test
	public void launchBrowser() {
		Scanner scan = new Scanner(System.in);
		String browser = scan.next();
		
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			driver.get("https://www.google.com");
			break;

		case "firefox":
			driver = new FirefoxDriver();
			driver.get("https://www.google.com");
			break;

		case "edge":
			driver = new EdgeDriver();
			driver.get("https://www.google.com");
			break;
		}
	}
	
	public void launchBrowser2() {
		Scanner scan = new Scanner(System.in);
		String browser = scan.next();
		
		switch(browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			driver = new EdgeDriver();
			break;
			
		default:
			driver = new FirefoxDriver();
		}
	}
}

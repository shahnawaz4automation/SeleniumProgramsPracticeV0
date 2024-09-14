package com.Practice.Selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium09 {
	public static void main(String[] args) throws MalformedURLException {
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://bing.com"); //  // No back, forward allowed in case of get

	        driver.navigate().to("https://app.vwo.com");
	        driver.navigate().to(new URL("https://google.com"));
	        driver.navigate().back();
	        driver.navigate().forward();
	        driver.navigate().refresh();
	}
}

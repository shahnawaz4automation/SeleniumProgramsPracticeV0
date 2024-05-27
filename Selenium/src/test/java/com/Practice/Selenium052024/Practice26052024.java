package com.Practice.Selenium052024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice26052024 {
	@Test
	public void test() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		
		String currentTitle = driver.getTitle();
		System.out.println(currentTitle);
		
		System.out.println(driver.getCurrentUrl());
		
	}
	
	
}

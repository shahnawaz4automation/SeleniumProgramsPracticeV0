package com.Practice.Selenium062024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToolTipPractice1 {
	@Test
	public void validateToolTip() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
}

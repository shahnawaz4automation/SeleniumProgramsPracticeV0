package com.Practice.Selenium062025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice23062025 {
	@Test
	public void program() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
	}
}

package com.Practice.Selenium092024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseFunctionTest {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.facebook.com");
		driver.close();
		}
}

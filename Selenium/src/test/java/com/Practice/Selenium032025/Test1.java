package com.Practice.Selenium032025;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		String URL = "https://www.google.com";
		String URL2 = "https://www.facebook.com";
		URL = URL2;

		System.out.println(URL);
		driver.get(URL);
	}
}

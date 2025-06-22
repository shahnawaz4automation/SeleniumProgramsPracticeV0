package com.Practice.Selenium032025;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class plan2206 {
	
	@Test
	public void launchBrowser() {
		Scanner scan = new Scanner(System.in);
		String browser = scan.next();
		
		switch (browser) {
		case "chrome" : WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com"); break;
		}
	}
}

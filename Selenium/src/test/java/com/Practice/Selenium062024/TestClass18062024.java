package com.Practice.Selenium062024;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass18062024 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Options option = driver.manage();
		Timeouts timeout = option.timeouts();
		timeout.implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.com");
		TestClass18062024.takeScreeshot(driver);
		System.out.println("Screenshot is taken, refresh the directory and check");
	
		driver.quit();
	}

	public static void takeScreeshot(WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String str = RandomStringUtils.randomAlphabetic(5);
		File trg = new File("./screenshots/"+str+"homepage.png");
		FileUtils.copyFile(src, trg);
	}

}

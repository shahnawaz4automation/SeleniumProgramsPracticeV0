package com.Practice.Selenium062024;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
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
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\screenshots\\homepage.png");
		FileUtils.copyFile(src, trg);
		
		System.out.println("Screenshot is taken, refresh the directory and check");
	}

}

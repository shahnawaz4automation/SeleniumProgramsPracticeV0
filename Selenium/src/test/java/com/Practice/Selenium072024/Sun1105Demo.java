package com.Practice.Selenium072024;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Sun1105Demo {
	public final Logger logger = LogManager.getLogger();
	@Test
	public void test() throws IOException {
		WebDriver driver = new ChromeDriver();
		logger.info("Initialized chrome driver");
		driver.manage().window().maximize();
		logger.info("Maximized the window");
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement nameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
		logger.info("Element is loaded and is visible");
		nameInput.sendKeys("Mohammed");
		logger.info("Entered data in name input field");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File tgt = new File("./screenshots/namefield.png");
		FileUtils.copyFile(src, tgt);
		logger.info("Taken screenshot");
		
		
	}
}

package com.Practice.Selenium072024;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import jdk.internal.org.jline.utils.Log;

public class DemoGuru2807 {
	private static Logger logger;
	private static WebDriver driver;
	private static String browser;
	@Test
	public void test(){
		logger = LogManager.getLogger();
		driver = new ChromeDriver();
		if(browser=="chrome") {
			driver= new ChromeDriver();
		}else if(browser=="edge") {
			driver= new EdgeDriver();
		}else if(browser=="firefox") {
			driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		logger.info("Maxized the browser");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://demo.guru99.com/v4/index.php");
		logger.info("Login page opened");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement userId = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='uid']")));
		userId.sendKeys("mngr582629");
		logger.info("Entered Username");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("AsasYjA");
		logger.info("Entered Password");
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		logger.info("Clicked Enter");
		
		String elementText = driver.findElement(By.xpath("//h2[@class='barone']")).getText();
		Assert.assertTrue(elementText.contains("Guru99 Bank"));
		logger.info("Successfully logged in to the application");
		
	}
}

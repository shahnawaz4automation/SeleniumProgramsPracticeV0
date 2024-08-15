package com.Practice.Selenium082024;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class DemoGuru150824 {
	private static RemoteWebDriver driver;
	public static Logger logger = LogManager.getLogger();

	@Test
	public void appTest() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/v4/index.php");
		logger.info("Lauched the URL");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement userId = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='uid']")));

		userId.sendKeys("mngr582629");
		logger.info("Entered Username");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("AsasYjA");
		logger.info("Entered Password");

		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();

		boolean a = driver.getPageSource().contains("Guru99 Bank");
		if (a == true) {
			System.out.println("Successfully logged in to application");
		} else {
			System.out.println("Did not login to application");
		}

		TakesScreenshot ts = driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("./screenshots/kulsum.png");
		FileUtils.copyFile(src, trg);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}

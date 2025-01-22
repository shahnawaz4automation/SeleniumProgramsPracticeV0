package com.Practice.Selenium082024;

import java.io.File;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoGuru2208 {
	private static ChromeDriver driver;
	private static Logger logger;

	public static void main(String[] args) throws Exception {
		logger = LogManager.getLogger();
		driver = new ChromeDriver();
		logger.info("Chrome Driver launched");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.guru99.com/V4/index.php");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement userId = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='uid']")));

		userId.sendKeys("mngr601045");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("enabypY");

		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();

		driver.switchTo().alert().accept();

		TakesScreenshot ts = driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\screenshots\\22082024.png");
		FileUtils.copyFile(src, trg);

		//driver.quit();
	}
}

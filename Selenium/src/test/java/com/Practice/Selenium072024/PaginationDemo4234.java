package com.Practice.Selenium072024;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaginationDemo4234 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/admin/");
		
		By username = By.xpath("//input[@name='username']");
		WebElement userName = explicitWait(driver, 10, username);
		userName.clear();
		userName.sendKeys("demo");
		
		WebElement passWord = driver.findElement(By.xpath("//input[@name='password']"));
		passWord.clear();
		passWord.sendKeys("demo");
		File src = passWord.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\Screenshots\\screenshto.png");
		try {
			FileUtils.copyDirectory(src, trg);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		
	}
	
	public static WebElement explicitWait(WebDriver driver, int timeout, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return element;
	}
}

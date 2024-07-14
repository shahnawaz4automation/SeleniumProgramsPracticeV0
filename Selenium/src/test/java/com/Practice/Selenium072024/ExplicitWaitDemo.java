package com.Practice.Selenium072024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
	static WebElement element;
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com");
		
		By locator = By.xpath("//img[@class='lnXdpd']");
		waitForElementPresent(driver, locator, 10).sendKeys("selenium");
		
	}
	
	public static WebElement waitForElementPresent(WebDriver driver, By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		return element;
		
	}
}

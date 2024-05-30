package com.Practice.Selenium052024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practice30052024 {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("maximized the window");
		driver.get("https://tutorialsninja.com/demo/");
		System.out.println("Site loaded");
		By by = By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a");
		
		WebElement element = waitForElementPresent(driver, by, 10);
		element.click();
		
		System.out.println("waited for element");
		driver.findElement(By.xpath("/html/body/div[1]/nav/div[2]/ul/li[1]/div/div/ul/li[1]/a")).click();
		driver.quit();
	}

	public static WebElement waitForElementPresent(WebDriver driver, By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		return driver.findElement(locator);

	}

}

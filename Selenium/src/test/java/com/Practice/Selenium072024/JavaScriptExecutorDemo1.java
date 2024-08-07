package com.Practice.Selenium072024;

import java.time.Duration;
import java.util.Hashtable;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JavaScriptExecutorDemo1 {
	public static void main(String[] args) throws InterruptedException {
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");

		WebElement home = driver.findElement(By.xpath("//span[@id='home']"));
		System.out.println(home.getText());

		WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Check this')]"));
		JavascriptExecutor js = driver;
		js.executeScript("arguments[0].scrollIntoView(true);", button);

		js.executeScript("arguments[0].click();", button);

		Thread.sleep(20000);

		if (driver.findElement(By.xpath("//input[@id='dte' and @type='checkbox']")).isEnabled())
			System.out.println("Button is enabled");

		if (driver != null) {
			driver.quit();
		}

		driver.findElement(By.xpath("//input[@id='dte' and @type='checkbox']"));

	}
}

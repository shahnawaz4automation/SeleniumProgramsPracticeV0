package com.Practice.Selenium052024;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewSeleniumProgram {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");

		//driver.get("https://omayo.blogspot.com/");
		URL url = new URL("https://omayo.blogspot.com/");
		driver.navigate().to(url);
		WebElement button1 = driver.findElement(By.xpath("//button[contains(text(),'Button2')]"));
				
		driver.navigate().back();
		Thread.sleep(10000);
		driver.navigate().forward();
		Thread.sleep(10000);
		driver.navigate().refresh();

	}

}

package com.Practice.Selenium052024;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewSeleniumProgram {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

		driver.get("https://omayo.blogspot.com/");
		WebElement button1 = driver.findElement(By.xpath("//button[contains(text(),'Button2')]"));
		
		button1.isDisplayed();
		
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		
		WebElement textArea = driver.findElement(By.id("textbox1"));
		textArea.clear();
		
		textArea.sendKeys("Mohammed Shahnawaz");
		
		//driver.close();
		
		
	}

}

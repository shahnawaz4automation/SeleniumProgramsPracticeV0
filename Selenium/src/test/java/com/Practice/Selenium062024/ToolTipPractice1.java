package com.Practice.Selenium062024;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToolTipPractice1 {
	@SuppressWarnings("deprecation")
	@Test
	public void validateToolTip() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://seleniumpractise.blogspot.com/2019/09/bootstrap-tooltip-in-selenium.html");
		
		WebElement elementToMouseHover = driver.findElement(By.xpath("//a[text()='Hover over me']"));
		Actions act = new Actions(driver);
		act.moveToElement(elementToMouseHover).perform();
		
		String text = driver.findElement(By.xpath("//div[@class='tooltip-inner']")).getText();
		
		Assert.assertTrue(text.contains("Hooray"));
		
		Date dt = new Date();
		int year = dt.getYear();
		int date = dt.getDate();
		int month = dt.getMonth();
		
		System.out.println(year+"/"+month+"/"+date);
		driver.quit();
	}
	
}

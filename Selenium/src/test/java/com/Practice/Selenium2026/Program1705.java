package com.Practice.Selenium2026;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Program1705 {
	@Test
	public void launchBrowser(){
		WebDriver driver = new ChromeDriver();
		
		String url = "https://omayo.blogspot.com/";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement textArea2 = driver.findElement(By.xpath("//textarea[contains(text(),'The cat was playing in the garden.')]"));
		textArea2.clear();
		textArea2.sendKeys("searchArea");
		
		driver.findElement(By.xpath("//input[@value='male']")).click();
		
		driver.findElement(By.xpath("//input[@value='ClickToGetAlert']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		driver.findElement(By.xpath("//input[@value='female']")).click();
		driver.quit();
		
		
		//WebElement searchArea = driver.findElement(By.xpath("//textarea[@title='Search']"));
		//searchArea.sendKeys("searchArea");
		//searchArea.sendKeys(Keys.ENTER);
	}
	
}

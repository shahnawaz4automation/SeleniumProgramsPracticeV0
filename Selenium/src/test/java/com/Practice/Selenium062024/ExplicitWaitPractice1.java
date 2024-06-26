package com.Practice.Selenium062024;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitWaitPractice1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com");
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='L3eUgb']"));
		Iterator<WebElement> it = elements.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next().getText());			
		}
		
	}

}

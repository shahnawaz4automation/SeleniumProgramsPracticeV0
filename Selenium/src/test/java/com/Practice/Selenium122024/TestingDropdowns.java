package com.Practice.Selenium122024;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestingDropdowns {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hi");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='country']"));
		Select select = new Select(dropdown);
		
		select.selectByIndex(2);
		Thread.sleep(1000);
		select.selectByIndex(0);
		Thread.sleep(1000);
		select.selectByVisibleText("India");
		Thread.sleep(1000);
		select.selectByValue("germany");
		
		List<WebElement> dropdownValues = select.getOptions();
		System.out.println(dropdownValues.size());
		
		for(int i = 0; i <dropdownValues.size(); i++)
		{
			System.out.println(dropdownValues.get(i).getClass());
		}
		driver.quit();
	}

}

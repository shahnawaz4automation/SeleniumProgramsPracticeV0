package com.Practice.Selenium072024;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch_AutoSuggestDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.com");
		WebElement searchTextArea = driver.findElement(By.xpath("//textarea[@title='Search']"));
		searchTextArea.sendKeys("selenium");
		Thread.sleep(5000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='presentation']//span[contains(text(),'lenium')]//b"));
		int size = list.size();
		

		for (int i = 0; i < size; i++) {
			if(list.get(i).getText().contains("webdriver")) {
				list.get(i).click();
				break; //*****************************very important
			}
		}
		/*
		 * for (WebElement option : list) { String optionText = option.getText(); if
		 * (optionText.contains("webdriver")) { option.click(); break; } }
		 * WebElement option = list.get(i);
			String optionText = option.getText();
			if (optionText.equals("selenium")) {
				option.click();
			}
		 */
		Thread.sleep(1000);
		driver.quit();
	}

}

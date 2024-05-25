package com.Practice.Selenium052024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewSeleniumProgram {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		driver.get("https://omayo.blogspot.com/");
		WebElement button1 = driver.findElement(By.xpath("//button[contains(text(),'Button2')]"));
		System.out.println(button1.isDisplayed());
		System.out.println(button1.isEnabled());
		System.out.println(button1.isSelected());

	}

}

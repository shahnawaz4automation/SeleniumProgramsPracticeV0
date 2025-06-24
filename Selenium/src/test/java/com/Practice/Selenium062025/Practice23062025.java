package com.Practice.Selenium062025;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice23062025 {
	WebElement books;
	@Test
	public void program() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"HTML11\"]/div[1]/textarea")).getAttribute("name"));
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\"but1\"]"));
		System.out.println(button.isEnabled());
		System.out.println(button.isDisplayed());
		System.out.println(button.isSelected());
		
		driver.quit();
	}
}

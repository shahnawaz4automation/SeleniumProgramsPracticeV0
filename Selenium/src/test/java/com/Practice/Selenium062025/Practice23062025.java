package com.Practice.Selenium062025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice23062025 {
	@Test
	public void program() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement books = driver.findElement(By.xpath("//a[@href=\"/Books/b/?ie=UTF8&node=976389031&ref_=nav_cs_books\"]"));
		String innerText = books.getText();
		System.out.println("Text is: " + innerText);
		
		driver.close();
	}
}

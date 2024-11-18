package com.Practice.Selenium112024;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingSelenium1711 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://example.com");

		// Locate the element
		WebElement element = driver.findElement(By.cssSelector(".your-class"));

		// JavaScript to get the computed style of the ::before pseudo-element
		String script = "return window.getComputedStyle(arguments[0], '::before').getPropertyValue('content')";
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Execute the script
		String pseudoContent = (String) js.executeScript(script, element);
		// (or) js.executeScript returns an object so we can use toString():
		// js.executeScript(script, element).toString();

		System.out.println("Pseudo-element content: " + pseudoContent);
		driver.quit();
	}
}

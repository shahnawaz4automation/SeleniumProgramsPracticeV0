package com.Practice.Selenium072024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestNGassertionDemo1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		WebElement img = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		String value = img.getAttribute("alt");
		System.out.println(value);
		
		Assert.assertEquals("Google", value);
		Assert.assertTrue(value.contains("gle"));
		Assert.fail("This test is supposed to fail.");
		driver.quit();
	}

}

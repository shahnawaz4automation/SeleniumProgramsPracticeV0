package com.Practice.Selenium052024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice27052024 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[4]/div/a")).click();
		
		driver.close();
	}

}

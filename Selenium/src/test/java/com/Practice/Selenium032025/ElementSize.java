package com.Practice.Selenium032025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementSize {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
		driver.get("https://tutorialsninja.com/demo/");
		WebElement search = driver.findElement(By.name("search"));
		
		int height = search.getSize().getHeight();
		int width = search.getSize().width;
		System.out.println(search.getSize()+"_____________"+height+"_____________"+width);
		
		int x = search.getLocation().x;
		int y = search.getLocation().y;
		System.out.println(search.getLocation()+"_____________"+x+"_____________"+y);

		System.out.println(search.getRect());
		
		driver.quit();
	}

}

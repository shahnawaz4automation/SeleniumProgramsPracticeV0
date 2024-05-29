package com.Practice.Selenium052024;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice29052024 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		String name = driver.getClass().getName();
		System.out.println("name is: "+name);
		
		String simplename = driver.getClass().getSimpleName();
		System.out.println("simple name is: "+simplename);
		System.out.println(Practice29052024.class.getSimpleName());
		
		driver.quit();
	}
	

}

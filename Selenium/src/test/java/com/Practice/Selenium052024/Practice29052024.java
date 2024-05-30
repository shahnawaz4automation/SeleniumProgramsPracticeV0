package com.Practice.Selenium052024;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice29052024 {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		System.out.println("maximized the window");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.get("https://tutorialsninja.com/demo/");
		System.out.println("url loaded");
		String name = driver.getClass().getName();
		System.out.println("name is: "+name);
		
		String simplename = driver.getClass().getSimpleName();
		System.out.println("simple name is: "+simplename);
		System.out.println(Practice29052024.class.getSimpleName());
		
		driver.quit();
	}
	

}

package com.Practice.Selenium052024;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice29052024 {
	@Test
	public void practice(){
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		//driver
	}
	

}

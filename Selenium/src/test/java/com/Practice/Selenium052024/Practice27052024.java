package com.Practice.Selenium052024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice27052024 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.get("https://omayo.blogspot.com/");
		
		String value = driver.findElement(By.xpath("//*[@id=\"textbox1\"]")).getAttribute("value");
		System.out.println(value);
		//driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[4]/div/a")).click();
		
		//driver.switchTo().newWindow(WindowType.TAB);
		// Opens LambdaTest homepage in the newly opened window
		//driver.navigate().to("https://www.lambdatest.com/");
		
		driver.quit();
	}

}

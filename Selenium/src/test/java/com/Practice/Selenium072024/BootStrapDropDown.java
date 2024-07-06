package com.Practice.Selenium072024;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
		
		//driver.findElement(By.xpath("//input[@value='Angular']")).click();
		
		List<WebElement> dropDownValues = driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//a//label"));
		int sizeOfValues = dropDownValues.size();
		System.out.println(sizeOfValues);
		for(WebElement options: dropDownValues) {
			String text = options.getText();
			
			if(text.contains("Angular")||text.contains("Java")||text.contains("Bootstrap")) {
				options.click();
			}
		}
	}
}

package com.Practice.Selenium072024;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectDropDown {
	@Test
	public void selectDropDown() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");

		WebElement dropDown = driver.findElement(By.id("country"));
		Select select = new Select(dropDown);

		List<WebElement> dropDownValues = select.getOptions();
		System.out.println("Total dropdown values: " + dropDownValues.size());
	}
}

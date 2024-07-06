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
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://testautomationpractice.blogspot.com/");

		WebElement dropDown = driver.findElement(By.id("country"));
		if (dropDown.isDisplayed()) {
			Select select = new Select(dropDown);
			List<WebElement> dropDownValues = select.getOptions();
			System.out.println("Total dropdown values: " + dropDownValues.size());

			for (int i = 0; i < dropDownValues.size(); i++) {
				System.out.println(dropDownValues.get(i).getText());
			}
		}
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");

		driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();

		// driver.findElement(By.xpath("//input[@value='Angular']")).click();

		List<WebElement> dropDownValues = driver
				.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//a//label"));
		int sizeOfValues = dropDownValues.size();
		System.out.println(sizeOfValues);
		for (WebElement options : dropDownValues) {
			String text = options.getText();

			if (text.contains("Angular") || text.contains("Java") || text.contains("Bootstrap")) {
				options.click();
			}
		}
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		driver.get("http://testautomationpractice.blogspot.com/");

		WebElement dropDown1 = driver.findElement(By.id("country"));
		if (dropDown1.isDisplayed()) {
			Select select = new Select(dropDown1);
			List<WebElement> dropDownValues1 = select.getOptions();
			System.out.println("Total dropdown values: " + dropDownValues1.size());

			for (int i = 0; i < dropDownValues1.size(); i++) {
				System.out.println(dropDownValues1.get(i).getText());
			}
		}
		driver.quit();
	}
}

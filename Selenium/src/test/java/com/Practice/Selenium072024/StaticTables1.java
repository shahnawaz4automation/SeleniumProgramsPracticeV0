package com.Practice.Selenium072024;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTables1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");

		// 1. find number of rows in the table
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr"));
		System.out.println("Total number of rows in the static table are: " + rows.size());

		// 2. find number of columns in the table
		List<WebElement> columns = driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr[2]//td"));
		System.out.println("Total number of columns in the static table are: " + columns.size());

		// 3. Read data from specific row and column (Ex: 5th row and 1st column)
		WebElement element51 = driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr[5]//td[1]"));
		System.out.println(element51.getText());

		// 4. Read data from all the rows and columns
		// table[@name='BookTable']//tbody//tr[2]//td[1]

		for (int r = 2; r <= rows.size(); r++) {
			for (int c = 1; c <= columns.size(); c++) {
				Object text = driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(text);
				
				System.out.print("\t");
			}
			System.out.println();
		}
		closeDriver(driver);
	}

	public static void closeDriver(WebDriver driver) {
		driver.quit();
	}

}

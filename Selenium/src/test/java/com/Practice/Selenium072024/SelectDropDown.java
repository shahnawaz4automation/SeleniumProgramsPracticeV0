package com.Practice.Selenium072024;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectDropDown {
	@Test
	public void selectDropDown() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String URL = "https://testautomationpractice.blogspot.com/";
		driver.get(URL);

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
		
	    WebElement field1 = driver.findElement(By.xpath("//input[@id='field1']"));
	    field1.clear();
	    String name = "Mohammed Shahnawaz";
	    field1.sendKeys(name);
	    WebElement copyTextButton = driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
	    Actions action = new Actions(driver);
	    action.doubleClick(copyTextButton).build().perform();
	    System.out.println("Double clicked");
	    String field2text = driver.findElement(By.xpath("//input[@id='field2']")).getAttribute("value");
	    System.out.println(field2text);
	    if(field2text.equalsIgnoreCase(name)) {
	    	System.out.println("Double clicked and the text is copied");
	    }else {
	    	System.out.println("text not copied");
	    }
	    
	    driver.findElement(By.xpath("//a[@class='wikipedia-search-wiki-link']")).click();
	    Thread.sleep(1000);
		
	    System.out.println(driver.getClass().getSimpleName());
	    //driver.quit();
	}
}

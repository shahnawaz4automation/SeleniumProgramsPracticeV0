package com.Practice.Selenium072024;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement element = driver.findElement(By.xpath("xpath"));
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		act.sendKeys(Keys.BACK_SPACE).perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.ESCAPE).perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);//CTRL+C
		
		
	}
}

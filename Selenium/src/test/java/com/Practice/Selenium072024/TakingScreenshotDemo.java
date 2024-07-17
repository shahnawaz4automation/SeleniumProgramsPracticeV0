package com.Practice.Selenium072024;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TakingScreenshotDemo {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File tgt = new File(".\\screenshots\\homepage.png");
		FileUtils.copyFile(src, tgt);
		
		WebElement img = driver.findElement(By.xpath("//img[@alt='Google']"));
		File src1 = img.getScreenshotAs(OutputType.FILE);
		File tgt1 = new File(".\\screenshots\\image.png");
		FileUtils.copyFile(src1, tgt1);
		
		String buttonText = driver.findElement(By.xpath("//input[@value='Google Search']")).getAttribute("value");
		Assert.assertEquals(buttonText, "Google Search");
		driver.quit();
	}

}

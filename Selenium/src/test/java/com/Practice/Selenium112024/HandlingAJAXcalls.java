package com.Practice.Selenium112024;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAJAXcalls {
	private static Logger logger;
	
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		logger = LogManager.getLogger();
		
		driver.get("https://testautomationpractice.blogspot.com/p/gui-elements-ajax-hidden.html");
		logger.info("URL lauched");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='Load AJAX Content']")).click();
		
		//WebElement loadedElement = driver.findElement(By.xpath("//div[@id='ajaxContent']/h2"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement loadedElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ajaxContent']/h2")));
        
        System.out.println(loadedElement.getText());
        
        String style = loadedElement.getCssValue("font-size");
        
        System.out.println(style);
        
        if(style.equals("22px")) {
        	System.out.println("Style is correct");
        }
        else {
        	System.out.println("Style is incorrect");
        }
        TakesScreenshot ts = (TakesScreenshot)driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File trg = new File("./screenshots/Screenshot.png");
        FileUtils.copyFile(src, trg);
		driver.quit();
		
	}
}
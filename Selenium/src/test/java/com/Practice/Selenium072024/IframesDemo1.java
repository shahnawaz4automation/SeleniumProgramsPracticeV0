package com.Practice.Selenium072024;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IframesDemo1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		By iframe1 = By.xpath("//iframe[@id='iframeResult']");
		WebElement outerIframe = explicitWait(driver, 130, iframe1);
		
		//1. Switching to inner iframe.
		driver.switchTo().frame(outerIframe);
		String outerText = driver.findElement(By.xpath("//body[@contenteditable='false']//p")).getText();
		if(outerText.contains("You can use the height and width attributes to specify the size of the iframe")) {
			System.out.println("Successfully switched to outerIframe");
		}
		else {
			System.out.println("Did not switch to outerIframe");
		}
		
		By iframe2 = By.xpath("//iframe[@title='Iframe Example']");
		WebElement innerIframe = explicitWait(driver, 30, iframe2);
		//2. Switching to outer iframe.
		driver.switchTo().frame(innerIframe);
		String innerText = driver.findElement(By.xpath("//body[@style='background-color:powderblue']//h1[1]")).getText();
		if(innerText.contains("This page is displayed in an iframe")) {
			System.out.println("Successfully switched to inner Iframe");
		}
		else {
			System.out.println("Did not switch to inner Iframe");
		}
		driver.switchTo().defaultContent();
		String outerText1 = driver.findElement(By.xpath("//body[@contenteditable='false']//p")).getText();
		if(outerText1.contains("You can use the height and width attributes to specify the size of the iframe")) {
			System.out.println("Successfully switched back to outerIframe");
		}
		else {
			System.out.println("Did not switch back to outerIframe");
		}
		//String text = driver.findElement(By.xpath("//span[text()='HTML Iframes']")).getText();
		//System.out.println(text);
	}
	public static WebElement explicitWait(WebDriver driver, int timeout, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
}

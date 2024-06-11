package com.Practice.Selenium062024;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//We cannot instantiate the interface so we have to use the class
		//   which has implemented this interface.
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("Opened the url");
		
		String windowId = driver.getWindowHandle();
		System.out.println("Window handle is: " + windowId);
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIds = driver.getWindowHandles();
		Iterator<String> itr = windowIds.iterator();
		String parentWindowId = itr.next();
		String childWindowId = itr.next();
		System.out.println("Parent window handle: "+parentWindowId);
		System.out.println("Child window handle: "+childWindowId);
		
		driver.switchTo().window(childWindowId);
		driver.findElement(By.xpath("//*[@id=\"Form_submitForm_action_request\"]")).click();
		System.out.println("Performed operation on child window");
		//driver.switchTo().defaultContent();
		driver.switchTo().window(parentWindowId);
		System.out.println("Switched to parent window");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		System.out.println("Performed operation on parent window");
		
		Thread.sleep(10000);
		driver.close();
	}

}

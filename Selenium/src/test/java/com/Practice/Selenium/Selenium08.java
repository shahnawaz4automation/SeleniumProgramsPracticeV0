package com.Practice.Selenium;

import org.openqa.selenium.edge.EdgeDriver;

public class Selenium08 {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		/*
		 * Dynamic Dispatch -> Runtime Poly (Dynamic dispatch allows you to refer to a child class object with a parent class reference 
		 * (polymorphism), and the method calls are decided at runtime based on the actual object type, not the reference type.) 
		 * ----> How Dynamic Dispatch Works?
		 * == Compile-Time: The compiler checks if the get() method exists in the WebDriver interface, and it does.
		 * The compiler doesn’t know yet which specific version of get() will be executed. 
		 * 
		 * == Runtime: At runtime, the JVM knows that the object is of type EdgeDriver, so it calls the get() method of EdgeDriver, 
		 * not some other implementation.*/
		driver.get("https://sdet.live");

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		// driver.close(); // Close the Current Browser Window - not the full browser
		// Closed the window, Session id != null, Error - Invalid session Id

		driver.close();
		// Close all the /sessions/windows and stop the browser
		// diver.quit(); // Closed All the window and Session = null, Error - Session ID
		// is null
	}
}

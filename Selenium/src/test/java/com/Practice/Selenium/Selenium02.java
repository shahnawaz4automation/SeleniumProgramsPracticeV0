package com.Practice.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium02 {
	// Theory - Inheritance and Upcasting (Dynamic Dispatch/runtime polymorphism or late binding)
	//Dynamic dispatch is a powerful feature in OOP that allows for dynamic method resolution at runtime. It makes code more flexible and helps in achieving polymorphism, where the exact method that is executed depends on the actual object being referenced, not just the type of the reference itself.
	// This is called dynamic dispatch or upcasting in OOP, where a parent class (WebDriver) reference can point to any of its child classes (like ChromeDriver, EdgeDriver, etc.).

	//Dynamic dispatch relies on inheritance and method overriding. In OOP, a base class (parent class) defines a method, and a derived class (child class) can override this method to provide a specific implementation.
	//For example, consider a Vehicle class with a method start(). A Car class, which extends Vehicle, might override the start() method to include specific steps for starting a car.
	//base class => Vehicle (C) with the derived classes => Car (C) and Bike (C)
	
	//Key Points:
	//1. Flexible and Reusable Code: Dynamic dispatch allows for writing flexible and reusable code. You can use a single reference type to interact with different object types, depending on the situation.
	//2. Polymorphism: This is an example of polymorphism, where a single interface (in this case, the start() method in the Vehicle class) can represent multiple forms (the different implementations in Car and Bike).
	//3. Real-World Analogy: Think of dynamic dispatch as similar to a person who can follow different instructions based on the job they're given. For example, if you ask a driver to "start the vehicle," they will know whether to start a car or a bike depending on the specific vehicle they are given at that moment.
	@Test
	    public void testMethod(){
	        //Import Concept of OOPs ->

	        // interface interfaceRef = new Class();
	        //  1. Inheritance
	        //  2. - Upcasting -> Dynamic Dispatch

	        // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
	        // Max -> Selenium 4

//	        WebDriver driver = new EdgeDriver();
//	        WebDriver driver2 = new ChromeDriver();
//	        WebDriver driver3 = new FirefoxDriver();
//	        WebDriver driver4 = new InternetExplorerDriver();
//	        WebDriver driver5 = new SafariDriver();

	        // Opera - Selenium 4- Removed!


//	        SearchContext(I) (2) -> WebDriver(I)( 10) -> RemoteWebDriver(C) (15) -> ChromiumDriver(C) 25 -> EdgeDriver(C) (45)
//	        SearchContext(I) -> WebDriver(I) -> RemoteWebDriver(C) -> ChromiumDriver(C) -> ChromeDriver(C)

	        // SearchContext - Interface - findElement, and findElements - GGF
	        // WebDriver - Interface - some incomplete functions - GF
	        // RemoteWebDriver - Class- It also has some functions - F
	        // ChromeDriver, FirefoxDriver, EdgeDriver, SafariDriver, InternetExplorerDriver  Class - S


	        // Selenium - Arch - API
	        // Create Session, Commands or Functions -> API Request to Browser Driver (
	        // Pass the commands as API

	        // SearchContext driver = new ChromeDriver(); // Dynamic Dispatch (Upcasting) - GF, F, can Ref to Child Object -- OOPs
	        //WebDriver driver = new ChromeDriver();
	        // RemoteWebDriver driver1 = new ChromeDriver();

	        //EdgeDriver driver = new EdgeDriver();  // Case 1
	        WebDriver driver1 = new EdgeDriver(); // Case 2
	        driver1 = new ChromeDriver();
	        // Interview Why we use Case 2 , not the 1
	        // If use the Line 51 - EdgeDriver driver = new EdgeDriver();
	        // You will not be able to reuse the driver instance or ref
	        // So it means, You can't change the browser in the script.


	        // Scenarios

	        // 1. Do want to run on  Chrome or Edge?
	        //ChromeDriver driver = new ChromeDriver();


	        // 2  Do you want to run on Chrome then change to Edge ?
	        // WebDriver driver = new ChromeDriver();
	        // driver = new EdgeDriver();


	        // 3. do you want to run on multiple browsers?
	        // RemoteWebDriver driver (with GRID) - Advance (Last 2 Sessions)

	        //---------------------------------------------------------------------------------------------------------------
	     // In object-oriented programming (OOP), we can use interfaces and classes in a flexible way.
	        // The basic idea is to use a general reference (like WebDriver) to refer to specific objects (like ChromeDriver or EdgeDriver).

	        // Let's imagine:
	        // WebDriver is like a remote control that can operate different types of devices (browsers).
	        // ChromeDriver, EdgeDriver, etc., are the actual devices (browsers) the remote control can operate.

	        // Here's what the code is doing:

	        // 1. Create a new EdgeDriver (browser) using a WebDriver reference (remote control).
	        WebDriver driver2 = new EdgeDriver();

	        // 2. Now, change the reference to point to a different browser (ChromeDriver).
	        driver2 = new ChromeDriver();

	        // Why is this useful?
	        // If you had used EdgeDriver driver = new EdgeDriver(); (Case 1),
	        // you would be stuck with only EdgeDriver. You couldn't reuse the same reference to switch to another browser like ChromeDriver.
	        // By using WebDriver driver1, you can easily switch between different browsers.
	        
	        // This is called dynamic dispatch or upcasting in OOP, where a parent class (WebDriver) reference can point to any of its child classes (like ChromeDriver, EdgeDriver, etc.).



	    }
	}

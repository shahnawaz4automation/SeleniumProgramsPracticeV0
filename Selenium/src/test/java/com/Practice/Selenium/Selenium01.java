package com.Practice.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium01 {
	public static void main(String[] args) {
		/*
		 * Selenium Flow 
		 * 1. Create Session, ID - q09876q789e8wq89we87
		 * 2. Session -> Run the commands - GET -> GET Method w3c Protocol 
		 * 3. EdgeDriver (Server) -> Tell the Edge Browser 
		 * 4. Open a Fresh copy of thre Edge Browser and Open the URL - https//sdet.live
		 * 5. Driver - Command (POST) Request - Shutdown the browser. Selenium Flow: Create a Session:
		 * 
		 * 1. A session is initiated, identified by a unique session ID (e.g.,
		 * q09876q789e8wq89we87). Run Commands in the Session:
		 * 
		 * 2. Commands are executed within this session. For example, a GET request is sent
		 * using the W3C WebDriver protocol to retrieve the specified web page.
		 * EdgeDriver Communicates with the Browser:
		 * 
		 * 3. The EdgeDriver (which acts as a server) relays these commands to the Edge
		 * browser. Open Browser and Navigate to URL:
		 * 
		 * 4. The Edge browser opens a new window and navigates to the specified URL (e.g.,
		 * https://sdet.live). Shutdown the Browser:
		 * 
		 *5. A POST request is sent to the driver, instructing it to close the browser and
		 * end the session.
		 */
		WebDriver driver = new EdgeDriver();
		driver.get("https://sdet.live");
	    driver.quit();
	}
}

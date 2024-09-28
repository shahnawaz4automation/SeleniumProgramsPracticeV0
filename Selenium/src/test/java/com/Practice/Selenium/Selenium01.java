package com.Practice.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium01 {
	public static void main(String[] args) {
		/* Selenium Flow 
		  1. Create Session, ID - q09876q789e8wq89we87
		  2. Session -> Run the commands - GET -> GET Method w3c Protocol 
		  3. EdgeDriver (Server) -> Tell the Edge Browser 
		  4. Open a Fresh copy of thre Edge Browser and Open the URL - https//sdet.live
		  5. Driver - Command (POST) Request - Shutdown the browser. Selenium Flow: Create a Session:
		  
		  1. A session is initiated, identified by a unique session ID (e.g.,
		  q09876q789e8wq89we87). Run Commands in the Session:
		  or
		  When a Selenium script is initiated, a session is created with a unique session ID 
		  (e.g., q09876q789e8wq89we87). This session ID is used to maintain communication between 
		  the WebDriver (like EdgeDriver) and the browser (like Microsoft Edge) throughout the test execution.
		  
		  2. Commands are executed within this session. For example, a GET request is sent
		  using the W3C WebDriver protocol to retrieve the specified web page.
		  EdgeDriver Communicates with the Browser:
		  or
		  Session -> Run Commands:
		  Once the session is created, commands are sent to the WebDriver using 
		  methods such as GET. The WebDriver in turn communicates with the browser via the W3C WebDriver
		   protocol (which is the current standard).
		  
		  3. The EdgeDriver (which acts as a server) relays these commands to the Edge
		  browser. Open Browser and Navigate to URL:
		  or
		  EdgeDriver (Server) -> Communication with Edge Browser: 
		  The EdgeDriver acts as a server and communicates with the Edge browser, 
		  sending instructions like opening pages, clicking elements, etc. The driver 
		  translates the Selenium WebDriver API calls into actions the browser understands.
		  
		  4. The Edge browser opens a new window and navigates to the specified URL (e.g.,
		  https://sdet.live). Shutdown the Browser:
		  or
		  Open a Fresh Copy of Edge and Navigate to URL:
		  A new instance of the Edge browser is opened, and the browser is instructed to navigate to a 
		  specified URL, for example, https://sdet.live. The GET method is used to load this webpage.
		  
		  5. A POST request is sent to the driver, instructing it to close the browser and
		  end the session.
		  or
		  Driver Sends a Shutdown Command:
          After performing the necessary operations, the WebDriver sends a POST request to the browser, 
          instructing it to close. This effectively ends the session, closing the browser window and shutting
           down the WebDriver server instance.
		 */
		WebDriver driver = new EdgeDriver();
		driver.get("https://sdet.live");
	    driver.quit();
	}
}

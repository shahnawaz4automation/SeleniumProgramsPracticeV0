package com.Practice.Selenium;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Selenium05 {

	public static void main(String[] args) {


        EdgeOptions edgeOptions = new EdgeOptions();
        /*
        * 1. headless - options.addArguments("--headless");
        * 2. start max - edgeOptions.addArguments("--start-maximized");
        * 3. window - edgeOptions.addArguments("--window-size=800,600");
        * 4. add extentions -edgeOptions.addExtensions(new File("/Users/pramod/Downloads/AdBlock1.crx"));
        * 5. 100 of another options - you can use it
        *
        * */

        edgeOptions.addArguments("--start-maximized");
        //edgeOptions.addArguments("--window-size=800,600");
        edgeOptions.addArguments("--incognito");
        EdgeDriver driver = new EdgeDriver(edgeOptions); // Dynamic Dispatch -> Runtime Poly
        driver.get("https://sdet.live");
        System.out.println(driver.getTitle());
        
        driver.quit();



    }

}

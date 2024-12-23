package com.Practice.Selenium112024;

public class DynamicUrlTest {
	// Using StringBuilder
	String baseURL = "https://example.com";
	StringBuilder dynamicURL = new StringBuilder(baseURL);
	dynamicURL.append("/login?user=").append("testUser");
	System.out.println(dynamicURL);

	// Output: https://example.com/login?user=testUser

}

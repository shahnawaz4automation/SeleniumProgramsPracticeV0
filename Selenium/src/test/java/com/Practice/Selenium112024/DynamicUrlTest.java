package com.Practice.Selenium112024;

public class DynamicUrlTest {

	public static void main(String[] args) {

		// Using StringBuilder
		String baseURL = "https://example.com";
		StringBuffer dynamicURL = new StringBuffer(baseURL);
		dynamicURL.append("/login?user=").append("testUser");
		System.out.println(dynamicURL);

		// Output: https://example.com/login?user=testUser

	}
}

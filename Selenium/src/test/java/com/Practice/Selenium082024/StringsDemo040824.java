package com.Practice.Selenium082024;

public class StringsDemo040824 {
	public static void main(String[] args) {
		String s = "Welcome";
		String s1 = " To Java";
		String so = new String("Welcome");
		String si = "Welcome";
		System.out.println("Length of string object is: "+s.length());
		
		String s2 = s+s1;
		System.out.println("String added is: "+ s2);
		
		String s3 = s.concat(s1);
		System.out.println("String concatenated is: "+ s3);
		
		so=so.intern();
		System.out.println(s==so);
		System.out.println(".equals " +s.equals(so));
		System.out.println();
	}
}

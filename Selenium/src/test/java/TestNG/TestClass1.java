package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 extends BeforeTestSuite{
	@BeforeClass
	public void setUp() {
		System.out.println("TestClass1--before class");
	}

	@AfterClass
	public void cleanUp() {
		System.out.println("TestClass1--after class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("TestClass1--before method");
	}

	@AfterMethod
	public void afterMehtod() {
		System.out.println("TestClass1--after method");
	}

	@Test
	public void testMethod1() {
		System.out.println("TestClass1--test1");
	}

	@Test
	public void testMethod2() {
		System.out.println("TestClass1--test2");
	}
}

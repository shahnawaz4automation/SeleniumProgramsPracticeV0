package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass2 extends BeforeTestSuite{
	@BeforeClass
	public void setUp() {
		System.out.println("TestClass2--before class");
	}

	@AfterClass
	public void cleanUp() {
		System.out.println("TestClass2--after class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("TestClass2--before method");
	}

	@AfterMethod
	public void afterMehtod() {
		System.out.println("TestClass2--after method");
	}

	@Test(priority=2)
	public void testMethod1() {
		System.out.println("TestClass2--test1");
	}

	@Test(alwaysRun = false)
	public void testMethod2() {
		System.out.println("TestClass2--test2");
	}
}

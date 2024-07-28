package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BeforeTestSuite {
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeTestSuite--beforeClass");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("BeforeTestSuite--afterClass");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTestSuite--beforeTest");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("BeforeTestSuite--afterTest");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeTestSuite--beforeSuite");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("BeforeTestSuite--afterSuite");
	}
}

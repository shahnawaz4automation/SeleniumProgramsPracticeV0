package TestNG;

import org.testng.annotations.Test;

public class TestNG_Parallel1 {
	@Test
	public void testMethod1() throws Exception {
		System.out.println("TestNG_Parallel1 -> testMethod1");
		Thread.sleep(10000);
	}
	@Test
	public void testMethod2() throws Exception {
		System.out.println("TestNG_Parallel1 -> testMethod2");
		Thread.sleep(10000);
	}
}

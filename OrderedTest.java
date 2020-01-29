package HomeWork6;

import org.testng.annotations.Test;

public class OrderedTest {

	@Test (dependsOnMethods = "test2")
	public void test1() {
		System.out.println("-test1");

	}
	@Test (dependsOnMethods = "test3")
	public void test2() {
		System.out.println("--test2");

	}
	@Test 
	public void test3() {
		System.out.println("---test3");

	}
	
}

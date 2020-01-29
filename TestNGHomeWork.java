package HomeWork5;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGHomeWork {
	
	
	@BeforeMethod
	public void Setup() {
		System.out.println("Setup");
	}
	
	
	@Test 
	public void HomeWorkMaven() {
		System.out.println("Test method: 'HomeWorkMaven'");

	}
	
	@AfterMethod
	
	public void TearDown() {
		System.out.println("TearDown");
	}
}

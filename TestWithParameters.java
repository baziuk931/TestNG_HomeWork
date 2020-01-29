package HomeWork6;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestWithParameters {

	@Test (dataProvider = "getData")
	public void instanceDataProvider (int p1, String p2) {
		System.out.println("Data Provider example: Data(" + p1 + ", " + p2 + ")");
	}
	 
	@DataProvider
	public Object [][] getData() {
		return new Object[][] {
			{1, "one"},
			{2, "two"},
			{3, "three"},
			{4, "four"}
		};
	}
	

	@Parameters({"param1", "param2"})
	@Test
	public void paramTest (int par1, String par2) {
		System.out.println("Parameter example: Data(" + par1 + ", " + par2 + ")");
	}
	
}

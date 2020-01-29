package HomeWork6;

import org.testng.Assert;
import org.testng.annotations.*;


public class GroupsDependencies {

	@BeforeTest (groups = { "Specific method" })
	public void Setup() {
		System.out.println("Setup");
	}

	@Test(enabled = true, groups = { "Dependency" })
	public void first() {
		System.out.println("--test1");

		Assert.assertTrue(1 != 2);
		Assert.assertFalse(1 == 2);
	}

	@Test(dependsOnMethods = "first", groups = { "Dependency" })
	public void second() {
		System.out.println("--test2");

		Assert.assertEquals("2", "2");
		Assert.assertNotEquals("1", "2");
	}

	@Test(description = "New test", groups = { "Dependency" })
	public void third() {
		System.out.println("--test3");

		Assert.assertEquals("2", "2");

	}

	@Test(timeOut = 2000, groups = { "Dependency" })
	public void fourth() throws InterruptedException {
		System.out.println("--test4");

		Thread.sleep(1000);
		Assert.assertEquals("2", "2");

	}

	@AfterTest (groups = { "Specific method" })

	public void TearDown() {
		System.out.println("TearDown");
	}
}

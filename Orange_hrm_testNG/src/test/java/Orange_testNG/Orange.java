package Orange_testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Orange {
@Test(priority = 1)
public void mj() {
	System.out.println("Ajay");
	Assert.fail();
}
@Test(priority = 2,dependsOnMethods = "mj")
public void aj() {
	System.out.println("Vijay");
}
}

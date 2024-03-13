package TestNG_Script;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoParameters {
@Test(invocationCount = 3)
public void compose()
{
	Reporter.log("Message created",true);
}
@Test(dependsOnMethods = "compose")
public void sent()
{
	Reporter.log("Message sent",true);
	Assert.fail();
}
@Test(priority = 1)
public void trash()
{
	Reporter.log("Message deleted",true);
}
}

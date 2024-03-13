package TestNG_Script;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyProductFlip extends GenericFlipkart {

@Test
public void validateURL()
{
	String title = driver.getTitle();
	Assert.assertEquals(title, "");
	System.out.println("1");
}
}

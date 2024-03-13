package TestNG_Script;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Runner1 extends GenericScript{
	@Test
	public void loginFB()
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("manager");
		driver.findElement(By.name("login")).click();
	}
}

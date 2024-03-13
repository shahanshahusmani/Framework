package POM_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Runner_Generic_FB {
@Test
public void login() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver1.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	genericScript_POM p=new genericScript_POM(driver);
	p.passUN();
	Thread.sleep(2000);
	p.passPWD();
	Thread.sleep(2000);
	p.click1();
}
}

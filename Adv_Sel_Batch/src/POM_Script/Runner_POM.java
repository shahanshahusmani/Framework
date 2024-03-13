package POM_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Runner_POM {
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		PomScript p=new PomScript(driver);
				p.passData();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		p.passData();
		
	}
	}


package TestNG_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon_Login {
	@Test
public void launch()
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--start-maximized");
	WebDriver driver=new ChromeDriver(opt);
	Reporter.log("Amazon Launched", true);
	driver.get("https://www.amazon.in/");
	driver.close();
}
	@Test
	public void flipkart()
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		FirefoxOptions driv=new FirefoxOptions();
		driv.addArguments("--start-maximized");
		WebDriver driver=new FirefoxDriver(driv);
		Reporter.log("Flipkart Launched", true);
		driver.get("https://www.flipkart.in/");
		driver.close();
	}
}

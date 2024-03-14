package generic_Flip;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.Fetch_prop;

public class Launch_FB {
	public WebDriver driver;
	@BeforeMethod
	public void launch() throws FileNotFoundException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver1.exe");
		driver=new ChromeDriver();
		driver.get(Fetch_prop.getProp());
	}
	@AfterMethod
	public void close()
	{
		System.out.println("usman1");
		driver.close();
	}
}

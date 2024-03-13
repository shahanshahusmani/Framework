package generic_Flip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch_Browser 
{
public WebDriver driver;
@BeforeMethod
public void launch()
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver1.exe");
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
}
}

//@AfterMethod
//public void close1()
//{
//	driver.close();
//}
//}

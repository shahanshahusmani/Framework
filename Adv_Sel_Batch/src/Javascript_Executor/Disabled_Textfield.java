package Javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disabled_Textfield {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/s/Desktop/Html_Pages/DisabledText.html");
		boolean b = driver.findElement(By.id("i1")).isEnabled();
		
		if(b)
		{
			System.out.println("Element is enabled");
		}
		else
		{
			System.out.println("Element is disabled");
		}
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		Thread.sleep(5000);
		//used to send value in textfield
		jse.executeScript("document.getElementById('i1').value='ABC'"); 
		Thread.sleep(2000);
		//use to clear value form textfield
		jse.executeScript("document.getElementById('i1').value=' '");
		
	}

}

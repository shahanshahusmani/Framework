package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action_PerformCheck {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("//C:/Users/s/Desktop/checkbox.html");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.id("cbox2"));
		boolean b = ele.isDisplayed();
		
		WebElement ele2=driver.findElement(By.id("cbox1"));
		boolean e = ele2.isEnabled();
		
		WebElement ele3=driver.findElement(By.name("ch4"));
		boolean sel = ele3.isSelected();
		
		if(b)
		{
			System.out.println("Element is displayed");
		}
		else
		{
			System.out.println("Element is not displayed");
		}
		if(e)
		{
			System.out.println("Element is Enabled");
		}
		else
		{
			System.out.println("Element is not enabled");
		}
		if(sel)
		{
			System.out.println("Element is selected");
		}
		else
		{
			System.out.println("Element is not selected");
		}
	}

}

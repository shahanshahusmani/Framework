package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action_Perform {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/s/Desktop/checkbox.html");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.id("cbox4"));

		if(ele.isDisplayed())
		{
			System.out.println("Element is displayed");
			if(ele.isEnabled())
			{
			System.out.println("its Enabled");
				if(ele.isSelected())
				{
					System.out.println("its selected");
				}
		else
		{
			System.out.println("its not selected");
			ele.click();
		}
			}
		else
		{
			System.out.println("its not enabled");
		}
		}
		else 
		{
			System.out.println("It is not displayed");
		}
	}
}
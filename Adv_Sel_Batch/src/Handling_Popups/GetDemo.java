package Handling_Popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(4000);
		driver.findElement(By.id("windowButton")).click();
		Set<String> all_id = driver.getWindowHandles();
		
		for(String id:all_id)
		{
			
			driver.switchTo().window(id);
			String title = driver.getTitle();
			System.out.println("Title of Child Browser: "+title);
			if(title.equals(" DEMOQA"))
			{
				driver.close();
			}
		}

	}

}

package Handling_Popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TitleOfBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='browserLink1']")).click();
		Set<String> all_id = driver.getWindowHandles();

		for(String id:all_id)
		{
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			System.out.println(url);
			Thread.sleep(2000);
			driver.close();
		}
	}

}

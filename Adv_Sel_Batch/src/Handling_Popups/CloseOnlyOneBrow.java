package Handling_Popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyOneBrow {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
	Thread.sleep(4000);
	WebElement ele = driver.findElement(By.id("browserLink1"));
	ele.click();
	
	String P_id = driver.getWindowHandle();
	Set<String> All_id = driver.getWindowHandles();
	
	int count = All_id.size();
	System.out.println("Before: "+count);
	
	//Remove parent Id from All id
	All_id.remove(P_id);
	
	int count1 = All_id.size();
	System.out.println("After: "+count1);
	
	for(String id:All_id)
	{
		Thread.sleep(2000);
		driver.switchTo().window(id);
		driver.close();
	}
	
	}

}

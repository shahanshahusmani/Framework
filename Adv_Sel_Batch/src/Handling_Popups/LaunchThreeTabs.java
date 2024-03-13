package Handling_Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchThreeTabs {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("windowButton"));
		ele.click();
		Robot r=new Robot();
		for(int i=1;i<3;i++)
		{
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_T);
		}
		Set<String> all_id = driver.getWindowHandles();
		ArrayList<String> arr_id=new ArrayList<String>(all_id);  //confusion 
		
		String f_id=arr_id.get(0);
		String s_id=arr_id.get(1);
		String t_id=arr_id.get(2);
		
		driver.switchTo().window(f_id);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.switchTo().window(s_id);
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.switchTo().window(t_id);
		driver.get("https://www.amazon.in/");
			
	}

}

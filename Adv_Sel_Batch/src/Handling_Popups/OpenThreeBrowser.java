package Handling_Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenThreeBrowser {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Robot r=new Robot();
		
		for(int i=1;i<3;i++)
		{
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_T);
		}
		Thread.sleep(5000);
		Set<String> All_id = driver.getWindowHandles();
		
		ArrayList<String> arr_id=new ArrayList<String>(All_id); //so that we can fetch Browser id by index
		
		String f_id = arr_id.get(0);
		String s_id = arr_id.get(1);
		String t_id = arr_id.get(2);
		
		driver.switchTo().window(f_id);
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.switchTo().window(s_id);
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);
		driver.switchTo().window(t_id);
		driver.get("https://www.selenium.dev/");
	}

}

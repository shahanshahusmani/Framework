package HandlingMultipleElements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AscDescOrderCheck {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/s/Desktop/checkbox.html");
		Thread.sleep(2000);
		List<WebElement> cbox = driver.findElements(By.xpath("input"));
		int count = cbox.size();
		for(int i=0;i<count;i++)
		{
			WebElement check = cbox.get(i);
			check.click();
		}
		Thread.sleep(1000);
	}
}

package HandlingDropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAsc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/s/Desktop/checkbox.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		List<WebElement> checkbox = driver.findElements(By.xpath("//input"));
		
		
		int count = checkbox.size();
	    System.out.println("co. of checkbox "+count);
	    
	}
}

package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Location_Of_Element {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Point p = driver.findElement(By.id("email")).getLocation();
		
		System.out.println(p);
		
		int x = p.getX();
		int y = p.getX();
		
		System.out.println("The x Co-ordinate is: "+x);
		System.out.println(("The y Co-ordinate is: "+y));
	}

}

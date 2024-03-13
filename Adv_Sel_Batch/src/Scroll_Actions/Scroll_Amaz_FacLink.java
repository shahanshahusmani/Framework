package Scroll_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Amaz_FacLink {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		Point loc = driver.findElement(By.xpath("//a[text()='Facebook']")).getLocation();
		int x=loc.getX()-200;
		int y=loc.getY()-200;
		
		JavascriptExecutor jsc=(JavascriptExecutor) driver;
		jsc.executeScript("window.scrollBy("+x+","+y+")");
	}

}

package QspSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathBasic {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		//dr.get("file:///C:/Users/s/Desktop/x2.html");
		//dr.get("https://www.facebook.com/");
		dr.get("https://www.amazon.in/");
		//dr.findElement(By.tagName("a")).click();
		//dr.findElement(By.id("a1")).click();
		//dr.findElement(By.className("c1")).click();
		//dr.findElement(By.name("s1")).click();
		
		//dr.findElement(By.tagName("input")).sendKeys("somya");
		//dr.findElement(By.name("s1")).sendKeys("nazim");
		//dr.findElement(By.id("a1")).sendKeys("kumuda");
		//dr.findElement(By.className("c1")).sendKeys("somya");
		//Thread.sleep(2000);
		//dr.findElement(By.className("c1")).clear();
		//dr.findElement(By.linkText("Forgotten password?")).click();
		//dr.findElement(By.id("email")).sendKeys("Usman@786");
		//Thread.sleep(2000);
		//dr.findElement(By.id("pass")).sendKeys("Usman");
		//Thread.sleep(2000);
		//dr.findElement(By.name("login")).click();
		//dr.findElement(By.linkText("हिन्दी")).click();
		dr.findElement(By.xpath("//input[@aria-label='Search Amazon.in']")).sendKeys("iphone 13");
		
		
	}

}
package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwapText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/s/Desktop/webElement.html");
		Thread.sleep(2000);
		WebElement txt1=driver.findElement(By.id("t1"));
		WebElement txt2=driver.findElement(By.id("t2"));
		WebElement txt3=driver.findElement(By.id("t3"));
		
		txt2.sendKeys(Keys.CONTROL+"a"+"x");
		Thread.sleep(1000);
		txt3.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(1000);
		txt1.sendKeys(Keys.CONTROL+"a"+"x");
		Thread.sleep(1000);
		txt2.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(1000);	
		txt3.sendKeys(Keys.CONTROL+"a"+"x");
		Thread.sleep(1000);
		txt1.sendKeys(Keys.CONTROL+"v");
		}
}

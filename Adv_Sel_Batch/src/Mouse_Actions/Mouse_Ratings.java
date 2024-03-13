package Mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Ratings {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Quick Start']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Mouse Hover']")).click();
		Thread.sleep(3000);
		//WebElement ele = driver.findElement(By.xpath("(//img)[3]"));
		//Actions act=new Actions(driver);
		//act.moveToElement(ele).perform();
		//driver.findElement(By.xpath("//a[text()='Ratings']")).click();
		//Thread.sleep(5000);
		//WebElement ratings = driver.findElement(By.xpath("(//*[local-name()='svg'])[4]"));
		//Actions act=new Actions(driver);
		//act.moveToElement(ratings).click().perform();
		driver.findElement(By.xpath("//a[text()='Tab']")).click();
		Thread.sleep(5000);
		WebElement men_Tab = driver.findElement(By.xpath("//li[text()='Men ']"));
		Actions act=new Actions(driver);
		act.moveToElement(men_Tab).click().perform();
		
	}

}

package Mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverQSP {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Quick Start']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Default']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//div[@id='circle']"));
		Thread.sleep(2000);
		//WebElement ele = driver.findElement(By.xpath("(//img)[3]"));
		Actions act=new Actions(driver);
		act.clickAndHold(ele).perform();
		Thread.sleep(5000);
		act.release(ele).perform();
		driver.close();
	}

}

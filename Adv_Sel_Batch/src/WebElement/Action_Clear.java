package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action_Clear {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/s/Desktop/webElement.html");
		Thread.sleep(3000);
		WebElement txtbox=driver.findElement(By.name("n1"));
		Thread.sleep(2000);
		txtbox.sendKeys("Usman");
		Thread.sleep(2000);
		txtbox.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		txtbox.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		driver.findElement(By.linkText("google")).sendKeys(Keys.ENTER);
	}

}

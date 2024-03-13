package HandlingDropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacbookDropdown {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Neeraj");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kumar");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("584885939");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("78634");
	Thread.sleep(1000);
	WebElement ele = driver.findElement(By.id("day"));
	ele.click();
	Select sel=new Select(ele);
	sel.selectByValue("23");
	Thread.sleep(1000);
	WebElement ele2 = driver.findElement(By.id("month"));
	Select sel2=new Select(ele2);
	sel2.selectByVisibleText("Apr");
	Thread.sleep(1000);
	WebElement ele3 = driver.findElement(By.xpath("//select[@id='year']"));
	Select sel3=new Select(ele3);
	sel3.selectByValue("2022");
	}

}

package Handling_Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Confirmation_Popup {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoapps.qspiders.com/ui/alert/confirm?sublist=1");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	driver.findElement(By.id("buttonAlert5")).click();
	Alert alt = driver.switchTo().alert();
	Thread.sleep(4000);
	//alt.accept();
	alt.dismiss();
	}
}

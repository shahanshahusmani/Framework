package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Frame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./sw/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/s/Desktop/Html_Pages/MainFrame.html");
		WebElement t = driver.findElement(By.id("t1"));
		t.sendKeys("usman");
		Thread.sleep(2000);
		driver.switchTo().frame("frame1");
		WebElement T2 = driver.findElement(By.id("i2"));
		T2.sendKeys("Khan");
		Thread.sleep(2000);
		WebElement T3 = driver.findElement(By.id("c2"));
		T3.click();
		T2.clear();
		T3.click();
		// driver.switchTo().defaultContent();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		t.clear();
		

	}

}

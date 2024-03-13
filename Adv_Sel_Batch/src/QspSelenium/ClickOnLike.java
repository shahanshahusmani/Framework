package QspSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnLike {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://youtube.com");
		dr.findElement(By.xpath("//input[@id='search']")).sendKeys("aaja mahi");
		Thread.sleep(3000);
		 dr.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		 Thread.sleep(8000);
		dr.findElement(By.xpath("//a[@title='माही आजा - फुल वीडियो | सिंह इज ब्लिंग | अक्षय कुमार और एमी जैक्सन']")).click();
	}
}	
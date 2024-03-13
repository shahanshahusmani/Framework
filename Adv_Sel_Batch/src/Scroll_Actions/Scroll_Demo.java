package Scroll_Actions;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scroll_Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		ChromeOptions opt=new  ChromeOptions();
		opt.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/s/Desktop/Html_Pages/DisabledText.html");
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('i1').value='Usman'");
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('i1').value=' '");
	}

}

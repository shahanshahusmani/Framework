 package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Capture_Screenshot_of_element {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		//Step1
		WebElement ele = driver.findElement(By.id("email"));
		File tmp = ele.getScreenshotAs(OutputType.FILE);
		//step 2
		File pmt=new File("./element_photo/un_txt.jpg");
		//step3
		FileHandler.copy(tmp, pmt);
	}

}

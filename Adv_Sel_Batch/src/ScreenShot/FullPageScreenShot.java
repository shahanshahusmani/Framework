package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class FullPageScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://facebook.com");
		Thread.sleep(5000);
		
		//step 1
		TakesScreenshot tss=(TakesScreenshot)driver;
		
		//step 2
		File tmp = tss.getScreenshotAs(OutputType.FILE);
		
		//step 3
		File pmt=new File("./element_photo/fullPage.jpg");
		
		//step 4
		FileHandler.copy(tmp, pmt);
	}

}

package generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Capture_ScreenShot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		WebDriver driver=new ChromeDriver(opt);
		opt.addArguments("--start maximized");
		driver.get("https://facebook.com");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("email"));
		Generic_Element_Photo.get_element_photo(ele, "ele1");
		WebElement pass = driver.findElement(By.id("pass"));
		Generic_Element_Photo.get_element_photo(ele, "ele2");
	}

}

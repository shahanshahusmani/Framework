package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeOfElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Dimension size = driver.findElement(By.id("email")).getSize();
		System.out.println(size);
		
		int h = size.getHeight();
		int w = size.getWidth();
		
		System.out.println("the height is: "+h);
		System.out.println("the width is: "+w);
	}
}

package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingNames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/s/Desktop/FetchingNames.html");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.linkText("google"));
		String tgnme = ele.getTagName();
		System.out.println(tgnme);
		//Thread.sleep(2000);
		//driver.get("https://www.facebook.com");
		//WebElement ele1 = driver.findElement(By.id("email"));
		//String tgnm = ele.getTagName();
		//System.out.println("tgnm");
	}

}

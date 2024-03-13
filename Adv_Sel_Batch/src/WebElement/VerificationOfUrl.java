package WebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationOfUrl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.facebook.com/"))
		{
			System.out.println("URL is correct");
		}
		else 
		{
			System.out.println("URL is Wrong");
		}
		}
}

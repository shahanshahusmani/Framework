package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifications {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	Thread.sleep(3000);
	//driver.findElement(By.linkText("Forgotten password?")).click();
	
	String title = driver.getTitle();
	String url = driver.getCurrentUrl();
	
	if(title.equals("Facebook – log in or sign up"))
	{
		System.out.println("Title is correct");
	}
	else
	{
		System.out.println("Title is wrong");
	}
	if(url.equals("https://www.facebook.com"))
	{
		System.out.println("URL is correct");
	}
	else {
		System.out.println("URL is wrong");
	}
	}

}

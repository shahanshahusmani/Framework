package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTagNText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		WebElement link=driver.findElement(By.linkText("Forgotten password?"));
		//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getAttribute("href");
		String tgnm=link.getTagName();
		String txt = link.getText();
		
		if(tgnm.equals("a"))
		{
			System.out.println("Tag Name is correct");
		}
		else
		{
			System.out.println("Tag Name is wrong");
		}
		if(txt.equals("Forgotten password?"))
		{
			System.out.println("Text is correct");
		}
		else
		{
			System.out.println("Text is wrong");
		}
	}

}

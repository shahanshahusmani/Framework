package WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetImgLoc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		List<WebElement> src = driver.findElements(By.xpath("//img"));
		for (WebElement sr : src) 
		{
			String txt = sr.getAttribute("src");
			System.out.println(txt);
		}

	}

}

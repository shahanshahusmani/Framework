package HandlingMultipleElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/s/Desktop/dropdown.html");
		Thread.sleep(2000);
		WebElement dd = driver.findElement(By.id("Menu"));
		Select sel = new Select(dd);
		boolean b = sel.isMultiple();
		
		if(b)
		{
			System.out.println("Dropdown is Multiselect");
		}
		else
		{
			System.out.println("Dropdown is Single select");
		}

	}

}

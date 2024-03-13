package WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountryDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/s/Desktop/dropdown.html");
		 WebElement list = driver.findElement(By.id("Countries"));	
		Select sel=new Select(list);
		sel.selectByVisibleText("france");
		Thread.sleep(2000);
		sel.selectByVisibleText("india");
		Thread.sleep(2000);
		sel.selectByVisibleText("japan");
		List<WebElement> optall = sel.getAllSelectedOptions();
		for(WebElement select:optall)
		{
			String txt = select.getText();
		if(txt.equals("india"))
		{
			System.out.println("india is selected");
		}
		else
		{
			System.out.println("India is not selected");
		}

	}
	}
	}

package HandlingDropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/s/Desktop/dropdown.html");
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.id("Menu"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
		Thread.sleep(1000);
		sel.selectByValue("d");
		Thread.sleep(1000);
		sel.selectByVisibleText("Dosa");
		Thread.sleep(2000);
		sel.deselectByIndex(0);
		Thread.sleep(1000);
		sel.deselectByValue("c");

	}

}

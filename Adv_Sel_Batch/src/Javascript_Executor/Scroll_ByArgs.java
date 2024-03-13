package Javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_ByArgs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/scroll/newTabVertical");
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath("//h3[text()='b. Premium Materials']"));
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		jse.executeScript("arguments[0].scrollIntoView();",ele);
	}

}

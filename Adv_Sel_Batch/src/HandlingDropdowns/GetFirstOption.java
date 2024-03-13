package HandlingDropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstOption {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/s/Desktop/dropdown.html");
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.id("Menu"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
		Thread.sleep(1000);
		sel.selectByValue("d");
		Thread.sleep(1000);
		sel.selectByVisibleText("Kadi");
		Thread.sleep(1000);
		WebElement frst = sel.getFirstSelectedOption();
		String txt = frst.getText();
		System.out.println(txt);

	}

}

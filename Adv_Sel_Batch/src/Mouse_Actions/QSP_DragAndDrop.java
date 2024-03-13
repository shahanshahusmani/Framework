package Mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class QSP_DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Quick Start']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
		Thread.sleep(2000);
		WebElement src = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement dst = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(src,dst).perform();
		WebElement src1 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement dst1 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		Actions act1=new Actions(driver);
		Thread.sleep(2000);
		act1.dragAndDrop(src1, dst1).perform();
		WebElement src2 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement dst2 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		Actions act2=new Actions(driver);
		Thread.sleep(2000);
		act2.dragAndDrop(src2, dst2).perform();
		WebElement src3 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		WebElement dst3 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		Actions act3=new Actions(driver);
		act2.dragAndDrop(src3, dst3).perform();
		Thread.sleep(2000);
		driver.close();
	}

}

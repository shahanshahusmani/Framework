package TestNG_Script;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SortDropdwon {
@Test
public void fb()
{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement mon = driver.findElement(By.id("month"));
		Select sel=new Select(mon);
		List<WebElement> opt = sel.getOptions();
		ArrayList<String> l=new ArrayList<String>();
		
		for(WebElement ele:opt)
		{
			String month_txt = ele.getText();
			l.add(month_txt);
		}
		Collections.sort(l);
		System.out.println("After sorting "+l);
		
		Collections.reverse(l);
		System.out.println("In Descending order "+l);
		
}
@Test
public void treeSet()
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	WebElement mon = driver.findElement(By.id("month"));
	Select sel=new Select(mon);
	List<WebElement> opt = sel.getOptions();
	TreeSet<String> t=new TreeSet<String>(Collections.reverseOrder());
	
	for(WebElement ele:opt)
	{
		String month_txt = ele.getText();
		t.add(month_txt);
	}
	System.out.println("TreeSet: "+t);
}
@Test
public void links()
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	List<WebElement> links = driver.findElements(By.xpath("//a[position() mod=2]"));
	
	for(WebElement link:links)
	{
		String link1 = link.getAttribute("href");
		System.out.println(link1);
	}
    
}
}

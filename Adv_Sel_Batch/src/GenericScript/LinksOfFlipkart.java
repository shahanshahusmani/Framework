package GenericScript;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksOfFlipkart {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream fis=new FileInputStream(".excel/data.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.createSheet("Flipkart");

		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://flipkart.com");
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count = links.size();
		System.out.println("Size of Links: "+count);
		
		for(int i=0;i<count;i++)
		{
			WebElement link = links.get(i);
			String att = link.getAttribute("href");
			Row r = sh.getRow(i);
			Cell cel = r.getCell(0);
			cel.setCellValue(att);
		}
		FileOutputStream fout=new FileOutputStream(".excel/data.xlsx");
		book.write(fout);
	}

}

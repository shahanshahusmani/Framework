package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./excel/data.xlsx");
		
		//open the file
		Workbook book=WorkbookFactory.create(fis);
		
		//specify sheet name
		Sheet sh = book.getSheet("sheet1");
		
		//specify the Row
		Row r = sh.getRow(0);
		
		//specify the cell
		Cell c = r.getCell(0);
		
		double value = c.getNumericCellValue();
		System.out.println(value);
	}

}

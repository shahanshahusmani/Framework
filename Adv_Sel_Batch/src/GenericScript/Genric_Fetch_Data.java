package GenericScript;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Genric_Fetch_Data 
{
public static String get_data(String file_path,String sheetName,int ro,int c) 
{
	FileInputStream fis;
	Workbook book=null;
	try
	{
			fis=new FileInputStream(file_path);
			book=WorkbookFactory.create(fis);
	}
	catch(Exception e)
	{
		System.out.println("file not found");
		
	}
	Sheet sh = book.getSheet(sheetName);
	Row r = sh.getRow(ro);
	Cell cel = r.getCell(c);
	String value = cel.toString();
	return value;
}

}

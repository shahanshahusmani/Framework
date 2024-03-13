package generic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Generic_Element_Photo {

	public static void get_element_photo(WebElement ele,String txt)
	{
		File tmp = ele.getScreenshotAs(OutputType.FILE);
		File pmt=new File("./element_photo/"+txt+".jpg");
		try {
			FileHandler.copy(tmp, pmt);
		} catch (IOException e) {
			System.out.println("Screen shot not available");
			e.printStackTrace();
		}
	}
}

package TestNG_Script;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class generic_Property_File {
	@Test
	public void fetchProp(String path,String key) throws FileNotFoundException, IOException
	{
		Properties p=new Properties();
		p.load(new FileInputStream(path));
		String val = p.getProperty("baseUrl");
		System.out.println(val);
	}
}

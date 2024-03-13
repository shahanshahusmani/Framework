package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Fetch_prop {
@Test
public static String getProp() throws FileNotFoundException, IOException
{
Properties p=new Properties();
p.load(new FileInputStream("./BaseURL.properties"));
String val = p.getProperty("baseURL");
return val;
}
}

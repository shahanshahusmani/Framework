package QspSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		//ChromeDriver ch=new ChromeDriver();
		WebDriver dr=new ChromeDriver();
		dr.get("https://youtube.com");
		dr.close();
	}

}
 
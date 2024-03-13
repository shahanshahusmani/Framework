package ScreenShot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Generic_Page_Photo;

public class Main_generic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Generic_Page_Photo.get_photo(driver);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Generic_Page_Photo.get_photo(driver);

	}

}

package POM_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomScript {
//Declaration
	@FindBy(id="email")
	private WebElement uName;
	//initialization
	public PomScript(WebDriver driver)
	{
		PageFactory.initElements(driver, uName);
	}
	//Utilization
	public void passData()
	{
		uName.sendKeys("usman");
	}
}

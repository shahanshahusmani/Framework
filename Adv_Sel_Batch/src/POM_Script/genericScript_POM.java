package POM_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class genericScript_POM {
	
@FindBy(id="email")
private WebElement Uname;

@FindBy(id="pass")
private WebElement Pass;

@FindBy(xpath="//button[text()='Log in']")
private WebElement Login;

public genericScript_POM(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void passUN()
{
	Uname.sendKeys("Usman");
}
public void passPWD()
{
	Pass.sendKeys("Usman@123");
}
public void click1()
{
	Login.click();
}
}

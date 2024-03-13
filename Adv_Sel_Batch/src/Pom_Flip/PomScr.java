package Pom_Flip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomScr {
	// Declaration
	@FindBy(id = "twotabsearchtextbox")
	private WebElement search;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement search_button;

//initialization
	public PomScr(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//utilization
	public void searchData(String srch) {
		search.sendKeys(srch);
	}

	public void clickSearch() {
		search_button.click();
	}

}

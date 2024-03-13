package Runner_Flip_Pom;

import org.testng.annotations.Test;

import Pom_Flip.PomScr;
import generic_Flip.Launch_Browser;


public class Runner extends Launch_Browser{
	@Test
	public void launch()
	{
		PomScr p=new PomScr(driver);
		p.searchData("iphone");
		p.clickSearch();
	}

}

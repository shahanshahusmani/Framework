package DataProvider;

import org.testng.annotations.Test;

public class DataProvExam {
	@Test(dataProvider = "LoginCredential",dataProviderClass = CustomDataProv.class)
	public void loginTest(String UN,String pwd)
	{
		System.out.println(UN +" "+ pwd);
	}
}


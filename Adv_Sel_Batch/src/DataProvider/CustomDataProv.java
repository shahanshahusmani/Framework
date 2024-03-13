package DataProvider;

import org.testng.annotations.DataProvider;

public class CustomDataProv {
@DataProvider (name="LoginCredential")
public Object[][] getData()
{
	Object[][] data= {{"Sahir@gmail.com","123"},{"kader@gmail.com","786"},{"rahul@gmail.com","321"}};
	return data;
}
}

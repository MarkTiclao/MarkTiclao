package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPDemo {
	
	@DataProvider(name = "DataProvider")
	public Object[][] dpProvider(){
		return new Object[][] {{"Capgemini"},{"Bangaluru"}};
	}

	
	@Test(dataProvider = "DataProvider")
	public void TesdDp(String value) {
		System.out.println("Passed parameter is:"+value);
		
	}
}

package DataProvider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPDemo1 {
	@DataProvider(name = "data-Provider")
	public Object[][] dpMethod(){
		return new Object[][] {{2,3,5},{1,2,3}};
	}
	
	@Test(dataProvider = "data-Provider")
	public void TestDp(int n,int m, int result) {
		int sum = n+m;
		
		Assert.assertEquals(result, sum);
	}

}

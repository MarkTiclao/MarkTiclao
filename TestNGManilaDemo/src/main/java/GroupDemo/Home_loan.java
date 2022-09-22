package GroupDemo;

import org.testng.annotations.Test;

public class Home_loan {
	@Test
	public void WebLoginHomeLoan() {
		System.out.println("Web Login Home Loan");
		
	}
	
	@Test(groups = {"one"})
	public void MobileLoginHomeLoan() {
		System.out.println("Mobile Login Home Loan");
		
	}
	
	 @Test(groups = {"two"})
	public void APILoginHomeLoan() {
		System.out.println("API Login Home Loan");
		
	}
}

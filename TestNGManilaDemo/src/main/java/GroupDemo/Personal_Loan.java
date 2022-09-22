package GroupDemo;

import org.testng.annotations.Test;

public class Personal_Loan {
	@Test
	public void WebLoginPersonalLoan() {
		System.out.println("Web Login Personal Loan");
		
	}
	
	@Test(groups = {"one"})
	public void MobileLoginPersonalLoan() {
		System.out.println("Mobile Login Personal Loan");
		
	}
	
	@Test(groups = {"two"})
	public void APILoginPersonalLoan() {
		System.out.println("API Login PersonalLoan");
		
	}

}

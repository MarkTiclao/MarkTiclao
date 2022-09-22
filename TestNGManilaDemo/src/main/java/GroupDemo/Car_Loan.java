package GroupDemo;

import org.testng.annotations.Test;

public class Car_Loan {
	
	@Test
	public void WebLoginCarLoan() {
		System.out.println("Web Login Car Loan");
		
	}
	
	@Test(groups = {"one"})
	public void MobileLoginCarLoan() {
		System.out.println("MobileLoginCarLoan");
		
	}
	
	@Test(groups = {"two"})
	public void APILoginCarLoan() {
		System.out.println("APILoginCarLoan");
		
	}

}

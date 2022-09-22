package DependentsDemo;

import org.testng.annotations.Test;

public class Dependent {
	
	@Test
	public void Sigin() {
		System.out.println("SigIn");
	}
	
	@Test
	public void OpenBrwoser() {
		System.out.println("OpenBrwoser");
	}
	
	@Test(dependsOnMethods = {"Sigin","OpenBrwoser"})
	public void LogOut() {
		System.out.println("LogOut");
	}

}

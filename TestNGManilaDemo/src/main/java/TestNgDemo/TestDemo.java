package TestNgDemo;

import org.testng.annotations.Test;

public class TestDemo {

	@Test 
	public void OpenBrowser() {
		System.out.println("Thread id"+Thread.currentThread().getId());
		System.out.println("OpenBrowser");
	}

	@Test
	public void Login() {
		System.out.println("Login");
	}

	@Test 
	public void LogOut() {
		System.out.println("LogOut");
	}

}

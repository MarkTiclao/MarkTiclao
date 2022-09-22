package Parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//@Parameter({"a","b"}

public class Parameter {
	@Test
	@Parameters({ "val1", "val2" })

	public void sum(int n1, int n2) {
		int sum = n1 + n2;

		System.out.println("The Sum of two number is:" + sum);
	}

}

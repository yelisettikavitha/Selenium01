package packThree;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassFive {

	@Test(groups= {"smoke"})
	public void testFiveA() {
		System.out.println("Test Five method in Class Five");
	}
	
@Test(enabled=false)
	public void testFiveB() {
		System.out.println("Test FiveB>> method in Class Five");
	}	
}

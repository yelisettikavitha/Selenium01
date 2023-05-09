package packTwo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ClassThree {

	@Test(groups= {"smoke"})
	public void testThree() {
		System.out.println("Test Three method in Class Three");
	}

}

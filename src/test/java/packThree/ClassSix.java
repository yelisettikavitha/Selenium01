package packThree;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ClassSix {

	@Test
	public void testSix() {
		System.out.println("Test Six method in Class Six");
	}
@BeforeSuite
	public void suit() {
		System.out.println("Suite");
	}
}

package packOne;


import org.testng.annotations.Test;

public class ClassOne {
@Test(groups= {"smoke","regression"})
public void testOneA() {
	System.out.println("Test One123 method in Class One");
	
}

@Test(groups= {"sanity","regression"})
public void testOneB() {
	System.out.println("Test One456 method in Class One");
}
@Test(dependsOnMethods="testOneA")
public void testOneC() {
	System.out.println("Test One789 method in Class One");
}
}

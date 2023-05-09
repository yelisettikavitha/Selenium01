package firstpack;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Listeners1 {
	@Test
public void sample() {
	int a=3,b=4,c=8;
	if(a==1) {
		Assert.assertTrue(b<c);
	}
	else if(a==2) {
		Assert.assertTrue(b>c);
	}
	else if(a==3) {
		throw new SkipException("Test Exception skipped");
	}
}
}

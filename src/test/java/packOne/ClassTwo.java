package packOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTwo {
	@Parameters({"url"})
	@Test
	public void testtwo(String url) {
		System.out.println("Test Two method in Class One");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Assert.assertEquals(driver.getTitle(), "Selenium");
		driver.quit();
	}

	
}

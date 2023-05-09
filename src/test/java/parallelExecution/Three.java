package parallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Three {
@Parameters({"URl"})
@Test
public void driver(String url) throws InterruptedException {
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	Thread.sleep(3000);
	driver.quit();
}
}

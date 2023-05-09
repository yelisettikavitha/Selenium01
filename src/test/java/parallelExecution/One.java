package parallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class One {
@Parameters({"URL"})
@Test

	public void chrome(String url) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		driver.quit();
	}
}

package packOne;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	@Parameters({"Url","User","Pwd"})
	@Test
public void para1(String url,String username,String password) throws InterruptedException {
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(url);
	driver.findElement(By.xpath("//a[@title=\"My Account\"]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
	driver.findElement(By.xpath("//input[@id=\"input-email\"]")).sendKeys(username);
	driver.findElement(By.xpath("//input[@id=\"input-password\"]")).sendKeys(password);
	Thread.sleep(3000);
	driver.quit();
}
}

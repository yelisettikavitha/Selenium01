package firstpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo2 {
@Test
	public void sample() {
		// TODO Auto-generated method stub
WebDriver driver=new EdgeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://naveenautomationlabs.com/opencart/");
driver.findElement(By.xpath("//a[@title=\"My Account\"]")).click();
driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
driver.findElement(By.xpath("//input[@id=\"input-email\"]")).sendKeys("kavithayelisetti19@gmail.com");
driver.findElement(By.xpath("//input[@id=\"input-password\"]")).sendKeys("llchinna");
driver.findElement(By.xpath("//input[@class=\"btn btn-primary\"]")).click();
driver.findElement(By.xpath("//input[@class=\"form-control input-lg\"]")).sendKeys("Palm Treo pro");
driver.findElement(By.xpath("//i[contains(@class,'fa-search')]")).click();
driver.findElement(By.xpath("(//div[@class='product-thumb']//i[contains(@class,heart)])[2]")).click();

String expectedmsg="Success: You have added Palm Treo Pro to your wish list!";
String actualmsg= driver.findElement(By.xpath("//div[contains(@class,'alert-success')]")).getText();

/*if(actualmsg.contains(expectedmsg)) {
	System.out.println("Test is passed");
}
else {
	System.out.println("Test is failed");
}*/

Assert.assertEquals(actualmsg, expectedmsg);
driver.quit();
	}

}

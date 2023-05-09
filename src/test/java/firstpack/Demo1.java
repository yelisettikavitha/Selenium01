package firstpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new EdgeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://naveenautomationlabs.com/opencart/");
driver.findElement(By.xpath("//a[@title='My Account']")).click();
driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
if(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Account']")).isDisplayed()) {
System.out.println("Pass");
	}
else
{System.out.println("Fail");

}
driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
driver.findElement(By.id("input-firstname")).sendKeys("Harsh");
driver.findElement(By.id("input-lastname")).sendKeys("Kanth");
driver.findElement(By.id("input-email")).sendKeys("abcdefg.@gmail.com");
driver.findElement(By.id("input-telephone")).sendKeys("5974126984");
driver.findElement(By.id("input-password")).sendKeys("123456");
driver.findElement(By.id("input-confirm")).sendKeys("123456");
driver.findElement(By.xpath("//label[@class=\"radio-inline\"]//input[@value=\"1\"]")).click();
driver.findElement(By.xpath("//div[@class=\"pull-right\"]//input[@value=\"1\"]")).click();
driver.findElement(By.xpath("//input[@class=\"btn btn-primary\"]")).click();
	}
}

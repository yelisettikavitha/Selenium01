package firstpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Demo3 {
	@Test
	public void cart() throws InterruptedException {
		
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
	driver.findElement(By.xpath("//div[@class=\"button-group\"]//i[@class=\"fa fa-shopping-cart\"]")).click();
	driver.findElement(By.xpath("//a[@title=\"Shopping Cart\"]//i[@class=\"fa fa-shopping-cart\"]")).click();
	driver.findElement(By.xpath("//div[@class=\"input-group btn-block\"]//input[@class=\"form-control\"]")).click();
	Actions act=new Actions(driver);
	act.sendKeys(Keys.BACK_SPACE).sendKeys("4");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class=\"btn btn-primary\"]")).click();
	String A=driver.getTitle();
	System.out.println(A);
	driver.quit();
	}
}

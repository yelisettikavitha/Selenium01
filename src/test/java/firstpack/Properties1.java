package firstpack;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Properties1 {
	
WebDriver driver;

@Test
	public void p1() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("data.properties");
		prop.load(fis);
		
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath("//input[@id=\"input-email\"]")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//input[@id=\"input-password\"]")).sendKeys(prop.getProperty("pwd"));
		driver.findElement(By.xpath("//input[@class=\"btn btn-primary\"]")).click();
		
		String act=driver.getTitle();
		String exp="My Account";
		Assert.assertEquals(act, exp);

	}
	@AfterMethod
	public void closure() {
		driver.quit();
	}

}

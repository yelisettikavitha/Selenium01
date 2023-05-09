package firstpack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class Extents {
WebDriver driver;
ExtentReports extent;
@BeforeMethod
public void configuration() {
	String path=System.getProperty("user.dir")+"\\reports\\extent_report.html";
	ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	reporter.config().setDocumentTitle("ATWReport");
	reporter.config().setDocumentTitle("Login Test Report");
	extent=new ExtentReports();
extent.attachReporter(reporter);
extent.setSystemInfo("Operating System", "Windows10");
extent.setSystemInfo("Java Version", "JAVA17");
extent.setSystemInfo("Selenium Version", "4.8.3");
extent.setSystemInfo("Tested By", "Kavitha");	
}
@Test
public void loginTest() throws IOException {
	Properties prop=new Properties();
	FileInputStream fis=new FileInputStream("data.properties");
	prop.load(fis);
	ExtentTest etest=extent.createTest("Login Test Execution Started");	
	driver=new EdgeDriver();
	etest.info("Edge Browser Launched");
	driver.manage().window().maximize();
	driver.get(prop.getProperty("url"));
	etest.info("Navigated to login page of application");
	driver.findElement(By.xpath("//input[@id=\"input-email\"]")).sendKeys(prop.getProperty("username"));
	driver.findElement(By.xpath("//input[@id=\"input-password\"]")).sendKeys(prop.getProperty("pwd"));
	driver.findElement(By.xpath("//input[@class=\"btn btn-primary\"]")).click();
	etest.info("Entered valid credentials and clicked on login button");
	String act=driver.getTitle();
	etest.info("Retrieved title of the page");
	String exp="My Account";
	etest.info("Verifying retrieved actual title displayed is as per expected or not");
	Assert.assertEquals(act, exp);
	etest.pass("Actual is equal to expected title ==Login test is passed");
	
}
@AfterMethod
public void closure() {
	driver.quit();
	extent.flush();
}
}

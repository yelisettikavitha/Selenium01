package firstpack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Example {
@Test(priority='a')
	public  void login() {
		System.out.println("login");
}
 @Test(priority='b')
 public void search() {
	 System.out.println("Searching product");
 }
 
 @Test(priority='c')
 public void addToCart() {
	 System.out.println("Adding to cart");
 }
 
 @Test(priority='d')
 public void logout() {
	 System.out.println("logout");
 }
}

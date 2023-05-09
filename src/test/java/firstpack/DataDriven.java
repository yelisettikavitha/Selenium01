package firstpack;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {
@Test(dataProvider="getData")
public void login(String username, String pwd) {
	System.out.println("username is:"+username);
	System.out.println("password is:"+pwd);
}

@DataProvider
public Object[][] getData(){
	Object[][] data=new Object[3][2];
	data[0][0]="Hitesh";
	data[0][1]="1111";
	data[1][0]="Seeya";
	data[1][1]="2222";
	data[2][0]="Bunny";
	data[2][1]="3333";
	return data;
	        
	
}
}

package scripts;

import org.testng.annotations.Test;

import pom.Loginpage_gmailcompose;
import pom.Loginpage_gmailcomposee;
import pom.Loginpage_gmailcomposeee;

public class Testlogout_gmail  extends flip.generic_libraries.Generic_Test
{
     @Test
	public void logout() throws InterruptedException
	{
		 
		  Loginpage_gmailcompose lg1=new Loginpage_gmailcompose(driver);
		  
		  lg1.setUsername("chitturu.santhi85@gmail.com");
		  Thread.sleep(2000);
		  lg1.clickLogin();
		  Thread.sleep(2000);
		  Loginpage_gmailcomposee lg2=new Loginpage_gmailcomposee(driver);
		  
		  lg2.SetPassword("#sudhir83");
		  lg2.clickLogin();
		  Thread.sleep(4000);

		 
		  Loginpage_gmailcomposeee lg3=new Loginpage_gmailcomposeee(driver);
		  //Thread.sleep(2000);
		  
		  lg3.clicksolbtn();
		  Thread.sleep(2000);
		  lg3.clichsbtn();
		  
		  
		  

	}
	
}

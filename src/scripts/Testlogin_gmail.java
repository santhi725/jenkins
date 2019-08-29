package scripts;

import org.testng.annotations.Test;

import flip.generic_libraries.Excel;
import flip.generic_libraries.Generic_Test;
import pom.Loginpage_gmailcompose;
import pom.Loginpage_gmailcomposee;
import pom.Loginpage_gmailcomposeee;

public class Testlogin_gmail  extends Generic_Test
{
  @Test
  public void login_gmail() throws InterruptedException
  {
	 
	  String un =Excel.getCellvalue("sheet1", 1, 0);
	  String pwd =Excel.getCellvalue("sheet1", 1, 1);
	 //String to =Excel.getCellvalue("sheet1", 1, 2);
	 //String body =Excel.getCellvalue("sheet1", 1, 3);
	  Thread.sleep(3000);
	  Loginpage_gmailcompose lg1=new Loginpage_gmailcompose(driver);
	  
	  lg1.setUsername(un);
	  
	  Thread.sleep(2000);
	  lg1.clickLogin();
	  Thread.sleep(2000);
	  Loginpage_gmailcomposee lg2=new Loginpage_gmailcomposee(driver);
	  
	  lg2.SetPassword(pwd);
	  lg2.clickLogin();
	  Thread.sleep(4000);
	  Loginpage_gmailcomposeee lg3=new Loginpage_gmailcomposeee(driver);
	  
	  lg3.clickCompose();
	  lg3.setTo("chitturu.santhi85@gmail.com");
	  lg3.setSub("dummy");
	  lg3.setBody("letter");
	  lg3.clickSend();
  }
}

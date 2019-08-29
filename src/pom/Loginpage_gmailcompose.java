
package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

import flip.generic_libraries.Base_Page;

public class Loginpage_gmailcompose extends Base_Page
{
   @FindBy(xpath="//input[@id='identifierId']")
   private WebElement untbox;
   
   @FindBy(xpath="(//span[.='Next'])[1]")
   private WebElement nbox;
   
   public Loginpage_gmailcompose(WebDriver driver)
   {
	   
	   super(driver);
	  
   }
   public void setUsername(String un)
   {
	   untbox.sendKeys(un);
   }
   
   public void clickLogin()
   {
	   nbox.click(); 
   }
   
	  
  
 
}

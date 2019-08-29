package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

import flip.generic_libraries.Base_Page;

public class Loginpage_gmailcomposeee extends Base_Page
{
  
	 @FindBy(xpath="(//div[.='Compose'])[3]")
			   private WebElement cmbox;
	   @FindBy(xpath="//textarea[@name='to']")
			   private WebElement tbox;
	   @FindBy(xpath="//input[@name='subjectbox']")
			   private WebElement subbox;
	   @FindBy(xpath="//div[@role='textbox']")
			   private WebElement bbox;
	   @FindBy(xpath=" (//div[.='Send'])[1]")
			   private WebElement sbox;
	  @FindBy(xpath="//span[@class='gb_Ba gbii'and @aria-hidden='true']")
	           private WebElement solbtn;
	  @FindBy (xpath="//a[.='Sign out']")
	          private WebElement  sbtn;
	   public Loginpage_gmailcomposeee(WebDriver driver)
	   {
		   super(driver);
	   }
	   
	   public void clickCompose()
	   {
		   cmbox.click();  
	   }
	   public void setTo(String tx)
	   {
		   tbox.sendKeys(tx);
	   }
	   public void setSub(String sb)
	   {
		   subbox.sendKeys(sb);
	   }
	   public void setBody(String bb)
	   {
		   bbox.sendKeys(bb);
	   }
	   public void clickSend()
	   {
		   sbox.click();
	   }
	   public void clicksolbtn()
	   {
		   solbtn.click();
	   }
	  public void clichsbtn()
	   {
		  sbtn.click();
	   }

}

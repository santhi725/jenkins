package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

import flip.generic_libraries.Base_Page;

public class Loginpage_gmailcomposee extends Base_Page
{
	 @FindBy(xpath="//input[@name='password']")
		 private WebElement pwdtbox;
		 @FindBy(xpath="(//span[.='Next'])[1]")
		  private WebElement nnbox;
		 
		 
	public 	 Loginpage_gmailcomposee(WebDriver driver)
	{
		super(driver);
	}
	public void SetPassword(String pwd)
	{
		pwdtbox.sendKeys(pwd);
	}
	public void clickLogin()
	{
		nnbox.click();
	}
}

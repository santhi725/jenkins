package flip.generic_libraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.gecko.driver","./software1/geckodriver.exe");
		  WebDriver driver =new FirefoxDriver();
		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  driver.get("https://www.facebook.com/?stype=lo&jlou");
		  
		  driver.findElement(By.id("email")).sendKeys("7411300343");
		  driver.findElement(By.id("pass")).sendKeys("#santhi85");
		  driver.findElement(By.xpath("//input[@value='Log In']")).click();
		  
		  WebDriverWait wait =new WebDriverWait(driver,10);
		  wait.until(ExpectedConditions.titleContains("Face"));
		  
		       String title = driver.getTitle();
		       System.out.println(title);
		       
		  
		  
		  
		  

	}

}

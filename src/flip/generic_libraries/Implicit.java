package flip.generic_libraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Implicit {

	public static void main(String[] args) throws InterruptedException
	{
	  System.setProperty("webdriver.gecko.driver","./software1/geckodriver.exe");
	  WebDriver driver =new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.get("http://localhost/login.do;jsessionid=1xfh63ibma6vj");
	  
	  driver.findElement(By.id("username")).sendKeys("admin");
	  driver.findElement(By.id("pwd")).sendKeys("manager");
	  driver.findElement(By.xpath("//div[.='Login ']")).click();
	  Thread.sleep(3000);
	             String title = driver.getTitle();
	          System.out.println(title);   
	   driver.findElement(By.xpath("//div[.=''Tasks']")).click();
	   //Thread.sleep(2000);
	   driver.findElement(By.xpath("//div.='Reports']")).click();
	 
	   

	   
	             
	  

	}

}

package flip.generic_libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Genericactions 
{
  public void mouseHouver(WebDriver driver,WebElement ele)
  {
	  Actions act =  new Actions(driver);
	  act.moveToElement(ele).perform();
  }
  public void dragDrop(WebDriver driver,WebElement src,WebElement tgt)
  {
	  Actions act = new Actions(driver);
	  act.dragAndDrop(src, tgt).perform();
  }
  public void rightclick(WebDriver driver,WebElement ele)
  {
	  Actions act = new Actions(driver);
	  act.contextClick(ele).perform();
  }
  public void doubleclick(WebDriver driver,WebElement ele)
  {
	  Actions act= new Actions(driver);
	  act.doubleClick(ele).perform();
  }
  
}
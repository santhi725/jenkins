package flip.generic_libraries;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Genericselect
{
  public void selectIndex(WebElement ele,int index)
  {
	  Select s = new Select(ele);
	  s.deselectByIndex(index);
  }
  public void selectValue(WebElement ele,String value)
  {
	  Select s= new Select(ele);
	  s.deselectByValue(value);
  }
  public void selectText(WebElement ele,String text)
  {
	  Select s=new Select(ele);
	  s.selectByVisibleText(text);
	  }
  public void deselect(WebElement ele)
  {
	  Select s=new Select(ele);
	  s.deselectAll();
  }
  public void selectoption(WebElement ele)
  {
	  Select s = new Select(ele);
	   List<WebElement> slctoptions = s.getAllSelectedOptions();
  }
  public int count_options(WebElement ele)
  {
	  Select s=new Select(ele);
	         List<WebElement> options = s.getOptions();
	          int count = options.size();
	         System.out.println(count);
	         
	         return count;
  }
  public int alloptions(WebElement ele )
  {
	  Select s=new Select(ele);
	         List<WebElement> options = s.getOptions();
	         int count = options.size();
	         System.out.println(options);
	         return count;
  }
  public Boolean multiple(WebElement ele)
  {
	  Select s = new Select(ele);
	     boolean mult = s.isMultiple();
	     System.out.println(mult);
	     return mult;
	     
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
} 

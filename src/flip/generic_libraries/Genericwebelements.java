package flip.generic_libraries;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;

public class Genericwebelements
{
   public void senddata(WebElement ele,String data)
     {
	   ele.sendKeys(data);
	 }
   public void location(WebElement ele)
      {
	        Point loc = ele.getLocation();
	        System.out.println(loc);
	        
	        int x = loc.getX();
	        System.out.println(x);
	                
	        int y = loc.getY();
	        System.out.println(y);
       }
   public String tooltip(WebElement ele,String value)
      {
	              String tooltip = ele.getAttribute(value);
	              System.out.println(tooltip);
	    return tooltip;          
      }
   public String text(WebElement ele)
   {
	          String text = ele.getText();
	          System.out.println(text);
	          return text;
	}
   public void tagname(WebElement ele)
   {
	              String tagname = ele.getTagName(); 
	              System.out.println(tagname);
     }
   public void size(WebElement ele)
   {
	           Dimension size = ele.getSize();
	            System.out.println(size);
   }
   public void cssvalue(WebElement ele,String data)
   {
	                 String font = ele.getCssValue(data);
	                 System.out.println(font);
	}
   public void cssvaluecolor(WebElement ele,String color)
   {
	                String colour = ele.getCssValue(color);
	                System.out.println(colour);
   }
   public void  cssvalueheight(WebElement ele,String hight)
   {
	                     String height = ele.getCssValue(hight);
	                     System.out.println(height);
   }
   public void cssvaluewidth(WebElement ele,String width1)
   {                   String  width  =  ele.getCssValue(width1);
                       System.out.println(width);
   }
   
   public void rect(WebElement ele)
   {
	             Rectangle rect = ele.getRect();
	             System.out.println(rect);
	}
   public void clik(WebElement ele) 
    {
    	      ele.click();          
    }
   public void cler(WebElement ele)
   {
	          ele.clear();
   }
   public boolean diplayed(WebElement ele)
   {
	           boolean disp= ele.isDisplayed();
	           return  disp; 
   }
   public boolean enabled(WebElement ele)
   {
	                 boolean enbl = ele.isEnabled();
	                 return enbl;
   }
}    
   
   
   
   
   
   
   
   
   
   
   

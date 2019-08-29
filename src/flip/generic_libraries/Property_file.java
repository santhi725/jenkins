package flip.generic_libraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Property_file
{
  @Test
  public static String  getData(String path,String key) throws FileNotFoundException, IOException
  {
	  Properties p=new Properties();//step1
	  p.load(new FileInputStream(path));//step2
	 String value = p.getProperty(key);//step3
	  System.out.println(value);
	return value;  
  }
  
}

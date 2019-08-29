package flip.generic_libraries;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extenttt
{
 @Test
 public void test1()
 {
	 ExtentReports reports=new ExtentReports("./report/r.html",false);//step1
	 
	 ExtentTest tests=reports.startTest("Testscript 1");//step2
	 
	 tests.log(LogStatus.PASS,"test case is passed");//step3
	 tests.log(LogStatus.FAIL,"test case is failed ");
	 tests.log(LogStatus.SKIP,"test case is skipped");
	 tests.log(LogStatus.ERROR,"error");
	 tests.log(LogStatus.WARNING,"warning");
	 tests.log(LogStatus.FATAL,"blocker");
	 tests.log(LogStatus.PASS,"test case i passed");
	 tests.log(LogStatus.FAIL,"test case is failed");
	 
	 reports.endTest(tests);
	 reports.flush();//save the data
	 
	 
 }
 
 
}

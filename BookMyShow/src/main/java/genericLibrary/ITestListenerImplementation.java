package genericLibrary;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * 
 * @author girija
 *
 */
public class ITestListenerImplementation implements ITestListener {
	
	public void onTestStart(ITestResult result) {   
	}  
	  
	public void onTestSuccess(ITestResult result) {   
	}  
	  
	public void onTestFailure(ITestResult result) {  
		TakesScreenshot ts=(TakesScreenshot)BaseClass.driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./errorshots/application.jpg");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}  
	  
	public void onTestSkipped(ITestResult result) {   
	}  
	  
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {    
	}  
	  
	public void onStart(ITestContext context) {   
	}  
	  
	public void onFinish(ITestContext context) {  
	} 

}

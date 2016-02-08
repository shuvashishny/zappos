package platform;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import browser.Browser;

public class CustomListener extends TestListenerAdapter{
	
	@Override
	public void onTestFailure(ITestResult testresult){
		System.out.println("failed");
		File scrFile = ((TakesScreenshot)Browser.driver).getScreenshotAs(OutputType.FILE); 
		try {
			FileUtils.copyFile(scrFile, new File("src/main/java/resources/screenshots/"+testresult.getName()+"/ScreenShot.jpg"));
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
	}
	
	@Override
	public void onTestStart(ITestResult testResult){
		Browser.openBrowser();
	}
	
	@Override
	public void onTestSuccess(ITestResult testResult){
		Browser.driver.quit();
	}

}

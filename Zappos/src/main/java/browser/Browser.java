package browser;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {
	
	public static WebDriver driver=null;

	public static void openBrowser(){
		getDriver("browser");
		driver.navigate().to(getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	private static String getProperty(String pName){		

		try (InputStream in = new FileInputStream("src/main/java/resources/browser.properties")) {		
			Properties prop = new Properties();			 
			prop.load(in);			 	            			
			return prop.getProperty(pName);	 	                    

		} catch (IOException e) {		
			e.printStackTrace();
			return null;		
		}
	}
	
	private static void getDriver(String bName){

		switch (getProperty(bName)) {

		case "firefox":
			driver=new FirefoxDriver();
			break;

		case "IE":
			driver=new InternetExplorerDriver();
			break;

		case "Chrome":
			driver=new ChromeDriver();
			break;

		default:
			System.out.println("Did not get a valid driver name");
			break;
		}

	}

}

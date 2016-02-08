package zappos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import browser.Browser;
import platform.Session;

public class AddToCartPage {
	
	@FindBy(how=How.ID,using="addToCart") private WebElement addToCartButton;
	@FindBy(how=How.CSS,using=".info>div") private WebElement warnigPopupMsg;
	@FindBy(how=How.ID,using="notifyMePopupLink") private WebElement notifyMePopupLink; 
	
	WebDriver driver=Browser.driver;
	
	public void addShoesToCart(){
		addToCartButton.click();
	}
	
	public void verifySelectSizeMsgShows(){			
		
		boolean msgPresent=warnigPopupMsg
				.getText()
				.contains("Please select a size");
		
		Assert.assertTrue(msgPresent,"Warning message did not show up");
		
	}
	
	public void clickDontSeeYourSizeLink(){
		
		Session.setSessionVariable(driver.getWindowHandle());
		notifyMePopupLink.click();	
		
		for(String winHandle:driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
		}		
	}
	

}

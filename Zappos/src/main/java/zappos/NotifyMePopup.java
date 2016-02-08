package zappos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import browser.Browser;
import platform.Session;

public class NotifyMePopup {
	
	@FindBy(how=How.ID, using="email") private WebElement emailTextBox;
	@FindBy(how=How.ID,using= "styleId") private WebElement colorDropDown;
	@FindBy(how=How.CSS, using="select[id='dimensionValueIds']") private WebElement sizeDropDown;
	@FindBy(how=How.CSS, using=".btn.action") private WebElement notifyMeButtonElement;
	@FindBy(how=How.CSS, using=".btn.secondary") private WebElement cancelButton;
	
	public void fillOutInformation(String email, String color, String size){
		
		fillOutEmail(email);
		selectFromColor(color);
		selectFromSize(size);		
	}
	
	public void clickOnNotifyMeButton(){
		notifyMeButtonElement.click();
	}
	
	public void clickOnCancelButton(){
		cancelButton.click();
	}
	
	public void returnToParentWindow(){
		
		Browser.driver.switchTo().window(Session.getSessionVariable());
	}
	
	private void fillOutEmail(String email){
		emailTextBox.clear();
		emailTextBox.sendKeys(email);
	}
	
	private void selectFromColor(String color){
		Select select=new Select(colorDropDown);
		select.selectByVisibleText(color);
	}
	
	private void selectFromSize(String size){
		Select select=new Select(sizeDropDown);
		select.selectByVisibleText(size);
	}

}

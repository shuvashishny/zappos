package zappos;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import browser.Browser;

public class HomePage {
	
	@FindBy(how=How.CSS, using="a[class^='gae-click*Homepage*Category-Navigation*Shop-Mens']")private List<WebElement> shopMensShoes;
	
	public void clickLinkFromShopMens(String linkName ) {
		
		shopMensShoes
		.stream()
		.filter(element->element.getText().equalsIgnoreCase(linkName))
		.findAny()
		.get().click();
	}
	
	

}

package zappos;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import platform.CustomListener;
import platform.Pages;

@Listeners(CustomListener.class)
public class AddToCartTestSuite {
	
	/*
	 *  Scenario: User will not be able to add shoes in cart with out selec a size
    Given User will navigate to the "Athletic" section of Mens shoes in zappos
    And Select "inov-8-f-lite-240-thyme-black-orange" from "Inov-8" brand
    When User click on the Add to cart link
    Then User should see a pop up to select size
	 * 
	 */
	
	/*Scenario: User should fill out the necessary information to get notification mail
	 * Given: User is in the page where he see 'Don't see your size' link
	 * And User click on the click on the 'Don't see your size' 
	 * When User fill out the email color and size
	 * And User click on the Notify Me button
	 * Then User should see Notification mail when product is available
	 * 
	 */
	
	@Test
	public void justTest(){		
		
		Pages.homePage().clickLinkFromShopMens("Shoes");
		Pages.mensShoesPage().selectFromShoesAndPopolarStyle("Athletic");
		Pages.mensShoesAthleticPage().selectBrandName("Inov-8");
		Pages.inov8AthleticShoes().selectProduct("inov-8-f-lite-240-thyme-black-orange");
		Pages.addToCartPage().addShoesToCart();
		Pages.addToCartPage().verifySelectSizeMsgShows();
		Pages.addToCartPage().clickDontSeeYourSizeLink();
		Pages.notifyMePopup().fillOutInformation("abc@abc.com","Chilli/Charcoal", "UK 8 (US Men's 9)");
		Pages.notifyMePopup().clickOnNotifyMeButton();
		Pages.notifyMePopup().returnToParentWindow();	
		
	}

}

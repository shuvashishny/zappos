package platform;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import browser.Browser;
import zappos.AddToCartPage;
import zappos.HomePage;
import zappos.NotifyMePopup;
import zappos.shopmens.MensShoesPage;
import zappos.shopmens.shoes.popularmesstyle.athletic.MensShoesAthleticPage;
import zappos.shopmens.shoes.popularmesstyle.athletic.brand.Inov8AthleticShoes;



public class Pages {
	
	static WebDriver  driver=Browser.driver;
	
	public static HomePage homePage(){
		return PageFactory.initElements(driver,HomePage.class);
	}
	
	public static MensShoesPage mensShoesPage(){
		return PageFactory.initElements(driver,MensShoesPage.class);
	}
	
	public static MensShoesAthleticPage mensShoesAthleticPage(){
		return PageFactory.initElements(driver,MensShoesAthleticPage.class);
	}
	
	public static Inov8AthleticShoes inov8AthleticShoes(){
		return PageFactory.initElements(driver, Inov8AthleticShoes.class);
	}
	
	public static AddToCartPage addToCartPage() {
		
		return PageFactory.initElements(driver,AddToCartPage.class);
		
	}
	
	public static NotifyMePopup notifyMePopup(){
		return PageFactory.initElements(driver,NotifyMePopup.class);
	}

}

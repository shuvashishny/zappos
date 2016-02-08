package zappos.shopmens.shoes.popularmesstyle.athletic;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MensShoesAthleticPage {
	
	@FindBy(how=How.CSS,using="#FCTbrandnamefacetSelect>a") private List<WebElement> brandNames;
	
	public void selectBrandName(String brandName){
		
		//for(WebElement element:brandNames){
		//	String string=element.getText();
		//	if(element.getText().equalsIgnoreCase(brandName))
		//		element.click();
		//}
		
		brandNames.parallelStream()
		.filter(element->element.getText().contains(brandName))
		.findAny().get().click();
	}

}

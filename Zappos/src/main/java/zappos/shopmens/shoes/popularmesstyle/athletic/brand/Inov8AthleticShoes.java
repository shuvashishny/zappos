package zappos.shopmens.shoes.popularmesstyle.athletic.brand;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Inov8AthleticShoes {
	
	
			
	@FindBy(how=How.CSS,using="a[class^='product']") private List<WebElement> allProducts;
	
	public void selectProduct(String pColor) {
		
		allProducts.parallelStream()
		.filter(element->element.getAttribute("href").contains(pColor))
		.findAny().get().click();
				
		
	}

}

package zappos.shopmens;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MensShoesPage {
	
	@FindBy(how=How.CSS, using="a[class^='gae-click*ALP-Mens-Shoes-Shipped-FREE*Category-Navigation*Shoes-Men-']")
	private List<WebElement> shoesAndPopularStylElements;
	
	public void selectFromShoesAndPopolarStyle(String elementName){
		
		shoesAndPopularStylElements
		.parallelStream()
		.filter(elemant->elemant.getText().equalsIgnoreCase(elementName))
		.findAny().get().click();		
		
	}

}

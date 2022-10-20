package testBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageObjects extends Baseclass {

	@FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	WebElement searchtextbox;
	
	@FindBy(id="nav-search-submit-button")
	WebElement searchbutton;
	
	//iphone link text
	@FindBy(linkText="Apple iPhone 13, 128GB, Blue - Unlocked (Renewed)")
	WebElement selectiphone13;
	
	@FindBy(id="quantity") 
	WebElement noofphone ;
	
	@FindBy(xpath="//*[@id=\"a-autoid-0-announce\"]/span[2]")
	WebElement value;
	
	@FindBy(id="add-to-cart-button")
	WebElement addtocart;
	
	
	public void homepagesearch(String searchtext) {
		searchtextbox.sendKeys(searchtext);
		searchbutton.click();
		selectiphone13.click();
		Select quantity=new Select(noofphone);
		quantity.selectByIndex(3);
		addtocart.click();
}
}

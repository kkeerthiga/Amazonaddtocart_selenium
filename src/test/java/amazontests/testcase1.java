package amazontests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import testBase.Baseclass;
import testBase.PageObjects;

public class testcase1 extends PageObjects{
	@Test
	public void testcase() {
	PageObjects pageObject=new PageObjects();
	PageFactory.initElements(driver,pageObject);
	pageObject.homepagesearch("iphone13");
	
	
	}

}
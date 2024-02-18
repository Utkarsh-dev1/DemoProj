package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Basepage {
	
	
	public HomePage(WebDriver driver) {

		super(driver);
		
	}
	
	
	// Elements
	
	@FindBy(linkText="My Account")
	WebElement Myaccount;
	

		public void clickMyAccount() {

			Myaccount.click();
		}



}

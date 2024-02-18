package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Basepage {

	WebDriver driver;
	
	public Basepage(WebDriver drvier) {

		this.driver= driver;
		
		PageFactory.initElements(drvier, this);

	}
	
}

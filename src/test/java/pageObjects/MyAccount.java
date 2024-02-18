package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends Basepage {
	
 public MyAccount(WebDriver driver) {
	 
	 super(driver);
 }
 
 
//Elements
 

 @FindBy(id ="username")
 WebElement username;
 
 @FindBy(id="password")
 WebElement passwordd;
 
 @FindBy(css="input[value='Login']")  
 WebElement login_button;
 
 @FindBy(css="div[class='woocommerce-MyAccount-content'] p strong") 
 WebElement LoginName;

 
 
 public void send_user_name(String email) {
	 
	 username.sendKeys(email);
	 
 }
 
public void  send_password(String password) {
	 
	passwordd.sendKeys(password);
	 
 }

public void click_Login() {
	login_button.click();
	
}
 

public String get_LoginName() {
	
	return LoginName.getText();
	
	
	
}
 
 

}

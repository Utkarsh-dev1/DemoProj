package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.MyAccount;
import testBase.BaseClass;

public class TC_001_MyAccountLoginTest extends BaseClass {

	@Test()
	public void test_account_Login() throws InterruptedException

	{
		logger.info("*** Starting TC_001_MyAccountLoginTest ***");
		HomePage hp = new HomePage(driver);
		MyAccount ma = new MyAccount(driver);

		hp.clickMyAccount();
		logger.info("*** Entering email address ***");
		ma.send_user_name(p.getProperty("email"));
		logger.info("*** Entering password  ***");
		ma.send_password(p.getProperty("password"));
		ma.click_Login();
		logger.info("*** Clicked on login ***");
		String val = ma.get_LoginName();

		logger.info("*** Comparing login value ***");
		if (val.equals("utk")) {

			Assert.assertTrue(true);
		}

		else {

			Assert.fail();
		}

	}
}

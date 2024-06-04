package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import PageObjects.LoginPage;

public class TestLogin extends BaseClass {
	
	public static String landingPageURL = "https://demo.guru99.com/Agile_Project/Agi_V1/customer/Customerhomepage.php";
	

	@Test(priority = 1)
	public void verifyLoginWithValidCredentials(String email, String password) throws InterruptedException {
		
		node = test.createNode("adminLoginWithValidCredentials");
		//driver.get(webUrl);
		LoginPage login = new LoginPage(driver);
		login.enterUserID(email);
		node.info("User ID entered as: "+email);
		login.enterPassword(password);
		node.info("Password entered as: "+password);
		login.clickOnLoginButton();
		node.info("Clicked on Login button");
		
		Assert.assertEquals(driver.getCurrentUrl(), landingPageURL);
		
	}

}

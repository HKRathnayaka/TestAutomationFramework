package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import BaseClass.BaseClass;
import PageObjects.LoginPage;

public class TestLogin extends BaseClass {
	
	public static String landingPageURL = "https://demo.guru99.com/Agile_Project/Agi_V1/customer/Customerhomepage.php";

	@Test
	public void verifyLoginWithValidCredentials() throws InterruptedException {
		
		
		LoginPage login = new LoginPage(driver);
		login.enterUserID(email);
		login.enterPassword(password);
		login.clickOnLoginButton();
		
		Assert.assertEquals(driver.getCurrentUrl(), landingPageURL);
		
	}

}

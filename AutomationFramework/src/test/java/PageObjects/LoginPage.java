package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//tbody/tr[1]/td[2]/input[1]")
	@CacheLookup
	public WebElement txtUserID;
	
	@FindBy(xpath="//tbody/tr[2]/td[2]/input[1]")
	@CacheLookup
	public WebElement txtPassword;
	
	@FindBy(xpath="//tbody/tr[3]/td[2]/input[1]")
	@CacheLookup
	public WebElement btnLogin;
	
	public void enterUserID(String uid) {
		txtUserID.clear();
		txtUserID.sendKeys(uid);
	}
	public void enterPassword(String password) {
		txtPassword.clear();
		txtPassword.sendKeys(password);
	}
	public void clickOnLoginButton() throws InterruptedException {
		btnLogin.click();
	}
}

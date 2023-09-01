package cucumber.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	Actions actions;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		actions = new Actions(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "/html/body/div[1]/nav/a")
	WebElement labelIcon;
	@FindBy(xpath = "//a[text()='Sign out']")
	WebElement btnLogout;
	@FindBy(xpath = "//a[text()='Sign in']")
	WebElement btnSigIn;
	@FindBy(name = "username")
	WebElement txtLoginName;
	@FindBy(name = "password")
	WebElement txtLoginPassword;
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/form/input[4]")
	WebElement btnLogin;
	@FindBy(xpath = "/html/body/div[3]")
	WebElement labelinvalidLogIn;

	

	// *********Register***********/
	

	

	public void labelHomepage(String expectedText) {
		String actualText = labelIcon.getText();
		Assert.assertEquals(expectedText, actualText);

	}

	public void btnLogout() {
		btnLogout.click();
	}

	
	// *********login***********/

	public void btnSigIn() {
		btnSigIn.click();
	}

	public void txtIdName(String username) {
		txtLoginName.clear();
		txtLoginName.sendKeys(username);
	}

	public void txtIdPassword(String password) {
		txtLoginPassword.clear();
		txtLoginPassword.sendKeys(password);
	}

	public void btnLogIn() {
		btnLogin.click();
	}

	public void labelInvalidLogIn(String expectedText) {
		String actualText = labelinvalidLogIn.getText();
		Assert.assertEquals(expectedText, actualText);

	}



}

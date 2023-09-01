package cucumber.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;
	Actions actions;
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		actions=new Actions(driver);
		PageFactory.initElements(driver, this);
		
	}
	 
	
	@FindBy(xpath = "//*[@id='navbarCollapse']/div[2]/ul/a[2]")
	WebElement start;
	@FindBy(xpath = "//input[@name='username']")
	WebElement txtUsername;
	@FindBy(xpath = "//*[@id='id_password1']")
	WebElement txtPassword;
	@FindBy(xpath = "//*[@id='id_password2']")
	WebElement txtConfpassword;
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/form/input[5]")
	WebElement verificationRegister;
	@FindBy(xpath = "/html/body/div[3]")
	WebElement invalidLabelIcon;
	
	
	
	public void clickRegister() {
		start.click();
	}

	public void txtUsername(String username) {
		txtUsername.clear();
		txtUsername.sendKeys(username);
		;
	}

	public void txtPassword(String password) {
		txtPassword.clear();
		txtPassword.sendKeys(password);
	}

	public void txtConfpassword(String confpassword) {
		txtConfpassword.clear();
		txtConfpassword.sendKeys(confpassword);
		;
	}

	public void clickVerificationRegister() {
		verificationRegister.click();
	}

	

	public void labelInvalidHomepage(String expectedText) {
		String actualText = invalidLabelIcon.getText();
		Assert.assertEquals(expectedText, actualText);

	}

}

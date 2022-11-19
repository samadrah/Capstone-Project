package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailNewAccountPage extends BaseSetup{
	
	public RetailNewAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id="nameInput")
	public WebElement nameField;
	
	@FindBy(id="emailInput")
	public WebElement emailField;
	
	@FindBy(id="passwordInput")
	public WebElement passwordField;
	
	@FindBy(id="confirmPasswordInput")
	public WebElement confirmPasswordField;
	
	@FindBy(id="signupBtn")
	public WebElement signUpBttn;


}

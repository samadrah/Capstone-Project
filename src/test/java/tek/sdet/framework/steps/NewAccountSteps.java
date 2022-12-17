package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtilities;

public class NewAccountSteps extends CommonUtilities{
	
	POMFactory factory = new POMFactory();
	
	@And("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		click(factory.signInPage().newAccount);
		logger.info("user clicked on create new account");
	}
	
	@And("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(DataTable data) {
		List<Map<String,String>> signUpData = data.asMaps(String.class,String.class);
		sendText(factory.newAccountPage().nameField,signUpData.get(0).get("name"));
		sendText(factory.newAccountPage().emailField,signUpData.get(0).get("email"));
		sendText(factory.newAccountPage().passwordField,signUpData.get(0).get("password"));
		sendText(factory.newAccountPage().confirmPasswordField,signUpData.get(0).get("confirmPassword"));
		logger.info("user filled the form with required information");
	}
	
	@And("User click on SignUp button")
	public void userClickOnSignUpButton() {
		click(factory.newAccountPage().signUpBttn);
		logger.info("user clicked on sign up button");
		
	}
	
	@Then("User should be logged in into account page")
	public void userShouldBeLoggedInIntoAccountPage() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().updateBttn));
		logger.info("user is logged in into account");
		
	}

}

package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtilities;

public class SignInSteps extends CommonUtilities{
	
	POMFactory factory = new POMFactory();
	
	@Given("User is on retail website")
	public void verifyUserCanSignInIntoRetailApplication() {
		String expectedTitle = "React App";
		String actualTitle = getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		logger.info("User is on home page");
	}
	
	@When("User click on Sign In option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signInBttn);
		logger.info("user clicked on sign in button");
	}
	
	@And("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email,String password) {
		sendText(factory.signInPage().email,email);
		sendText(factory.signInPage().password,password);
		logger.info("user entered email and password");
	}
	
	@And("User click on login button")
	public void userClickOnloginButton() {
		click(factory.signInPage().loginBttn);
		logger.info("user clicked on log in button");
		
	}
	
	@Then("User should be logged in into account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().account));
		logger.info("user is logged in into account");
	}
	
	

}

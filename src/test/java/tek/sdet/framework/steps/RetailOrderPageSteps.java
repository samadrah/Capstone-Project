package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtilities;

public class RetailOrderPageSteps extends CommonUtilities{
	
	POMFactory factory = new POMFactory();
	
	@And("User Click on Order Section")
	public void userClickOnOrderSection() {
		click(factory.orderPage().orderOption);
		logger.info("user clicked on order option");
	}
	
	@And("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(factory.orderPage().cancelTheOrder);
		logger.info("user clicked on cancel the order");
	}
	
	@And("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String reason) {
		selectByVisibleText(factory.orderPage().reasonInput,reason);
		logger.info("user selected the reason for return");
	}
	
	@And("User click on cancel order button")
	public void userClickOnCancelOrderButton() {
		click(factory.orderPage().cancelOrder);
		logger.info("user clicked on cancel order button");
	}
	
	@Then("A cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String message) {
		String expectedMsg = message;
		String actualMsg = getElementText(factory.orderPage().cancelationMessage);
		Assert.assertEquals(expectedMsg, actualMsg);
		logger.info("order canceled successfully");
	}
	
	@And("User Click on second order")
	public void userClickOnSecondOrder() {
		click(factory.orderPage().showDetails2ndorder);
		logger.info("user clicked on 2nd order on the list");
	}
	
	@And("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		click(factory.orderPage().returnItems);
		logger.info("user clicked on return Items");
	}
	
	@And("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String reason) {
		selectByVisibleText(factory.orderPage().reasonInput,reason);
		logger.info("user selected the reason for return");
	}
	
	@And("User select the drop off service {string}")
	public void userSelectTheDropOffService(String dropOff) {
		selectByVisibleText(factory.orderPage().dropOfInput,dropOff);
		logger.info("user selected the drop off service");
	}
	
	@And("User click on Return Order button")
	public void userClickOnRetunOrderButton() {
		click(factory.orderPage().returnOrder);
		logger.info("user clicked on return order");
	}
	
	@Then("A cancelation Message should be Displayed {string}")
	public void aCancelationMessageShouldBEDisplayed(String message) {
		String expectedMsg = message;
		String actualMsg = getElementText(factory.orderPage().returnMessage);
		Assert.assertEquals(expectedMsg, actualMsg);
		logger.info("item returned successfully");
	}
	
	@And("User Click on third order")
	public void userClickOnThirdOrder() {
		click(factory.orderPage().showDetails3rdOrder);
		logger.info("user clicked on 3rd order on the list");
	}
	
	@And("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.orderPage().review);
		logger.info("user clicked on add review");
	}
	
	@And("User Write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAnd(String headline,String reviewText) {
		sendText(factory.orderPage().headlineInput,headline);
		sendText(factory.orderPage().reviewText,reviewText);
		logger.info("user wrote a review");
	}
	
	@And("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.orderPage().addReview);
		logger.info("user clicked on add review");
	}
	
	@Then("A review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String message) {
		String expectedMsg = message;
		String actualMsg = getElementText(factory.orderPage().reviewSuccessMsg);
		Assert.assertEquals(expectedMsg, actualMsg);
		logger.info("user added review successfully");
	}
}

package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtilities;

public class RetailAccountSteps extends CommonUtilities{
	
	POMFactory factory = new POMFactory();
	
	
	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().account);
		logger.info("user clicked on account option");
	}
	
	@And("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name,String phone) {
		clearTextUsingSendKeys(factory.accountPage().name);
		sendText(factory.accountPage().name,name);
		clearTextUsingSendKeys(factory.accountPage().phonenumber);
		sendText(factory.accountPage().phonenumber,phone);
		logger.info("user entered name and phone");
	}
	
	@And("User click on update option")
	public void userClickOnUpdateOption() {
		slowDown();
		click(factory.accountPage().updateBttn);
		logger.info("user clicked on update button");
	}
	
	@Then("User profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		String expectedName = "Genius";
		String actualName = getElementText(factory.accountPage().inputName);
		logger.info("user updated profile information");
	}
	
	@And("User enter below information")
	public void userEnterBelowInformation(DataTable data) {
		List<Map<String,String>> passwordUpdate = data.asMaps(String.class,String.class);
		sendText(factory.accountPage().previousPass,passwordUpdate.get(0).get("previousPassword"));
		sendText(factory.accountPage().newPass,passwordUpdate.get(0).get("newPassword"));
		sendText(factory.accountPage().confirmPass,passwordUpdate.get(0).get("confrimPassword"));
		logger.info("user chnaged password");
	}
	
	@And("User click on change password button")
	public void userClickOnChangePasswordButton() {
		click(factory.accountPage().changePass);
		logger.info("user clicked change password button");
	}
	
	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String message) {
		String expectedMsg = "Password Updated Successfully";
		String actualMsg = getElementText(factory.accountPage().passSuccessMsg);
		Assert.assertEquals(expectedMsg, actualMsg);
		logger.info("user successfully updated their password");
		
	}
	
	@And("User click on add a payment method link")
	public void userClickOnAddAPaymentMethodLink() 	{
		click(factory.accountPage().addPaymentMethod);
		logger.info("user clicked on add a payment method link");
	}
	
	@And("User fill Debit or Credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable data) {
		List<Map<String,String>> paymentMethod = data.asMaps(String.class,String.class);
		sendText(factory.accountPage().cardNumberField,paymentMethod.get(0).get("cardNumber"));
		sendText(factory.accountPage().nameOnCardField,paymentMethod.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().expirationMonth,paymentMethod.get(0).get("expirationMonth"));
		selectByVisibleText(factory.accountPage().expirationYear,paymentMethod.get(0).get("expirationYear"));
		sendText(factory.accountPage().securityCode,paymentMethod.get(0).get("securityCode"));
		logger.info("user filled the form with required information");
	}
	
	@And("User click on add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().AddCardBttn);
		logger.info("user clicked on add your card button");
	}
	
	@Then("A message should be displayed {string}")
	public void aMessageShouldBEDisplayed(String message) {
		String expectedMsg = message;
		String actualMsg = getElementText(factory.accountPage().paymentAddedMsg);
		Assert.assertEquals(expectedMsg, actualMsg);
		logger.info("user successfully added the payment method");
	}
	
	@When("User click on edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.accountPage().cards);
		click(factory.accountPage().editCard);
		logger.info("user clicked on card and then on edit in card section");
	}
	
	@And("User edit information with below data")
	public void userEditInformationWithBelowData(DataTable data) {
		List<Map<String,String>> cardUpdate = data.asMaps(String.class,String.class);
		clearTextUsingSendKeys(factory.accountPage().cardNumberField);
		sendText(factory.accountPage().cardNumberField,cardUpdate.get(0).get("cardNumber"));
		clearTextUsingSendKeys(factory.accountPage().nameOnCardField);
		sendText(factory.accountPage().nameOnCardField,cardUpdate.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().expirationMonth,cardUpdate.get(0).get("expirationMonth"));
		selectByVisibleText(factory.accountPage().expirationYear,cardUpdate.get(0).get("expirationYear"));
		clearTextUsingSendKeys(factory.accountPage().securityCode);
		sendText(factory.accountPage().securityCode,cardUpdate.get(0).get("securityCode"));
		logger.info("user edited all information on card");
	}
	
	@And("User click on Update your card button")
	public void userClickOnUpadateYourCardButton() {
		click(factory.accountPage().updateCardBttn);
		logger.info("user clicked on update card button");
	}
	
	@Then("a Message should be displayed {string}")
	public void aMessagEShouldBeDisplayed(String value) {
		String expectedMsg = value;
		String actualMsg = getElementText(factory.accountPage().cardUpdateMsg);
		Assert.assertEquals(expectedMsg, actualMsg);
		logger.info("user updated payment method successfully");
	}
	
	@And("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.accountPage().cards);
		click(factory.accountPage().removeCard);
		logger.info("user clicked on cards and then clicked on remove card");
	}
	
	@Then("Payment details should be removed") 
	public void paymentDetailsShouldBeRemoved() {
		if(isElementDisplayed(factory.accountPage().cards) == false)
		logger.info("payment details removed");
	}
	
	@When("User click on add Address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().addAddress);
		logger.info("user clicked on add address option");
	}
	
	@And("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable data) {
		List<Map<String,String>> addAddress = data.asMaps(String.class,String.class);
		selectByVisibleText(factory.accountPage().countryDropdown,addAddress.get(0).get("country"));
		sendText(factory.accountPage().fullNameInput,addAddress.get(0).get("fullName"));
		sendText(factory.accountPage().phoneNumberInput,addAddress.get(0).get("phoneNumber"));
		sendText(factory.accountPage().streetInput,addAddress.get(0).get("streetAddress"));
		sendText(factory.accountPage().aptInput,addAddress.get(0).get("apt"));
		sendText(factory.accountPage().cityInput,addAddress.get(0).get("city"));
		selectByVisibleText(factory.accountPage().stateInput,addAddress.get(0).get("state"));
		sendText(factory.accountPage().zipCodeInput,addAddress.get(0).get("zipCode"));
		logger.info("user filled the form with all required information");
	}
	
	@And("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.accountPage().addAddressBttn);
		logger.info("user clicked on add your address button");
	}

	@Then("a Message should Be Displayed {string}")
	public void aMessaGeShouldBeDisplayed(String message) {
		String expectedMsg = message;
		String actualMsg = getElementText(factory.accountPage().addressMsg);
		Assert.assertEquals(expectedMsg, actualMsg);
		logger.info("user added address successfully");
	}
	
	@And("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.accountPage().addressEditBttn);
		logger.info("user clicked on edit address button");
	}
	
	@And("User fill new address form with below Information")
	public void userFillNewAddressFormWithbelowInformation(DataTable data) {
		List<Map<String,String>> addressUpdate = data.asMaps(String.class,String.class);
		selectByVisibleText(factory.accountPage().countryDropdown,addressUpdate.get(0).get("country"));
		clearTextUsingSendKeys(factory.accountPage().fullNameInput);
		sendText(factory.accountPage().fullNameInput,addressUpdate.get(0).get("fullName"));
		clearTextUsingSendKeys(factory.accountPage().phoneNumberInput);
		sendText(factory.accountPage().phoneNumberInput,addressUpdate.get(0).get("phoneNumber"));
		clearTextUsingSendKeys(factory.accountPage().streetInput);
		sendText(factory.accountPage().streetInput,addressUpdate.get(0).get("streetAddress"));
		clearTextUsingSendKeys(factory.accountPage().aptInput);
		sendText(factory.accountPage().aptInput,addressUpdate.get(0).get("apt"));
		clearTextUsingSendKeys(factory.accountPage().cityInput);
		sendText(factory.accountPage().cityInput,addressUpdate.get(0).get("city"));
		selectByVisibleText(factory.accountPage().stateInput,addressUpdate.get(0).get("state"));
		clearTextUsingSendKeys(factory.accountPage().zipCodeInput);
		sendText(factory.accountPage().zipCodeInput,addressUpdate.get(0).get("zipCode"));
		logger.info("user updated all the required fields with new information");
	}
	
	@And("User click update your address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.accountPage().addressUpdateBttn);
		logger.info("user clicked on update address button");
	}
	
	@Then("a mesaage Should Be displayed {string}")
	public void aMessageSHouldBeDisplayed(String message) {
		String expectedMsg = message;
		String actualMsg = getElementText(factory.accountPage().addressUpdateMsg);
		Assert.assertEquals(expectedMsg, actualMsg);
		logger.info("user updated the address successfully");
	}
	
	@And("User click on remove option of address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.accountPage().removeAddressBttn);
		logger.info("user clicked on remove address button");
	}
	
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		if(isElementDisplayed(factory.accountPage().addressEditBttn) == false)
		logger.info("user removed address successfully");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

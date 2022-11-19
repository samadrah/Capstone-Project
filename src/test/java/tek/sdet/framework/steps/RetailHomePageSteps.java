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

public class RetailHomePageSteps extends CommonUtilities{
	
	POMFactory factory = new POMFactory();
	
	
	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().allSection);
		logger.info("user clicked on all section");
	}
	
	@Then("below options are present in shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable data) {
		List<List<String>> optionsAvailable = data.asLists(String.class);
		String expected = optionsAvailable.get(0).get(0);
		String actual = getElementText(factory.homePage().electronicsOption);
		Assert.assertEquals(expected, actual);
		logger.info("Electronics option is present");
		String expected2 = optionsAvailable.get(0).get(1);
		String actual2 = getElementText(factory.homePage().computersOption);
		Assert.assertEquals(expected2, actual2);
		logger.info("Computers option is pressent");
		String expected3 = optionsAvailable.get(0).get(2);
		String actual3 = getElementText(factory.homePage().smartHomeOption);
		Assert.assertEquals(expected3, actual3);
		logger.info("Smart Home option is present");
		String expected4 = optionsAvailable.get(0).get(3);
		String actual4 = getElementText(factory.homePage().sportsOption);
		Assert.assertEquals(expected4, actual4);
		logger.info("Sports option is present");
		String expected5 = optionsAvailable.get(0).get(4);
		String actual5 = getElementText(factory.homePage().automativeOption);
		Assert.assertEquals(expected5, actual5);
		logger.info("Automative option is present");
	} 
	
	
	@And("User click on {string}")
	public void userClickOn(String department) {
		switch(department) {
		case "Electronics":
			click(factory.homePage().electronicsOption);
			logger.info("user clicked on electronics option");
			break;
		case "Computers":
			click(factory.homePage().computersOption);
			logger.info("user clicked on computers option");
			break;
		case "Smart Home":
			click(factory.homePage().smartHomeOption);
			logger.info("user clicked on smart home option");
			break;
		case "Sports":
			click(factory.homePage().sportsOption);
			logger.info("user clicked on sports option");
			break;
		case "Automotive":
			click(factory.homePage().automativeOption);
			logger.info("user clicked on automative option");
			break;
			default:
		}	
		
	}
	
	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable data) {
	    List<List<String>> optionsAvailable = data.asLists(String.class);
	   switch(optionsAvailable.get(0).get(0)) {
	   case "TV & Video":
		   String video = getText(factory.homePage().videoGames);
           String TVAndVideo = getText(factory.homePage().tvAndVideo);
           Assert.assertEquals(TVAndVideo, optionsAvailable.get(0).get(0));
           Assert.assertEquals(video, optionsAvailable.get(0).get(1));
           logger.info("options are available in electronics department");
           break;
	   case "Accessories":
		   String Accessories = getText(factory.homePage().accessories);
           String Networking = getText(factory.homePage().networking);
           Assert.assertEquals(Accessories, optionsAvailable.get(0).get(0));
           Assert.assertEquals(Networking, optionsAvailable.get(0).get(1));
           logger.info("options are available in computer department");
           break;
	   case "Smart Home Lightning":
		   String smartHomeLightning = getText(factory.homePage().smartHomeLighting);
           String plugsAndOutlets = getText(factory.homePage().plugsAndOutlets);
           Assert.assertEquals(smartHomeLightning, optionsAvailable.get(0).get(0));
           Assert.assertEquals(plugsAndOutlets, optionsAvailable.get(0).get(1));
           logger.info("options are available in smart home department");
           break;
	   case "Athletic Clothing":
		   String AthleticClothing = getText(factory.homePage().athleticClothing);
           String ExerciseFitness = getText(factory.homePage().excerciseAndFitness);
           Assert.assertEquals(AthleticClothing, optionsAvailable.get(0).get(0));
           Assert.assertEquals(ExerciseFitness, optionsAvailable.get(0).get(1));
           logger.info("options are available in sports department");
           break;
	   case "Automative Parts & Accessories":
		   String AutomativePartsAccessories = getText(factory.homePage().autoPartsAndAccessories);
           String MotorCyclePowersports = getText(factory.homePage().motorcycleAndPowersports);
           Assert.assertEquals(AutomativePartsAccessories, optionsAvailable.get(0).get(0));
           Assert.assertEquals(MotorCyclePowersports, optionsAvailable.get(0).get(1));
           logger.info("options are available in automative department");
           break;
           default:
	   }
	}
	
	@And("User change the category to {string}")
	public void userChangeTheCategoryTo(String value) {
		selectByVisibleText(factory.homePage().category,value);
		logger.info("user changed category to smart home");
	}
	
	@And("User search for an item {string}")
	public void userSearchForAnItem(String value) {
		waitTillPresence(factory.homePage().searchInput);
		sendText(factory.homePage().searchInput,value);
		logger.info("user typed kasa outdoor smart plug in search bar");
	}
	
	@And("User click on search icon")
	public void userClickOnSearchIcon() {
		waitTillClickable(factory.homePage().searchBttn);
		click(factory.homePage().searchBttn);
		logger.info("user clicked on search button");
	}
	
	@And("User click on item")
	public void userClickOnItem() {
		waitTillClickable(factory.homePage().plugItem);
		click(factory.homePage().plugItem);
		logger.info("user clicked on item");
	}
	
	@And("User select quantity {string}")
	public void userSelectQuantity(String value) {
		waitTillPresence(factory.homePage().quantity);
		selectByVisibleText(factory.homePage().quantity,value);
		logger.info("user changed quantity to 2");
	}
	
	@And("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.homePage().addToCartBttn);
		logger.info("user clicked on add to cart button");
	}
	
	@Then("The cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String value) {
		String expectedValue = value;
		String actualValue = getElementText(factory.homePage().cartQuantity);
		Assert.assertEquals(expectedValue, actualValue);
		logger.info("cart icon shows 2 items");
	}
	
	@And("User click on cart option")
	public void userClickOnCartOption() {
		click(factory.homePage().cartBttn);
		logger.info("user clicked on cart option");
	}
	
	@And("User click on Proceed to Checkout button")
	public void userClickOnProccedToCheckoutButton() {
		click(factory.homePage().checkoutBttn);
		logger.info("user clicked on procced to checkout button");
	}
	
	@And("User click add a new address link for shipping address")
	public void userClickAddNewAddressLinkForShippingAddress() {
		click(factory.homePage().cartAddAddress);
		logger.info("user clicked on add address link");
	}
	
	@And("User fill new address Form With Below Information")
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
		logger.info("user added new shipping address at checkout");
	}
	
	
	@And("User click Add a credit card or Debit card for payment Method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
		click(factory.homePage().cartPaymentLink);
		logger.info("user clicked on add debit or credit card for payment method");
	}
	
	@And("User Fill Debit or Credit Card Information")
	public void userFillDebitOrCreditCardInformation(DataTable data) {
		List<Map<String,String>> addCard = data.asMaps(String.class,String.class);
		sendText(factory.accountPage().cardNumberField,addCard.get(0).get("cardNumber"));
		sendText(factory.accountPage().nameOnCardField,addCard.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().expirationMonth,addCard.get(0).get("expirationMonth"));
		selectByVisibleText(factory.accountPage().expirationYear,addCard.get(0).get("expirationYear"));
		sendText(factory.accountPage().securityCode,addCard.get(0).get("securityCode"));
		logger.info("user added Debit or Credit card for payment method");
	}
	
	@And("User click on place your order")
	public void userClickOnPlaceYourOrder() {
		slowDown();
		click(factory.homePage().placeOrderBttn);
		logger.info("user clicked on place your order");
	}
	
	@Then("a message Should Be Displayed {string}")
	public void aMeSsageShouldBeDisplayed(String message) {
		String expectedMsg = message;
		String actualMsg = getElementText(factory.homePage().orderPlacedMsg);
		Assert.assertEquals(expectedMsg, actualMsg);
		logger.info("user placed their order");
	}
	
	@And("User Change the category to {string}")
	public void userChangeTheCategoryTO(String value) {
		slowDown();
		selectByVisibleText(factory.homePage().category,value);
		logger.info("user changed department to electronics");
	}
	
	@And("User search for an Item {string}")
	public void userSearchForAnIteM(String value) {
		slowDown();
		sendText(factory.homePage().searchInput,value);
		logger.info("user searched for Apex Legends");
	}
	
	@And("User click on Item")
	public void userClickONItem() {
		slowDown();
		click(factory.homePage().plugItem);
		logger.info("user clicked on item");
	}
	
	@And("User select Quantity {string}")
	public void userSelecTQuantity(String value) {
		slowDown();
		selectByVisibleText(factory.homePage().quantity,value);
		logger.info("user changed the quantity to 5");
	}
	
	@And("The cart Icon quantity should change to {string}")
	public void theCartIcoNQuantityShouldChangeTo(String value) {
		slowDown();
		String expectedValue = value;
		String actualValue = getElementText(factory.homePage().apexCartQty);
		Assert.assertEquals(expectedValue, actualValue);
		logger.info("cart icon shows 5 items");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

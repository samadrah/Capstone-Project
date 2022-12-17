package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{
	
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id="profileImage")
	public WebElement profileImg;
	
	@FindBy(id="nameInput")
	public WebElement name;
	
	@FindBy(id="personalPhoneInput")
	public WebElement phonenumber;
	
	@FindBy(id="personalUpdateBtn")
	public WebElement updateBttn;
	
	@FindBy(xpath="//input[@name='name']")
	public WebElement inputName;
	
	@FindBy(id="previousPasswordInput")
	public WebElement previousPass;
	
	@FindBy(id="newPasswordInput")
	public WebElement newPass;
	
	@FindBy(id="confirmPasswordInput")
	public WebElement confirmPass;
	
	@FindBy(id="credentialsSubmitBtn")
	public WebElement changePass;
	
	@FindBy(xpath="//div[text()='Password Updated Successfully']")
	public WebElement passSuccessMsg;
	
	@FindBy(xpath="//p[text()='Add a payment method']")
	public WebElement addPaymentMethod;
	
	@FindBy(id="cardNumberInput")
	public WebElement cardNumberField;
	
	@FindBy(id="nameOnCardInput")
	public WebElement nameOnCardField;
	
	@FindBy(id="expirationMonthInput")
	public WebElement expirationMonth;
	
	@FindBy(id="expirationYearInput")
	public WebElement expirationYear;
	
	@FindBy(id="securityCodeInput")
	public WebElement securityCode;
	
	@FindBy(id="paymentSubmitBtn")
	public WebElement AddCardBttn;
	
	@FindBy(xpath="//div[text()='Payment Method added sucessfully']")
	public WebElement paymentAddedMsg;
	
	@FindBy(xpath="//div[@class='account__payment-sub']")
	public WebElement cards;
	
	@FindBy(xpath="//button[text()='Edit']")
	public WebElement editCard;
	
	@FindBy(xpath="//button[text()='Update Your Card']")
	public WebElement updateCardBttn;
	
	@FindBy(xpath="//div[text()='Payment Method updated Successfully']")
	public WebElement cardUpdateMsg;
	
	@FindBy(xpath="//button[text()='remove']")
	public WebElement removeCard;
	
	@FindBy(xpath="//div[@class='account__address-new-wrapper']")
	public WebElement addAddress;
	
	@FindBy(id="countryDropdown")
	public WebElement countryDropdown;
	
	@FindBy(id="fullNameInput")
	public WebElement fullNameInput;
	
	@FindBy(xpath="//form[@id='newForm']//child::input[@id='phoneNumberInput']")
	public WebElement phoneNumberInput;
	
	@FindBy(id="streetInput")
	public WebElement streetInput;
	
	@FindBy(id="apartmentInput")
	public WebElement aptInput;
	
	@FindBy(id="cityInput")
	public WebElement cityInput;
	
	@FindBy(xpath="//select[@name='state']")
	public WebElement stateInput;
	
	@FindBy(id="zipCodeInput")
	public WebElement zipCodeInput;
	
	@FindBy(id="addressBtn")
	public WebElement addAddressBttn;
	
	@FindBy(xpath="//div[text()='Address Added Successfully']")
	public WebElement addressMsg;
	
	@FindBy(xpath="//button[text()='Edit']")
	public WebElement addressEditBttn;
	
	@FindBy(id="addressBtn")
	public WebElement addressUpdateBttn;
	
	@FindBy(xpath="//div[text()='Address Updated Successfully']")
	public WebElement addressUpdateMsg;
	
	@FindBy(xpath="//button[text()='Remove']")
	public WebElement removeAddressBttn;
	
	
}

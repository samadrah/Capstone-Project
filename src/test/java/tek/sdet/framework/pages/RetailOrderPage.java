package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup{
	
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id="orderLink")
	public WebElement orderOption;
	
	@FindBy(id="reasonInput")
	public WebElement reasonInput;
	
	@FindBy(id="orderSubmitBtn")
	public WebElement cancelOrder;
	
	@FindBy(xpath="//p[text()='Your Order Has Been Cancelled']")
	public WebElement cancelationMessage;
	
	@FindBy(id="cancelBtn")
	public WebElement cancelTheOrder;
	
	@FindBy(id="returnBtn")
	public WebElement returnItems;
	
	@FindBy(id="dropOffInput")
	public WebElement dropOfInput;
	
	@FindBy(id="orderSubmitBtn")
	public WebElement returnOrder;
	
	@FindBy(xpath="//p[text()='Return was successfull']")
	public WebElement returnMessage;
	
	@FindBy(id="reviewBtn")
	public WebElement review;
	
	@FindBy(id="headlineInput")
	public WebElement headlineInput;
	
	@FindBy(id="descriptionInput")
	public WebElement reviewText;
	
	@FindBy(id="reviewSubmitBtn")
	public WebElement addReview;
	
	@FindBy(xpath="//div[text()='Your review was added successfully']")
	public WebElement reviewSuccessMsg;
	
	@FindBy(xpath="//div[@data-id='1098']//child::p[text()='Show Details']")
	public WebElement showDetails2ndorder;
	
	@FindBy(xpath="//div[@data-id='269']//child::p[text()='Show Details']")
	public WebElement showDetails3rdOrder;
	
	
	

}

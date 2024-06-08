package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CheckOutPage extends Base {
	public CheckOutPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	@FindBy(id = "user.emailAddress")
    private WebElement contactInfo_EmailId;

    @FindBy(id = "user.phone")
    private WebElement contactInfo_MobileNumber;

    @FindBy(xpath = "//span[text()='Continue to Payment Information']")
    private WebElement continueToPayment_Information;

    @FindBy(id = "number")
    private WebElement creditCardAndDebitCard_Number;

    @FindBy(id = "first-name")
    private WebElement firstNameFor_Billing;

    @FindBy(id = "last-name")
    private WebElement lastNameFor_Billing;

    @FindBy(id = "city")
    private WebElement cityFor_Billing;

    @FindBy(id = "state")
    private WebElement stateFor_Billing;

    @FindBy(id = "postalCode")
    private WebElement zipcodeFor_Billing;

    @FindBy(id = "address-input")
    private WebElement addressFor_Billing;

    @FindBy(xpath = "placeYour_Order")
    private WebElement placeYour_Order;

    // Getter methods
    public WebElement getContactInfoEmailId() {
        return contactInfo_EmailId;
    }

    public WebElement getContactInfoMobileNumber() {
        return contactInfo_MobileNumber;
    }

    public WebElement getContinueToPaymentInformation() {
        return continueToPayment_Information;
    }

    public WebElement getCreditCardAndDebitCardNumber() {
        return creditCardAndDebitCard_Number;
    }

    public WebElement getFirstNameForBilling() {
        return firstNameFor_Billing;
    }

    public WebElement getLastNameForBilling() {
        return lastNameFor_Billing;
    }

    public WebElement getCityForBilling() {
        return cityFor_Billing;
    }

    public WebElement getStateForBilling() {
        return stateFor_Billing;
    }

    public WebElement getZipcodeForBilling() {
        return zipcodeFor_Billing;
    }

    public WebElement getAddressForBilling() {
        return addressFor_Billing;
    }

    public WebElement getPlaceYourOrder() {
        return placeYour_Order;
    }
}
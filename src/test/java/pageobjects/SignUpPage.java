package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends Base {

	public SignUpPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	    @FindBy(xpath = "//span[text()='Account']")
	    private WebElement clickAccount;

	    @FindBy(xpath = "//a[text()='Create Account']")
	    private WebElement accountCreate;

	    @FindBy(id = "firstName")
	    private WebElement firstName;

	    @FindBy(id = "lastName")
	    private WebElement lastName;

	    @FindBy(id = "email")
	    private WebElement email;

	    @FindBy(xpath = "(//input[@type='password'])[1]")
	    private WebElement password;

	    @FindBy(id = "reenterPassword")
	    private WebElement confirmPassword;

	    @FindBy(id = "phone")
	    private WebElement mobileNumber;

	    @FindBy(xpath = "//button[@type='submit']")
	    private WebElement submit;

	    public WebElement getAccount() {
	        return clickAccount;
	    }

	    public WebElement getCreateAccount() {
	        return accountCreate;
	    }

	    public WebElement getFirstName() {
	        return firstName;
	    }

	    public WebElement getLastName() {
	        return lastName;
	    }

	    public WebElement getEmail() {
	        return email;
	    }

	    public WebElement getPassword() {
	        return password;
	    }

	    public WebElement getConfirmPassword() {
	        return confirmPassword;
	    }

	    public WebElement getMobileNumber() {
	        return mobileNumber;
	    }

	    public WebElement getSubmit() {
	        return submit;
	    }
	}

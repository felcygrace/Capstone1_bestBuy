package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {

	public LoginPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	 @FindBy(xpath = "//a[text()='Sign In']")
	    private WebElement clickSignIn;

	    @FindBy(xpath = "//label[text()='Email Address']")
	    private WebElement emailId;

	    @FindBy(xpath = "//label[text()='Password']")
	    private WebElement pass_Word;

	    @FindBy(xpath = "//button[text()='Sign In']")
	    private WebElement submit_Signin;

	    @FindBy(xpath = "//button[text()='Continue as Guest']")
	    private WebElement continue_AsGuest;

	    // Getter methods
	    public WebElement getUsersignIn() {
	        return clickSignIn;
	    }

	    public WebElement getMailId() {
	        return emailId;
	    }

	    public WebElement getPassWord() {
	        return pass_Word;
	    }

	    public WebElement getSubmitSignin() {
	        return submit_Signin;
	    }

	    public WebElement getContinueAsGuest() {
	        return continue_AsGuest;
	    }
}
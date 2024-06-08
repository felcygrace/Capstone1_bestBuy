package configuration;

import org.openqa.selenium.WebDriver;

import pageobjects.Base;
import pageobjects.CartPage;
import pageobjects.CheckOutPage;
import pageobjects.HomePage;
import pageobjects.SelectCountry;
import pageobjects.LoginPage;
import pageobjects.SignUpPage;

public class POM_Manager extends Base {
	public WebDriver driver;

	private SignUpPage signup;
	private SelectCountry country;
	private LoginPage login;
	private HomePage homepage;
	private CartPage cartpage;
	private CheckOutPage checkout;

	public POM_Manager(WebDriver driver2) {
		this.driver = driver2;

	}

	public SignUpPage get_Instance_Signup() {
		signup = new SignUpPage(driver);
		return signup;

	}

	public SelectCountry get_Instance_Country() {
		country = new SelectCountry(driver);
		return country;
	}

	public LoginPage get_Instance_Login() {
		login = new LoginPage(driver);
		return login;
	}

	public HomePage get_Instance_HomePage() {
		homepage = new HomePage(driver);
		return homepage;
	}

	public CartPage get_Instace_CartPage() {
		cartpage = new CartPage(driver);
		return cartpage;
	}

	public CheckOutPage get_Instance_Checkout() {
		checkout = new CheckOutPage(driver);
		return checkout;

	}
}
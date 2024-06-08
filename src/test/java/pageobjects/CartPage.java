package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends Base {
	public CartPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
    @FindBy(xpath ="// button[text()='Checkout']")
    WebElement check_Out;
    
	public WebElement checkOut() {
		return check_Out;
	}

}
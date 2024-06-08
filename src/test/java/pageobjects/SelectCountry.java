package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectCountry extends Base {

    public SelectCountry(WebDriver driver2) {
        this.driver = driver2;
        PageFactory.initElements(driver2, this);
    }

    @FindBy(xpath = "(//h4[text()='United States'])[1]")
    private WebElement countrySelection;

    public WebElement select_Country() {
        return countrySelection;
    }
}

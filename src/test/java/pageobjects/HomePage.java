package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Base {

	public HomePage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	 @FindBy(xpath = "//div[@id='gpt-shop-pushdown-ad-28974857']")
	    private WebElement accountName;

	    @FindBy(xpath = "//a[text()='Top Deals']")
	    private WebElement topDeal_Link;

	    @FindBy(xpath = "//a[text()='Deal of the Day']")
	    private WebElement dealOfTheDay_Link;

	    @FindBy(xpath = "//a[text()='Yes, Best Buy Sells That']")
	    private WebElement yesBestBuySellsThat_Link;

	    @FindBy(xpath = "(//a[text()='My Best Buy Memberships'])[1]")
	    private WebElement myBestBuyMemberships_Link;

	    @FindBy(xpath = "//a[text()='Credit Cards']")
	    private WebElement creditCards_Link;

	    @FindBy(xpath = "(//a[text()='Gift Cards'])[2]")
	    private WebElement giftCards_Link;

	    @FindBy(xpath = "(//a[text()='Gift Ideas'])")
	    private WebElement giftIdeas_Link;

	    @FindBy(xpath = "//a[text()='Accessibility']")
	    private WebElement accessibility_Link;

	    @FindBy(xpath = "//a[text()='Privacy']")
	    private WebElement privacy_Link;

	    @FindBy(xpath = "//a[text()='Terms & Conditions']")
	    private WebElement termsAndConditions_Link;

	    @FindBy(xpath = "//a[text()='Interest-Based Ads']")
	    private WebElement interestBasedAds_Link;

	    @FindBy(xpath = "//a[text()='Accessibility']")
	    private WebElement accessibility_Title;

	    @FindBy(xpath = "//a[text()='Terms & Conditions']")
	    private WebElement termsAndConditions_Title;

	    @FindBy(xpath = "//a[text()='Interest-Based Ads']")
	    private WebElement interestBasedAds_Title;

	    @FindBy(xpath = "//a[text()='Privacy']")
	    private WebElement privacy_Title;

	    @FindBy(id = "gh-search-input")
	    private WebElement search_Box;

	    @FindBy(className = "product-image")
	    private WebElement some_Product;

	    @FindBy(xpath = "(//button[text()='Add to Cart'])[1]")
	    private WebElement clickAddToCart_First;

	    @FindBy(xpath = "//span[text()='Add to Cart']")
	    private WebElement clickAddToCart_Second;

	    @FindBy(xpath = "//span[text()='Continue']")
	    private WebElement click_Continue;

	    @FindBy(xpath = "//span[text()='Go to Cart']")
	    private WebElement clickGoTo_Cart;

	    @FindBy(xpath = "//button[text()='Menu']")
	    private WebElement menu_Top;

	    @FindBy(xpath = "//button[text()='Appliances']")
	    private WebElement appliances_Deparment;

	    @FindBy(xpath = "//button[text()='Major Kitchen Appliances']")
	    private WebElement majorKitchen_Appliances;

	    @FindBy(xpath = "//a[text()='Refrigerators']")
	    private WebElement refrigerators_Menu;

	    @FindBy(xpath = "//a[text()='French Door Refrigerators']")
	    private WebElement frenchDoor_Refrigerators;

	    @FindBy(className = "product-image")
	    private WebElement select_Refrigerators;

	    @FindBy(xpath = "//span[text()='Cart']")
	    private WebElement clickTop_Cart;

	    @FindBy(xpath = "//button[text()='Brands']")
	    private WebElement brand_Menu;

	    @FindBy(xpath = "//a[text()='PlayStation']")
	    private WebElement playStation_Menu;

	    @FindBy(xpath = "//a[text()='PS5 Consoles']")
	    private WebElement ps5Consoles_Menu;

	    @FindBy(xpath = "//a[text()='Go to Cart']")
	    private WebElement instant_GoToCart;

	    // Getter methods
	    public WebElement getAccountName() {
	        return accountName;
	    }

	    public WebElement getTopDealLink() {
	        return topDeal_Link;
	    }

	    public WebElement getDealOfTheDayLink() {
	        return dealOfTheDay_Link;
	    }

	    public WebElement getYesBestBuySellsThatLink() {
	        return yesBestBuySellsThat_Link;
	    }

	    public WebElement getMyBestBuyMembershipsLink() {
	        return myBestBuyMemberships_Link;
	    }

	    public WebElement getCreditCardsLink() {
	        return creditCards_Link;
	    }

	    public WebElement getGiftCardsLink() {
	        return giftCards_Link;
	    }

	    public WebElement getGiftIdeasLink() {
	        return giftIdeas_Link;
	    }

	    public WebElement getAccessibilityLink() {
	        return accessibility_Link;
	    }

	    public WebElement getPrivacyLink() {
	        return privacy_Link;
	    }

	    public WebElement getTermsAndConditionsLink() {
	        return termsAndConditions_Link;
	    }

	    public WebElement getInterestBasedAdsLink() {
	        return interestBasedAds_Link;
	    }

	    public WebElement getAccessibilityTitle() {
	        return accessibility_Title;
	    }

	    public WebElement getTermsAndConditionsTitle() {
	        return termsAndConditions_Title;
	    }

	    public WebElement getInterestBasedAdsTitle() {
	        return interestBasedAds_Title;
	    }

	    public WebElement getPrivacyTitle() {
	        return privacy_Title;
	    }

	    public WebElement getSearchBox() {
	        return search_Box;
	    }

	    public WebElement getSomeProduct() {
	        return some_Product;
	    }

	    public WebElement getClickAddToCartFirst() {
	        return clickAddToCart_First;
	    }

	    public WebElement getClickAddToCartSecond() {
	        return clickAddToCart_Second;
	    }

	    public WebElement getClickContinue() {
	        return click_Continue;
	    }

	    public WebElement getClickGoToCart() {
	        return clickGoTo_Cart;
	    }

	    public WebElement getMenuTop() {
	        return menu_Top;
	    }

	    public WebElement getAppliancesDeparment() {
	        return appliances_Deparment;
	    }

	    public WebElement getMajorKitchenAppliances() {
	        return majorKitchen_Appliances;
	    }

	    public WebElement getRefrigeratorsMenu() {
	        return refrigerators_Menu;
	    }

	    public WebElement getFrenchDoorRefrigerators() {
	        return frenchDoor_Refrigerators;
	    }

	    public WebElement getSelectRefrigerators() {
	        return select_Refrigerators;
	    }

	    public WebElement getClickTopCart() {
	        return clickTop_Cart;
	    }

	    public WebElement getBrandMenu() {
	        return brand_Menu;
	    }

	    public WebElement getPlayStationMenu() {
	        return playStation_Menu;
	    }

	    public WebElement getPs5ConsolesMenu() {
	        return ps5Consoles_Menu;
	    }

	    public WebElement getInstantGoToCart() {
	        return instant_GoToCart;
	    }
}
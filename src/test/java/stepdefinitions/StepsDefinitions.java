package stepdefinitions;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobjects.Base;
import configuration.POM_Manager;
import cucumberoptions.TestRunnerJunit;
import io.cucumber.java.en.*;


public class StepsDefinitions extends Base {

	public static WebDriver driver = TestRunnerJunit.driver;

	POM_Manager pom = new POM_Manager(driver);

	// Sign up Functionality of BestBuy E-commerce Website

	@Given("User select the country")
	public void user_select_the_country() {
		clickOnElement(pom.get_Instance_Country().select_Country());
		System.out.println("User select the country");
	}

	@When("User click the account")
	public void user_click_the_account() {
		clickOnElement(pom.get_Instance_Signup().getAccount());
		System.out.println("User click the account");

	}

	@And("User click the create an account")
	public void user_click_the_create_an_account() {
		explicitVidibilityOfWait(pom.get_Instance_Signup().getCreateAccount(), 10);
		clickOnElement(pom.get_Instance_Signup().getCreateAccount());
		System.out.println("User click the create an account");
	}

	@And("User enter the firstname (.*)$")
	public void user_enter_the_firstname(String firstName) {
		inputValueElement(pom.get_Instance_Signup().getFirstName(), firstName);
		System.out.println("User enter the firstname");
	}

	@And("User enter the last name (.*)$")
	public void user_enter_the_last_name(String lastName) {
		inputValueElement(pom.get_Instance_Signup().getLastName(), lastName);
		System.out.println("User enter the last name");
	}

	@And("User enter the email address (.*)$")
	public void user_enter_the_email_address(String mailId) {
		inputValueElement(pom.get_Instance_Signup().getEmail(), mailId);
		System.out.println("User enter the email address");
	}

	@And("User enter the password (.*)$")
	public void user_enter_the_password(String password) { // User enter the mobile number
		inputValueElement(pom.get_Instance_Signup().getPassword(), password);
		System.out.println("User enter the password");
	}

	@And("User enter the confirm password (.*)$")
	public void user_enter_the_confirm_password(String confirmPassword) {
		inputValueElement(pom.get_Instance_Signup().getConfirmPassword(), confirmPassword);
		System.out.println("User enter the confirm password");
	}

	@And("User enter the mobile number (.*)$")
	public void user_enter_the_mobile_number(String mobileNumber) {
		inputValueElement(pom.get_Instance_Signup().getMobileNumber(), mobileNumber);
		System.out.println("User enter the mobile number");
	}

	@And("User click the submit")
	public void user_click_the_submit() {
		clickOnElement(pom.get_Instance_Signup().getSubmit());
		System.out.println("User click the submit");
	}
 
	@Then("User validate the create an account successfully or not (.*)$")
	public void user_validate_the_create_an_account_successfully_or_not(String firstName) throws IOException {
		try {
			WebElement accountName = pom.get_Instance_HomePage().getAccountName();
			String nameAccount = accountName.getText();
			String actualElement = nameAccount;
			String expectedElement = firstName;

		if (expectedElement.equalsIgnoreCase(actualElement)) {
			System.out.println("User account create successfully...! " + "User Name" + actualElement);
		} else {
			System.out.println("User account create not successful...? ");
		}
		getScreenshot(actualElement);
		closeBrowser();
		System.out.println("Browser closed");
		}
		catch(Exception e) {
			System.out.println("error occured");
			getScreenshot("signinpage");
			closeBrowser();
		}
		
	}

	// Sign in Functionality of BestBuy E-commerce Website
    
	@Given("First user select the country")
	public void user_select_the__country() {
		explicitVidibilityOfWait(pom.get_Instance_Country().select_Country(), 10);
		clickOnElement(pom.get_Instance_Country().select_Country());
		System.out.println("User select the country");
	}

	@When("First user click the  account")
	public void user_click_the__account() {
		clickOnElement(pom.get_Instance_Signup().getAccount());
		System.out.println("User click the account");

	}

	@And("First user click the signin")
	public void user_click_the_signin() {
		clickOnElement(pom.get_Instance_Login().getUsersignIn());
	}

	@And("First user enter the signin email address (.*)$")
	public void user_enter_the_signin_email_address(String mailid) {
		explicitVidibilityOfWait(pom.get_Instance_Login().getMailId(), 30);
		inputValueElement(pom.get_Instance_Login().getMailId(), mailid);
		
	}

	@And("First user enter the signin password (.*)$")
	public void user_enter_the_signin_password(String Password) {
		explicitVidibilityOfWait(pom.get_Instance_Login().getPassWord(), 30);
		inputValueElement(pom.get_Instance_Login().getPassWord(), Password);
	}

	@And("First user click the sign in")
	public void user_click_the_sign_in() {
		clickOnElement(pom.get_Instance_Login().getSubmitSignin());
	}

	@Then("First user validate homePage should be displayed (.*)$")
	public void user_validate_home_page_should_be_displayed(String firstName) throws IOException {
		try {
		WebElement accountName = pom.get_Instance_HomePage().getAccountName();
		String nameAccount = accountName.getText();
		String actualElement = nameAccount;
		String expectedElement = firstName;

		if (expectedElement.equalsIgnoreCase(actualElement)) {
			System.out.println("User sign in successfully...! " + "User Name" + actualElement);
		} else {
			System.out.println("User sign in not successful...? ");
		}
		getScreenshot(actualElement);
		closeBrowser();
		System.out.println("Browser closed");
		}
		catch(Exception e) {
			closeBrowser();
			System.out.println("error occured...........Browser closed");
		}

	}
	@Given("Second user select the country")
	public void second_user_select_the_country() {
		explicitVidibilityOfWait(pom.get_Instance_Country().select_Country(), 10);
		clickOnElement(pom.get_Instance_Country().select_Country());
		System.out.println("User select the country");
	}
	@When("Second user click the account")
	public void second_user_click_the_account() {
		clickOnElement(pom.get_Instance_Signup().getAccount());
		System.out.println("User click the account");
	}
	@When("Second user click the signin")
	public void second_user_click_the_signin() {
		clickOnElement(pom.get_Instance_Login().getUsersignIn());
	}
	@And("Second user enter the signin email address (.*)$")
	public void second_user_enter_the_signin_email_address(String invalidMailId) {
		explicitVidibilityOfWait(pom.get_Instance_Login().getMailId(), 30);
		inputValueElement(pom.get_Instance_Login().getMailId(), invalidMailId);
		
	}
	@And("Second user enter the signin password (.*)$")
	public void second_user_enter_the_signin_password(String password) {
		explicitVidibilityOfWait(pom.get_Instance_Login().getPassWord(), 30);
		inputValueElement(pom.get_Instance_Login().getPassWord(), password);
	}
	@When("Second user click the sign in")
	public void second_user_click_the_sign_in() {
		clickOnElement(pom.get_Instance_Login().getSubmitSignin());
	}
	@Then("Second user validate homePage should be displayed")
	public void second_user_validate_home_page_should_be_displayed(String firstName) throws IOException {
		WebElement accountName = pom.get_Instance_HomePage().getAccountName();
		String nameAccount = accountName.getText();
		String actualElement = nameAccount;
		String expectedElement = firstName;

		if (expectedElement.equalsIgnoreCase(actualElement)) {
			System.out.println("User sign in successfully...! " + "User Name" + actualElement);
		} else {
			System.out.println("User sign in not successful...? ");
		}
		getScreenshot("Invalidemail");
		closeBrowser();
		System.out.println("Browser closed");	
		}
	
	//Third User 
	@Given("Third user select the country")
	public void third_user_select_the_country() {
		explicitVidibilityOfWait(pom.get_Instance_Country().select_Country(), 10);
		clickOnElement(pom.get_Instance_Country().select_Country());
		System.out.println("User select the country");
	}
	@When("Third user click the account")
	public void third_user_click_the_account() {
		clickOnElement(pom.get_Instance_Signup().getAccount());
		System.out.println("User click the account");
	}
	@When("Third user click the signin")
	public void third_user_click_the_signin() {
		clickOnElement(pom.get_Instance_Login().getUsersignIn());
	}
	@And("Third user enter the signin email address (.*)$")
	public void third_user_enter_the_signin_email_address(String invalidMailId) {
		explicitVidibilityOfWait(pom.get_Instance_Login().getMailId(), 30);
		inputValueElement(pom.get_Instance_Login().getMailId(), invalidMailId);
		
	}
	@And("Third user enter the signin Invald password (.*)$")
	public void third_user_enter_the_signin_password(String InvalidPassword) {
		explicitVidibilityOfWait(pom.get_Instance_Login().getPassWord(), 30);
		inputValueElement(pom.get_Instance_Login().getPassWord(), InvalidPassword);
	}
	@When("Third user click the sign in")
	public void third_user_click_the_sign_in() {
		clickOnElement(pom.get_Instance_Login().getSubmitSignin());
	}
	@Then("Third user validate homePage should be displayed")
	public void third_user_validate_home_page_should_be_displayed(String firstName) throws IOException {
		WebElement accountName = pom.get_Instance_HomePage().getAccountName();
		String nameAccount = accountName.getText();
		String actualElement = nameAccount;
		String expectedElement = firstName;

		if (expectedElement.equalsIgnoreCase(actualElement)) {
			System.out.println("User sign in successfully...! " + "User Name" + actualElement);
		} else {
			System.out.println("User sign in not successful...? ");
		}
		getScreenshot("Invalidpassword");
		closeBrowser();
		System.out.println("Browser closed");	
		}
	
	@Given("Fourth user select the country")
	public void fourth_user_select_the_country() {
		explicitVidibilityOfWait(pom.get_Instance_Country().select_Country(), 10);
		clickOnElement(pom.get_Instance_Country().select_Country());
		System.out.println("User select the country");
	}
	@When("Fourth user click the account")
	public void fourth_user_click_the_account() {
		clickOnElement(pom.get_Instance_Signup().getAccount());
		System.out.println("User click the account");
	}
	@When("Fourth user click the signin")
	public void fourth_user_click_the_signin() {
		clickOnElement(pom.get_Instance_Login().getUsersignIn());
	}
	@And("Fourth user enter the signin email address (.*)$")
	public void fourth_user_enter_the_signin_email_address(String MailId) {
		explicitVidibilityOfWait(pom.get_Instance_Login().getMailId(), 30);
		inputValueElement(pom.get_Instance_Login().getMailId(), MailId);
		
	}
	@And("Fourth user enter the signin Invald password (.*)$")
	public void fourth_user_enter_the_signin_password(String InvalidPassword) {
		explicitVidibilityOfWait(pom.get_Instance_Login().getPassWord(), 30);
		inputValueElement(pom.get_Instance_Login().getPassWord(), InvalidPassword);
	}
	@When("Fourth user click the sign in")
	public void fourth_user_click_the_sign_in() {
		clickOnElement(pom.get_Instance_Login().getSubmitSignin());
	}
	@Then("Fourth user validate homePage should be displayed")
	public void fourth_user_validate_home_page_should_be_displayed(String firstName) throws IOException {
		WebElement accountName = pom.get_Instance_HomePage().getAccountName();
		String nameAccount = accountName.getText();
		String actualElement = nameAccount;
		String expectedElement = firstName;

		if (expectedElement.equalsIgnoreCase(actualElement)) {
			System.out.println("User sign in successfully...! " + "User Name" + actualElement);
		} else {
			System.out.println("User sign in not successful...? ");
		}
		getScreenshot(actualElement);
		closeBrowser();
		System.out.println("Browser closed");	
		}
	// Validate if URL link is broken

	@Given("Launch the URL")
	public void launch_the_url() {
		System.out.println("An URL has been launched");
	}

	@Then("Verify that the link is broken")
	public void verify_that_the_link_is_broken() throws MalformedURLException, IOException {

		// Get the URL of the Best Buy webpage
		String bestBuyURL = driver.getCurrentUrl();

		// Verify if the Best Buy URL is valid
		HttpURLConnection connection = (HttpURLConnection) new URL(bestBuyURL).openConnection();
		connection.setRequestMethod("HEAD");
		connection.connect();
		int responseCode = connection.getResponseCode();
		if (responseCode >= 400) {
			System.out.println("The Best Buy link is broken. Response code: " + responseCode);
		} else {
			System.out.println("The Best Buy link is valid. Response code: " + responseCode);
		}
		connection.disconnect();
		getScreenshot("URL_Verification");
		closeBrowser();
		System.out.println("Browser closed");
	}

// Navigation and title validation on Best Buy website
	@Given("Launch the URL link")
	public void launch_the_url_link() {
	    // Assuming you have some code to launch the URL
	    System.out.println("An URL has been launched");
	}

	@When("Navigate through each menu")
	public void navigate_through_each_menu() {
	    clickOnElement(pom.get_Instance_Country().select_Country());
	    System.out.println("Navigated through each menu");
	}

	@Then("Validate the title on each page")
	public void validate_the_title_on_each_page() {
	    System.out.println("Navigate to each link and validate");
	}

	@And("Validate the topdeal menu")
	public void validate_the_topdeal_menu() {
	    clickOnElement(pom.get_Instance_HomePage().getTopDealLink());
	    String pageTitle = driver.getTitle();
	    System.out.println("Title of page: " + pageTitle);

	    if (pageTitle.equals("Top Deals and Featured Offers on Electronics - Best Buy")) {
	        System.out.println("Title validation passed for page.");
	        getScreenshot("topdealmenu");
	    } else {
	        System.out.println("Title validation failed for page.");
	    }
	    backward();
	}

	@And("Validate the dealoftheday menu")
	public void validate_the_dealoftheday_menu() {
	    clickOnElement(pom.get_Instance_HomePage().getDealOfTheDayLink());
	    String pageTitle = driver.getTitle();
	    System.out.println("Title of page: " + pageTitle);

	    if (pageTitle.equals("Deal of the Day: Electronics Deals - Best Buy")) {
	        System.out.println("Title validation passed for page.");
	        getScreenshot("dealoftheday");
	    } else {
	        System.out.println("Title validation failed for page.");
	    }
	    backward();
	}

	@And("Validate the yesbestbuysellsthat menu")
	public void validate_the_yesbestbuysellsthat_menu() {
	    clickOnElement(pom.get_Instance_HomePage().getYesBestBuySellsThatLink());
	    String pageTitle = driver.getTitle();
	    System.out.println("Title of page: " + pageTitle);

	    if (pageTitle.equals("Yes, Best Buy Sells That – Best Buy")) {
	        System.out.println("Title validation passed for page.");
	        getScreenshot("yesbestbuysellsthat");
	    } else {
	        System.out.println("Title validation failed for page.");
	    }
	    backward();
	}

	@And("Validate the mybestbuymemberships menu")
	public void validate_the_mybestbuymemberships_menu() {
	    clickOnElement(pom.get_Instance_HomePage().getMyBestBuyMembershipsLink());
	    String pageTitle = driver.getTitle();
	    System.out.println("Title of page: " + pageTitle);

	    if (pageTitle.equals("My Best Buy Memberships")) {
	        System.out.println("Title validation passed for page.");
	        getScreenshot("mybestbuymemberships");
	    } else {
	        System.out.println("Title validation failed for page.");
	    }
	    backward();
	}

	@And("Validate the creditcard menu")
	public void validate_the_creditcard_menu() {
	    clickOnElement(pom.get_Instance_HomePage().getCreditCardsLink());
	    String pageTitle = driver.getTitle();
	    System.out.println("Title of page: " + pageTitle);

	    if (pageTitle.equals("Best Buy Credit Card: Rewards & Financing")) {
	        System.out.println("Title validation passed for page.");
	        getScreenshot("creditcard_menu");
	    } else {
	        System.out.println("Title validation failed for page.");
	    }
	    backward();
	}

	@And("Validate the moregiftcards menu")
	public void validate_the_moregiftcards_menu() {
	    clickOnElement(pom.get_Instance_HomePage().getCreditCardsLink());
	    String pageTitle = driver.getTitle();
	    System.out.println("Title of page: " + pageTitle);

	    if (pageTitle.equals("Gifts Cards and E-Gift Cards - Best Buy")) {
	        System.out.println("Title validation passed for page.");
	        getScreenshot("moregiftcards_menu");
	    } else {
	        System.out.println("Title validation failed for page.");
	    }
	    backward();
	}

	@And("Validate the moregiftideas menu")
	public void validate_the_moregiftideas_menu() {
	    implicit_Wait();
	    clickOnElement(pom.get_Instance_HomePage().getGiftIdeasLink());
	    String pageTitle = driver.getTitle();
	    System.out.println("Title of page: " + pageTitle);

	    if (pageTitle.equals("Gift Ideas 2024: Best Gifts to Give This Year - Best Buy")) {
	        System.out.println("Title validation passed for page.");
	        getScreenshot("moregiftideas_menu");
	    } else {
	        System.out.println("Title validation failed for page.");
	    }
	    closeBrowser();
	    System.out.println("Browser closed");
	}

	// Verify the presence of important bottom links

	@Given("Launch the URL for bottom link")
	public void launch_the_url_for_bottom_link() {
	    System.out.println("An URL has been launched");
	    clickOnElement(pom.get_Instance_Country().select_Country());
	}

	@When("Navigate the bottom link")
	public void navigate_the_bottom_link() {
		// Create JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Scroll down the page
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    moveToElement(pom.get_Instance_HomePage().getAccessibilityLink());
	    System.out.println("Navigated to the bottom link");
	    getScreenshot("bottompage");
	}

	@Then("Validate the accessibility link")
	public void validate_the_accessibility_link() {
	    clickOnElement(pom.get_Instance_HomePage().getAccessibilityLink());
	    String titleLink = pom.get_Instance_HomePage().getAccessibilityTitle().getText();
	    System.out.println("Title of text: " + titleLink);
	    if (titleLink.equals("Accessibility")) {
	        System.out.println("Link validation passed for page.");
	        getScreenshot("accessibility_link");
	    } else {
	        System.out.println("Link validation failed for page.");
	    }
	    backward();
	}

	@And("Validate the terms&conditions link")
	public void validate_the_terms_conditions_link() {
	    //moveToElement(pom.get_Instance_HomePage().getTermsAndConditionsLink());
	    clickOnElement(pom.get_Instance_HomePage().getTermsAndConditionsLink());
	    String titleLink = pom.get_Instance_HomePage().getTermsAndConditionsTitle().getText();
	    System.out.println("Title of text: " + titleLink);

	    if (titleLink.equals("Terms and Conditions")) {
	        System.out.println("Link validation passed for page.");
	        getScreenshot("terms&conditions_link");
	    } else {
	        System.out.println("Link validation failed for page.");
	    }
	    backward();
	}

	@And("Validate the privacy link")
	public void validate_the_privacy_link() {
	    //moveToElement(pom.get_Instance_HomePage().getPrivacyLink());
	    clickOnElement(pom.get_Instance_HomePage().getPrivacyLink());
	    String titleLink = pom.get_Instance_HomePage().getPrivacyTitle().getText();
	    System.out.println("Title of text: " + titleLink);

	    if (titleLink.equals("Best Buy Privacy Hub")) {
	        System.out.println("Link validation passed for page.");
	        getScreenshot("privacy_link");
	    } else {
	        System.out.println("Link validation failed for page.");
	    }
	    backward();
	}

	@And("Validate the interestbasedads link")
	public void validate_the_interestbasedads_link() {
	    moveToElement(pom.get_Instance_HomePage().getInterestBasedAdsLink());
	    clickOnElement(pom.get_Instance_HomePage().getInterestBasedAdsLink());
	    String titleLink = pom.get_Instance_HomePage().getInterestBasedAdsTitle().getText();
	    System.out.println("Title of text: " + titleLink);

	    if (titleLink.equals("Interest-Based Ads")) {
	        System.out.println("Link validation passed for page.");
	        getScreenshot("interestbasedads_link");
	    } else {
	        System.out.println("Link validation failed for page.");
	    }
	}


	// Search for and add an item to the shopping cart

	@Given("Launch the URL for search")
	public void launch_the_url_for_search() {
	        System.out.println("An URL has been launched");
	        clickOnElement(pom.get_Instance_Country().select_Country());
	}

	@When("Navigate the search")
	public void navigate_the_search() {
	        clickOnElement(pom.get_Instance_HomePage().getSearchBox());
	        System.out.println("Navigated the search box");
	}

	@And("Enter the product name and search")
	public void enter_the_product_name_and_search() throws AWTException {
	        inputValueElement(pom.get_Instance_HomePage().getSearchBox(), "mobile");
	        robotClass().keyPress(KeyEvent.VK_ENTER);
	        robotClass().keyRelease(KeyEvent.VK_ENTER);
	        System.out.println("Entered product name and searched");
	   
	}

	@And("Select the product and add to cart")
	public void select_the_product_and_add_to_cart() {
	    try {
	        clickOnElement(pom.get_Instance_HomePage().getSomeProduct());
	        clickOnElement(pom.get_Instance_HomePage().getClickAddToCartFirst());
	        clickOnElement(pom.get_Instance_HomePage().getClickAddToCartSecond());
	        clickOnElement(pom.get_Instance_HomePage().getClickGoToCart());
	        System.out.println("Product selected and added to cart");
	    } catch (Exception e) {
	        System.out.println("things added successfully");
	    }
	}

	@Then("Validate the add-on product in the shopping cart")
	public void validate_the_add_on_product_in_shopping_cart() {
	    try {
	        String checkOut = pom.get_Instace_CartPage().checkOut().getText();
	        System.out.println("Title of text: " + checkOut);
	        getScreenshot("shopping_cart");
	        // Validate the title of the page
	        if (checkOut.equals("Checkout")) {
	            System.out.println("Product added to cart successfully.");
	        } else {
	            System.out.println("Product added to cart not successfully.");
	        }
	    } catch (Exception e) {
	        System.out.println("Product added to cart successfully");
	    }
	}

	// selects and adds an item from Shop by Department menu

	@Given("Launch the URL for shop by department")
	public void launch_the_url_for_shop_by_department() {
		System.out.println("An URL has been launched");
		clickOnElement(pom.get_Instance_Country().select_Country());
	}

	@When("Click the shop by department menu")
	public void click_the_shop_by_department_menu() {
		clickOnElement(pom.get_Instance_HomePage().getMenuTop());
		System.out.println("clicked the top menu");

	}

	@And("Select the item from shop by department")
	public void select_the_item_from_shop_by_department() {
		clickOnElement(pom.get_Instance_HomePage().getAppliancesDeparment());
		clickOnElement(pom.get_Instance_HomePage().getMajorKitchenAppliances());
		clickOnElement(pom.get_Instance_HomePage().getRefrigeratorsMenu());
		//moveToElement(pom.get_Instance_HomePage().getFrenchDoorRefrigerators());
		clickOnElement(pom.get_Instance_HomePage().getFrenchDoorRefrigerators());
		//moveToElement(pom.get_Instance_HomePage().getClickAddToCartFirst());
		clickOnElement(pom.get_Instance_HomePage().getClickAddToCartFirst());
		System.out.println("Item selected from shop by department");
	}

	@Then("Validate the add on product in shopping cart from shop by department")
	public void validate_the_add_on_product_in_shopping_cart_from_shop_by_department() {
		clickOnElement(pom.get_Instance_HomePage().getClickTopCart());
		String checkOut = pom.get_Instace_CartPage().checkOut().getText();
		System.out.println("Title of text: " + checkOut);

		// Validate the title of the page
		if (checkOut.equals("Checkout")) {
			System.out.println("Product added to cart successfully.");
			getScreenshot("search_by_department");
		} else {
			System.out.println("Product added to cart not successfully.");
		}

	}

	// Select and add an item from Menu to Brands

	@Given("Launch the URL for brands")
	public void launch_the_url_for_brands() {
		System.out.println("An URL has been launched");
		clickOnElement(pom.get_Instance_Country().select_Country());
	}

	@When("Navigate the shop by brands menu")
	public void navigate_the_shop_by_brands_menu() {
		clickOnElement(pom.get_Instance_HomePage().getMenuTop());
		clickOnElement(pom.get_Instance_HomePage().getBrandMenu());
		System.out.println("Navigated the bran menu");
		getScreenshot("shop by Brands");
	}

	@When("Select the brand and add on item to cart")
	public void select_the_brand_and_add_on_item_to_cart() {
		clickOnElement(pom.get_Instance_HomePage().getPlayStationMenu());
		//moveToElement(pom.get_Instance_HomePage().getPs5ConsolesMenu());
		clickOnElement(pom.get_Instance_HomePage().getPs5ConsolesMenu());
		//moveToElement(pom.get_Instance_HomePage().getClickAddToCartFirst());
		clickOnElement(pom.get_Instance_HomePage().getClickAddToCartFirst());
		System.out.println("Item added to cart");
		getScreenshot("shop by Brands");
	}

	@Then("Validate the add on item in shopping cart")
	public void validate_the_add_on_item_in_shopping_cart() {
		clickOnElement(pom.get_Instance_HomePage().getInstantGoToCart());
		String checkOut = pom.get_Instace_CartPage().checkOut().getText();
		System.out.println("Title of text: " + checkOut);

		// Validate the title of the page
		if (checkOut.equals("Checkout")) {
			System.out.println("Product added to cart successfully.");
			getScreenshot("shop by Brands");
		} else {
			System.out.println("Product added to cart not successfully.");
		}
	}

	// Navigate to the checkout page and fill out the form with dummy payment

	@Given("Launch the URL for checkout")
	public void launch_the_url_for_checkout() {
		System.out.println("An URL has been launched");
		clickOnElement(pom.get_Instance_Country().select_Country());
	}

	@When("Add item to shopping cart")
	public void add_item_to_shopping_cart() {
		clickOnElement(pom.get_Instance_HomePage().getMenuTop());
		clickOnElement(pom.get_Instance_HomePage().getBrandMenu());
		System.out.println("Navigated the brand menu");
		clickOnElement(pom.get_Instance_HomePage().getPlayStationMenu());
		//moveToElement(pom.get_Instance_HomePage().getPs5ConsolesMenu());
		clickOnElement(pom.get_Instance_HomePage().getPs5ConsolesMenu());
		//moveToElement(pom.get_Instance_HomePage().getClickAddToCartFirst());
		clickOnElement(pom.get_Instance_HomePage().getClickAddToCartFirst());
		System.out.println("Item added to cart");
	}

	@And("Go to checkout page")
	public void go_to_checkout_page() {
		clickOnElement(pom.get_Instance_HomePage().getInstantGoToCart());
		System.out.println("checked in checkout page");
		clickOnElement(pom.get_Instace_CartPage().checkOut());
		clickOnElement(pom.get_Instance_Login().getContinueAsGuest());
	}

	@And("Fil the Contact information {string}  {string}")
	public void fil_the_contact_information(String mailId, String mobileNumber) {
		moveToElement(pom.get_Instance_Checkout().getContactInfoEmailId());
		inputValueElement(pom.get_Instance_Checkout().getContactInfoEmailId(), mailId);
		inputValueElement(pom.get_Instance_Checkout().getContactInfoMobileNumber(), mobileNumber);
		clickOnElement(pom.get_Instance_Checkout().getContinueToPaymentInformation());

	}

	@And("Fill the payment imformation  {string}  {string}  {string}  {string}  {string}  {string}  {string}")
	public void fill_the_payment_imformation(String cardNumber, String firstName, String lastName, String address,
			String city, String state, String zipcode) {
		inputValueElement(pom.get_Instance_Checkout().getCreditCardAndDebitCardNumber(), cardNumber);
		//moveToElement(pom.get_Instance_Checkout().getFirstNameForBilling());
		inputValueElement(pom.get_Instance_Checkout().getFirstNameForBilling(), firstName);
		inputValueElement(pom.get_Instance_Checkout().getLastNameForBilling(), lastName);
		inputValueElement(pom.get_Instance_Checkout().getAddressForBilling(), address);
		inputValueElement(pom.get_Instance_Checkout().getCityForBilling(), city);
		clickOnElement(pom.get_Instance_Checkout().getStateForBilling());
		selection("byValue", state);
		inputValueElement(pom.get_Instance_Checkout().getZipcodeForBilling(), zipcode);
		clickOnElement(pom.get_Instance_Checkout().getPlaceYourOrder());

	}

	@Then("Validate the order confirmation message (.*)$")
	public void Validate_the_order_confirmation_message(String firstName) {
		moveToElement(pom.get_Instance_Checkout().getPlaceYourOrder());
		String info = pom.get_Instance_Checkout().getFirstNameForBilling().getText();
		System.out.println("Title of text: " + info);

		// Validate the title of the page
		if (info.equals(firstName)) {
			System.out.println("Payment information filled successfully.");
			getScreenshot("checkoutpage");
		} else {
			System.out.println("Payment information filled not successfull");
		}
	}

}

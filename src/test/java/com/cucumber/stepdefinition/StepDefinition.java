package com.cucumber.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.cucumber.runner.TestRunner;
import com.selenium.automationwebsite.pom.LoginFunctionalitypom;
import com.selenium.automationwebsite.pom.SearchFunctionality;
import com.selenium.baseclass.BaseclassMaven;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseclassMaven {
	public static WebDriver driver = TestRunner.driver;
	@Given("^User launch the automation practice application$")
	public void user_launch_the_automation_practice_application() throws Throwable {
		geturl("http://automationpractice.com/index.php");
		
	}

	@When("^User click on the Signin button in the header$")
	public void user_click_on_the_Signin_button_in_the_header() throws Throwable {
		LoginFunctionalitypom lp = new LoginFunctionalitypom(driver);
		clickOnTheElement(lp.getSigninbtn());
	}

	@When("^User enter the email address in the authentication page$")
	public void user_enter_the_email_address_in_the_authentication_page() throws Throwable {
		LoginFunctionalitypom lp = new LoginFunctionalitypom(driver);
		inPutValuesToTheElement(lp.getEmailid(), "anitha.popuri@gmail.com");
	}

	@When("^User enter the password in the authentication page$")
	public void user_enter_the_password_in_the_authentication_page() throws Throwable {
		LoginFunctionalitypom lp = new LoginFunctionalitypom(driver);
		inPutValuesToTheElement(lp.getPassword(), "dummy");
	}

	@When("^User click on the signIn button$")
	public void user_click_on_the_signIn_button() throws Throwable {
		LoginFunctionalitypom lp = new LoginFunctionalitypom(driver);
		clickOnTheElement(lp.getLogin());
	}

	@Then("^User verify the username in the header$")
	public void user_verify_the_username_in_the_header() throws Throwable {
		LoginFunctionalitypom lp = new LoginFunctionalitypom(driver);
		Assert.assertEquals("MY ACCOUNT",getTextofTheElement(lp.getMyaccount()));
		
	}

	@When("^User enter product name in the search feild$")
	public void user_enter_product_name_in_the_search_feild() throws Throwable {
		SearchFunctionality sf = new SearchFunctionality(driver);
		inPutValuesToTheElement(sf.getSearchbar(), "dresses");
		
		
	}

	@When("^User click on the search button$")
	public void user_click_on_the_search_button() throws Throwable {
		SearchFunctionality sf = new SearchFunctionality(driver);
	   clickOnTheElement(sf.getClicksearch());
	}

	@Then("^User verify the search result in the search header$")
	public void user_verify_the_search_result_in_the_search_header() throws Throwable {
		//SearchFunctionality sf = new SearchFunctionality(driver);
		}

	@When("^User clicks on the particular product$")
	public void user_clicks_on_the_particular_product() throws Throwable {
		SearchFunctionality sf = new SearchFunctionality(driver);
		mouseHoverOnTheElement(sf.getDressMouseHover());
		
	}

	@When("^user selects the addto cart product$")
	public void user_selects_the_addto_cart_product() throws Throwable {
		SearchFunctionality sf = new SearchFunctionality(driver);
		clickOnTheElement(sf.getAddtocart());
	   
	}

	@Then("^verify whether the product is added to the cart or not$")
	public void verify_whether_the_product_is_added_to_the_cart_or_not() throws Throwable {
		//SearchFunctionality sf = new SearchFunctionality(driver);
		//Assert.assertEquals("Printed Summer Dress", getTextofTheElement(sf.getAddtocartpageheader()));
	}
	@When("^user clicks on the proceed to checkout$")
	public void user_clicks_on_the_proceed_to_checkout() throws Throwable {
		SearchFunctionality sf = new SearchFunctionality(driver);
		clickOnTheElement(sf.getProceedtocheckout());
	}

	@Then("^verify whether checkout is getting proceed to next page$")
	public void verify_whether_checkout_is_getting_proceed_to_next_page() throws Throwable {
		//SearchFunctionality sf = new SearchFunctionality(driver);
		//Assert.assertEquals("SHOPPING-CART SUMMARY", getTextofTheElement(sf.getAddtocartpageheader()));
	}
	

@When("^user click on the proceed to checkout button$")
public void user_click_on_the_proceed_to_checkout_button() throws Throwable {
	SearchFunctionality sf = new SearchFunctionality(driver);
	clickOnTheElement(sf.getCheckoutsummarybtn());

}

@Then("^verify the user can be able to proceed to addresspage$")
public void verify_the_user_can_be_able_to_proceed_to_addresspage() throws Throwable {
	SearchFunctionality sf = new SearchFunctionality(driver);
	Assert.assertEquals("ADDRESSES", getTextofTheElement(sf.getAddressheader()));
   
}

@When("^user clicks on the proceed to checkout button$")
public void user_clicks_on_the_proceed_to_checkout_button() throws Throwable {
	SearchFunctionality sf = new SearchFunctionality(driver);
	clickOnTheElement(sf.getCheckoutaddressbtn());
}

@Then("^verify whether the user is getting navigated from address to shiffing page$")
public void verify_whether_the_user_is_getting_navigated_from_address_to_shiffing_page() throws Throwable {
	SearchFunctionality sf = new SearchFunctionality(driver);
	Assert.assertEquals("SHIPPING", getTextofTheElement(sf.getShippingheader()));
	}
@When("^user clicks on the  terms and conditions checkbox$")
public void user_clicks_on_the_terms_and_conditions_checkbox() throws Throwable {
	SearchFunctionality sf = new SearchFunctionality(driver);
	clickOnTheElement(sf.getTermsandconditionscheckbox());
}


@When("^clicks on the proceed to checkout button$")
public void clicks_on_the_proceed_to_checkout_button() throws Throwable {
	SearchFunctionality sf = new SearchFunctionality(driver);
	clickOnTheElement(sf.getShippingproceedbtn());
}

@Then("^verify whether the user is getting navigated from shipping page to Payment page$")
public void verify_whether_the_user_is_getting_navigated_from_shipping_page_to_Payment_page() throws Throwable {
	SearchFunctionality sf = new SearchFunctionality(driver);
	Assert.assertEquals("PLEASE CHOOSE YOUR PAYMENT METHOD", getTextofTheElement(sf.getPaymentheaderheader()));
}
@When("^the user clicks on the paybycheck button$")
public void the_user_clicks_on_the_paybycheck_button() throws Throwable {
	SearchFunctionality sf = new SearchFunctionality(driver);
	clickOnTheElement(sf.getPaybycheckclick());
	
}

@Then("^verify whether user is able to make the payment and proceed to next page$")
public void verify_whether_user_is_able_to_make_the_payment_and_proceed_to_next_page() throws Throwable {
	SearchFunctionality sf = new SearchFunctionality(driver);
	Assert.assertEquals("ORDER SUMMARY", getTextofTheElement(sf.getOrdersummaryheader()));
}
@When("^the useer clicks on proceed to checkout$")
public void the_useer_clicks_on_proceed_to_checkout() throws Throwable {
	SearchFunctionality sf = new SearchFunctionality(driver);
	clickOnTheElement(sf.getConfirmorderbtn());
}

@Then("^Verify whether user is able to proceed to checkout$")
public void verify_whether_user_is_able_to_proceed_to_checkout() throws Throwable {
	SearchFunctionality sf = new SearchFunctionality(driver);
	Assert.assertEquals("ORDER CONFIRMATION", getTextofTheElement(sf.getOrderconfirmationheader()));
}
@When("^the user clicks on the signout button$")
public void the_user_clicks_on_the_signout_button() throws Throwable {
	SearchFunctionality sf = new SearchFunctionality(driver);
	clickOnTheElement(sf.getLogoutbtn());
}

@Then("^verify whether the user is able to logout and navigate to authentication page$")
public void verify_whether_the_user_is_able_to_logout_and_navigate_to_authentication_page() throws Throwable {
	SearchFunctionality sf = new SearchFunctionality(driver);
	Assert.assertEquals("AUTHENTICATION", getTextofTheElement(sf.getAuthticationpageheader()));
}
	
	
	
}

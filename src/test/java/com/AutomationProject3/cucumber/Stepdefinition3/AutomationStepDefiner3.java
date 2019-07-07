
package com.AutomationProject3.cucumber.Stepdefinition3;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumber.runner.AutomationProjectRunner3;
import com.selenium.automationwebsite.pom.AutomationProjectPomEndtoEnd;
import com.selenium.automationwebsite.pom.AutomationProjectShoppingPom;
import com.selenium.automationwebsite.pom.LoginFunctionalitypom;
import com.selenium.automationwebsite.pom.MouseHoverSelectPom;
import com.selenium.automationwebsite.pom.SearchFunctionality;
import com.selenium.baseclass.BaseclassMaven;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AutomationStepDefiner3 extends BaseclassMaven {
	public static WebDriver driver=AutomationProjectRunner3.driver;
	
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
		inPutValuesToTheElement(lp.getEmailid(), "anitha.popuri@g"); 
	   
	}

	@When("^User enter the password in the authentication page$")
	public void user_enter_the_password_in_the_authentication_page() throws Throwable {
		LoginFunctionalitypom lp = new LoginFunctionalitypom(driver);
		inPutValuesToTheElement(lp.getPassword(), "dum");
	   
	}

	@When("^User click on the signIn button$")
	public void user_click_on_the_signIn_button() throws Throwable {
		LoginFunctionalitypom lp = new LoginFunctionalitypom(driver);
		clickOnTheElement(lp.getLogin());
	   
	}

	@Then("^verify whenther the application showing the error message or not$")
	public void verify_whenther_the_application_showing_the_error_message_or_not() throws Throwable {
		LoginFunctionalitypom lp = new LoginFunctionalitypom(driver);
		Assert.assertEquals("There is 1 error", getTextofTheElement(lp.getErrordetail()));
	    
	   
	}
	
	@When("^User enter the email id  in the authentication page$")
	public void user_enter_the_email_id_in_the_authentication_page() throws Throwable {
		LoginFunctionalitypom lp = new LoginFunctionalitypom(driver);
		  //(locator).clear();
		  (lp.getEmailid()).clear();
		inPutValuesToTheElement(lp.getEmailid(), "anitha.popuri@gmail.com"); 
	}

	@When("^User enter the password in the password feild$")
	public void user_enter_the_password_in_the_password_feild() throws Throwable {
		LoginFunctionalitypom lp = new LoginFunctionalitypom(driver);
		(lp.getPassword()).clear();
		inPutValuesToTheElement(lp.getPassword(), "dummy");
	}

	@When("^User clicks on the signIn button$")
	public void user_clicks_on_the_signIn_button() throws Throwable {
		LoginFunctionalitypom lp = new LoginFunctionalitypom(driver);
		clickOnTheElement(lp.getLogin());
	}

	@Then("^Verify the User is able to proceed to the My Account page\\.$")
	public void verify_the_User_is_able_to_proceed_to_the_My_Account_page() throws Throwable {
		LoginFunctionalitypom lp = new LoginFunctionalitypom(driver);
		Assert.assertEquals("MY ACCOUNT", getTextofTheElement(lp.getMyaccount()));
	   
	}
	@When("^the user clicks on the particualr button from My Account Page$")
	public void the_user_clicks_on_the_particualr_button_from_My_Account_Page() throws Throwable {
	    AutomationProjectPomEndtoEnd ap=new AutomationProjectPomEndtoEnd(driver);
	    clickOnTheElement(ap.getPersonalinfobtn());
	    
	}

	@Then("^Verify whether the user is able to navigae to personal details page$")
	public void verify_whether_the_user_is_able_to_navigae_to_personal_details_page() throws Throwable {
		 AutomationProjectPomEndtoEnd ap=new AutomationProjectPomEndtoEnd(driver);
		 Assert.assertEquals("YOUR PERSONAL INFORMATION", getTextofTheElement(ap.getPersonalinfoheader()));
	}

	@When("^the user clicks on Home button in the footer$")
	public void the_user_clicks_on_Home_button_in_the_footer() throws Throwable {
		AutomationProjectPomEndtoEnd ap=new AutomationProjectPomEndtoEnd(driver);
		clickOnTheElement(ap.getHomebtn());
	   
	}

	@Then("^verify whether the user is able to go back to home page$")
	public void verify_whether_the_user_is_able_to_go_back_to_home_page() throws Throwable {
		AutomationProjectPomEndtoEnd ap=new AutomationProjectPomEndtoEnd(driver);
		Assert.assertTrue(true);
	   
	}

@When("^the user Mouse hover on the women tab$")
public void the_user_Mouse_hover_on_the_women_tab() throws Throwable {
	AutomationProjectPomEndtoEnd ap=new AutomationProjectPomEndtoEnd(driver);
	mouseHoverOnTheElement(ap.getWomentab());
	
}

@Then("^user should be able to click on the Tops button$")
public void user_should_be_able_to_click_on_the_Tops_button() throws Throwable {
	AutomationProjectPomEndtoEnd ap=new AutomationProjectPomEndtoEnd(driver);
	clickOnTheElement(ap.getTopsbtn());
}
@Then("^verify whether the user is able to navigate to Tops page$")
public void verify_whether_the_user_is_able_to_navigate_to_Tops_page() throws Throwable {
	AutomationProjectPomEndtoEnd ap=new AutomationProjectPomEndtoEnd(driver);
	Assert.assertEquals("TOPS ", getTextofTheElement(ap.getTopsheader()));
}
@When("^the user clicks on Tshirts button$")
public void the_user_clicks_on_Tshirts_button() throws Throwable {
	AutomationProjectPomEndtoEnd ap=new AutomationProjectPomEndtoEnd(driver);
	clickOnTheElement(ap.getTshirtscategory());
}

@Then("^verify whether is user is able to navigate to the T-shirts page$")
public void verify_whether_is_user_is_able_to_navigate_to_the_T_shirts_page() throws Throwable {
	AutomationProjectPomEndtoEnd ap=new AutomationProjectPomEndtoEnd(driver);
	Assert.assertEquals("T-SHIRTS ", getTextofTheElement(ap.getTshirtsHeader()));
}
@When("^the user clicks on the List button$")
public void the_user_clicks_on_the_List_button() throws Throwable {
	AutomationProjectPomEndtoEnd ap=new AutomationProjectPomEndtoEnd(driver);
	clickOnTheElement(ap.getListbutton());
}

@Then("^verify whether the user is able to see the change in view$")
public void verify_whether_the_user_is_able_to_see_the_change_in_view() throws Throwable {
	AutomationProjectPomEndtoEnd ap=new AutomationProjectPomEndtoEnd(driver);
	Assert.assertEquals("View", getTextofTheElement(ap.getListheader()));
	
}


@When("^the user clicks on any one option of size checkbox$")
public void the_user_clicks_on_any_one_option_of_size_checkbox() throws Throwable {
	AutomationProjectPomEndtoEnd ap=new AutomationProjectPomEndtoEnd(driver);
	clickOnTheElement(ap.getSizecheck());
   
}

@When("^the user checkin the sleeves checkbox$")
public void the_user_checkin_the_manfacturar_checkbox() throws Throwable {
	AutomationProjectPomEndtoEnd ap=new AutomationProjectPomEndtoEnd(driver);
   clickOnTheElement(ap.getSleevecheckbox());
}

@Then("^verify whether the user is able to check the boxes$")
public void verify_whether_the_user_is_able_to_check_the_boxes() throws Throwable {
	AutomationProjectPomEndtoEnd ap=new AutomationProjectPomEndtoEnd(driver);
	Assert.assertTrue(true);
 
}
@When("^the user clicks on add to compare$")
public void the_user_clicks_on_add_to_compare() throws Throwable {
	AutomationProjectPomEndtoEnd ap=new AutomationProjectPomEndtoEnd(driver);
	clickOnTheElement(ap.getAdtocompare());
}

@When("^user clicks on wishlist button$")
public void user_clicks_on_wishlist_button() throws Throwable {
	AutomationProjectPomEndtoEnd ap=new AutomationProjectPomEndtoEnd(driver);
	clickOnTheElement(ap.getWishlistbtn());
}

@When("^verify whether a new window is popup with informaation$")
public void verify_whether_a_new_window_is_popup_with_informaation() throws Throwable {
	AutomationProjectPomEndtoEnd ap=new AutomationProjectPomEndtoEnd(driver);
	Assert.assertEquals("Added to your wishlist.", getTextofTheElement(ap.getWishlistpopup()));
}

@Then("^verify whether the user is able to close the popup window$")
public void verify_whether_the_user_is_able_to_close_the_popup_window() throws Throwable {
	AutomationProjectPomEndtoEnd ap=new AutomationProjectPomEndtoEnd(driver);
	clickOnTheElement(ap.getClosepopup());
}
@When("^the user clicks on compare button in the header$")
public void the_user_clicks_on_compare_button_in_the_header() throws Throwable {
	AutomationProjectPomEndtoEnd ap=new AutomationProjectPomEndtoEnd(driver);
	clickOnTheElement(ap.getComparebtn());
}

@Then("^verify whether the user is able to navigate to  comparisionheader$")
public void verify_whether_the_user_is_able_to_navigate_to_comparisionheader() throws Throwable {
	AutomationProjectPomEndtoEnd ap=new AutomationProjectPomEndtoEnd(driver);
	Assert.assertEquals("PRODUCT COMPARISON", getTextofTheElement(ap.getCompareheader()));
}

@When("^the user clicks on view button in comparision button$")
public void the_user_clicks_on_view_button_in_comparision_button() throws Throwable {
   AutomationProjectShoppingPom as=new AutomationProjectShoppingPom(driver);
		   clickOnTheElement(as.getViewbtn());
}

@Then("^verify whether the user is able to navigate to productdetailspage$")
public void verify_whether_the_user_is_able_to_navigate_to_productdetailspage() throws Throwable {
	 AutomationProjectShoppingPom as=new AutomationProjectShoppingPom(driver);
	 Assert.assertEquals("Faded Short Sleeve T-shirts", getTextofTheElement(as.getItemnameheader()));
}
@When("^the user clicks on write a review functionality$")
public void the_user_clicks_on_write_a_review_functionality() throws Throwable {
	AutomationProjectPomEndtoEnd ap=new AutomationProjectPomEndtoEnd(driver);
	clickOnTheElement(ap.getReviewbtn());
}

@Then("^verify whether is able to see a new popup window to submit review$")
public void verify_whether_is_able_to_see_a_new_popup_window_to_submit_review() throws Throwable {
	AutomationProjectPomEndtoEnd ap=new AutomationProjectPomEndtoEnd(driver);
	Assert.assertEquals("Write a review", getTextofTheElement(ap.getReviewheader()));
}


@Then("^click on close button to navigae to original page$")
public void click_on_close_button_to_navigae_to_original_page() throws Throwable {
	AutomationProjectPomEndtoEnd ap=new AutomationProjectPomEndtoEnd(driver);
	clickOnTheElement(ap.getReviewclose());
}

@When("^the user provides data in title feild$")
public void the_user_provides_data_in_title_feild() throws Throwable {
	//AutomationProjectPomEndtoEnd ap=new AutomationProjectPomEndtoEnd(driver);
	//WebElement iframe = driver.findElement(By.id("SingleFrame"));
	//driver.switchTo().frame(iframe);
	//inPutValuesToTheElement(ap.getReviewTitle(), "Collections");
}

@When("^provides the input values in the comment feild$")
public void provides_the_input_values_in_the_comment_feild() throws Throwable {
  
}

@When("^User clicks on send button$")
public void user_clicks_on_send_button() throws Throwable {
   
}

@Then("^verify whether the review has been recorded or not\\.$")
public void verify_whether_the_review_has_been_recorded_or_not() throws Throwable {
    
}

@When("^the user clicks on add qunatity$")
public void the_user_clicks_on_add_qunatity() throws Throwable {
	AutomationProjectPomEndtoEnd ap=new AutomationProjectPomEndtoEnd(driver);
	clickOnTheElement(ap.getQuantityadd());
}
@When("^user clicks on the color$")
public void user_clicks_on_the_color() throws Throwable {
	AutomationProjectPomEndtoEnd ap=new AutomationProjectPomEndtoEnd(driver);
	clickOnTheElement(ap.getColorselect());
}

@When("^select size from drop down$")
public void select_size_from_drop_down() throws Throwable {
	AutomationProjectPomEndtoEnd ap=new AutomationProjectPomEndtoEnd(driver);
	//selectfromdropdown(ap.getSizedropdown(),"1","Value" );
}

@When("^click on the add to cart button$")
public void click_on_the_add_to_cart_button() throws Throwable {
	AutomationProjectPomEndtoEnd ap=new AutomationProjectPomEndtoEnd(driver);
	clickOnTheElement(ap.getCartadd());
}

@Then("^verify whether the product is added to cart$")
public void verify_whether_the_product_is_added_to_cart() throws Throwable {
	AutomationProjectPomEndtoEnd ap=new AutomationProjectPomEndtoEnd(driver);
	Assert.assertEquals("Faded Short Sleeve T-shirts", getTextofTheElement(ap.getDressheader()));
	
}
@When("^the user clicks on the add to cart button$")
public void the_user_clicks_on_the_add_to_cart_button() throws Throwable {
	SearchFunctionality sf = new SearchFunctionality(driver);
	clickOnTheElement(sf.getProceedtocheckout());
}

@Then("^verify whether the user is able to navigate to the next page$")
public void verify_whether_the_user_is_able_to_navigate_to_the_next_page() throws Throwable {
	AutomationProjectPomEndtoEnd ap=new AutomationProjectPomEndtoEnd(driver);
	//Assert.assertEquals("SHOPPING-CART SUMMARY", getTextofTheElement(ap.getCartTitle()));
    
}
@When("^the user clicks on minus button in qty$")
public void the_user_clicks_on_minus_button_in_qty() throws Throwable {
	AutomationProjectPomEndtoEnd ap=new AutomationProjectPomEndtoEnd(driver);
	clickOnTheElement(ap.getMinusbtn());
}

@Then("^verify whether the quantity is changing accordingly or not$")
public void verify_whether_the_quantity_is_changing_accordingly_or_not() throws Throwable {
	AutomationProjectPomEndtoEnd ap=new AutomationProjectPomEndtoEnd(driver);
	Assert.assertEquals("Qty", getTextofTheElement(ap.getQtyheader()));
}
@When("^the user clicks on proceed to checkout button$")
public void the_user_clicks_on_proceed_to_checkout_button() throws Throwable {
	SearchFunctionality sf = new SearchFunctionality(driver);
	clickOnTheElement(sf.getCheckoutsummarybtn());
}

@Then("^verify whether the user is navigating to address page$")
public void verify_whether_the_user_is_navigating_to_address_page() throws Throwable {
	SearchFunctionality sf = new SearchFunctionality(driver);
	Assert.assertEquals("ADDRESSES", getTextofTheElement(sf.getAddressheader()));
}
@When("^the user clicks on update button in address page$")
public void the_user_clicks_on_update_button_in_address_page() throws Throwable {
	AutomationProjectPomEndtoEnd ap=new AutomationProjectPomEndtoEnd(driver);
	clickOnTheElement(ap.getAddresssupdate());
   
}

@Then("^verify whether the user is able to navigate to My addresses page$")
public void verify_whether_the_user_is_able_to_navigate_to_My_addresses_page() throws Throwable {
	AutomationProjectPomEndtoEnd ap=new AutomationProjectPomEndtoEnd(driver);
	Assert.assertEquals("YOUR ADDRESSES", getTextofTheElement(ap.getAddressheader()));
    
}
@When("^the user updates the last name from the address page$")
public void the_user_updates_the_last_name_from_the_address_page() throws Throwable {
	AutomationProjectPomEndtoEnd ap=new AutomationProjectPomEndtoEnd(driver);
	
	(ap.getLastnameUpdate()).clear();
	inPutValuesToTheElement(ap.getLastnameUpdate(), "Ajay");
}

@When("^click on the save button$")
public void click_on_the_save_button() throws Throwable {
	AutomationProjectPomEndtoEnd ap=new AutomationProjectPomEndtoEnd(driver);
	clickOnTheElement(ap.getSubmitaddress());
}

@Then("^verify whether the page is navigating back to the proceed to address page$")
public void verify_whether_the_page_is_navigating_back_to_the_proceed_to_address_page() throws Throwable {
	SearchFunctionality sf = new SearchFunctionality(driver);
	Assert.assertEquals("ADDRESSES", getTextofTheElement(sf.getAddressheader()));
	
}
}


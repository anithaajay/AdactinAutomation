package com.cucumber.test2.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.cucumber.runner.MouseHoverTestRunner;
import com.selenium.automationwebsite.pom.LoginFunctionalitypom;
import com.selenium.automationwebsite.pom.MouseHoverSelectPom;
import com.selenium.baseclass.BaseclassMaven;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestUsingMouseHoverFunctionality extends BaseclassMaven{
	public static WebDriver driver=MouseHoverTestRunner.driver;

	
	@Given("^user launch the automation practise application$")
	public void user_launch_the_automation_practise_application() throws Throwable {
		geturl("http://automationpractice.com/index.php");
	    
	}
	@When("^the user mousehover on the Women tab$")
	public void the_user_mousehover_on_the_Women_tab() throws Throwable {
		
		MouseHoverSelectPom ms = new MouseHoverSelectPom(driver);
		mouseHoverOnTheElement(ms.getWomenmouseHover());
	    
	  
	}

	@Then("^Verify the Dresses in the header$")
	public void verify_the_Dresses_in_the_header() throws Throwable {
		//MouseHoverSelectPom ms = new MouseHoverSelectPom(driver);
		//Assert.assertEquals("DRESSES", getTextofTheElement(ms.getDressesHeader()));
	  
	}

	@When("^the user clicks on the casualdresses options$")
	public void the_user_clicks_on_the_casualdresses_options() throws Throwable {
		MouseHoverSelectPom ms = new MouseHoverSelectPom(driver);
		clickOnTheElement(ms.getCasualDressSelect());
	    
	  
	}

	@Then("^verify the selected result in header$")
	public void verify_the_selected_result_in_header() throws Throwable {
		MouseHoverSelectPom ms = new MouseHoverSelectPom(driver);
		Assert.assertEquals("CASUAL DRESSES ", getTextofTheElement(ms.getCasualDressesHeader()));
	  
	}

	@When("^the user mousehover on a selected dress$")
	public void the_user_mousehover_on_a_selected_dress() throws Throwable {
		MouseHoverSelectPom ms = new MouseHoverSelectPom(driver);
	   mouseHoverOnTheElement(ms.getDressoptions());
	}

	@When("^clicks on the more button$")
	public void clicks_on_the_more_button() throws Throwable {
		MouseHoverSelectPom ms = new MouseHoverSelectPom(driver);
		clickOnTheElement(ms.getClickmore());
	    
	}

	@Then("^verify whether the user is able to select the dress and proceeds next$")
	public void verify_whether_the_user_is_able_to_select_the_dress_and_proceeds_next() throws Throwable {
		MouseHoverSelectPom ms = new MouseHoverSelectPom(driver);
		Assert.assertEquals("Printed Dress", getTextofTheElement(ms.getPrintedDressHeader()));
	}
	@When("^the user clicks on plus sign for adding the qunatity$")
	public void the_user_clicks_on_plus_sign_for_adding_the_qunatity() throws Throwable {
		MouseHoverSelectPom ms = new MouseHoverSelectPom(driver);
		clickOnTheElement(ms.getClickplussign()); 
	}

	
	@Given("^select the size from drop down$")
	public void select_the_size_from_drop_down() throws Throwable {
		//MouseHoverSelectPom ms = new MouseHoverSelectPom(driver);
		//selectfromdropdown(ms.getSizeselct(), "2", "index");
	}

	@Given("^click on add to cart$")
	public void click_on_add_to_cart() throws Throwable {
		MouseHoverSelectPom ms = new MouseHoverSelectPom(driver);
		clickOnTheElement(ms.getAddtocartclick());
		
	}

	@Then("^verify whether the item added successfully in the header of the page$")
	public void verify_whether_the_item_added_successfully_in_the_header_of_the_page() throws Throwable {
		//MouseHoverSelectPom ms = new MouseHoverSelectPom(driver);
		//Assert.assertEquals("Product successfully added to your shopping cart", getTextofTheElement(ms.getIemaddedtocartHeader()));
	}
	@When("^the user clicks on proceed to check out button$")
	public void the_user_clicks_on_proceed_to_check_out_button() throws Throwable {
		MouseHoverSelectPom ms = new MouseHoverSelectPom(driver);
		clickOnTheElement(ms.getCheckoutbtn());
	}

	@Then("^verify whether the user is able to go to next page$")
	public void verify_whether_the_user_is_able_to_go_to_next_page() throws Throwable {
		//MouseHoverSelectPom ms = new MouseHoverSelectPom(driver);
		//Assert.assertEquals("SHOPPING-CART SUMMARY", getTextofTheElement(ms.getCartheader()));
	    
	}
	@When("^the user clicks onthe proceed to checkout button$")
	public void the_user_clicks_onthe_proceed_to_checkout_button() throws Throwable {
		MouseHoverSelectPom ms = new MouseHoverSelectPom(driver);
		clickOnTheElement(ms.getProceedtocheckout());
	}

	@Then("^verify whether the user is navigating to next page$")
	public void verify_whether_the_user_is_navigating_to_next_page() throws Throwable {
		//MouseHoverSelectPom ms = new MouseHoverSelectPom(driver);
		//Assert.assertEquals("AUTHENTICATION", getTextofTheElement(ms.getAuthenticationHeader()));
	}
	@When("^the user clicks on the email id \"([^\"]*)\"$")
	public void the_user_clicks_on_the_email_id(String arg1) throws Throwable {
		LoginFunctionalitypom lp=new LoginFunctionalitypom(driver);
		inPutValuesToTheElement(lp.getEmailid(),arg1);
		
	}

	@When("^the user gives the password \"([^\"]*)\"$")
	public void the_user_gives_the_password(String arg1) throws Throwable {
		LoginFunctionalitypom lp=new LoginFunctionalitypom(driver);
		inPutValuesToTheElement(lp.getPassword(),arg1);
		
				
		
	}

	@When("^the user clicks on signin$")
	public void the_user_clicks_on_signin() throws Throwable {
		LoginFunctionalitypom lp=new LoginFunctionalitypom(driver);
		clickOnTheElement(lp.getLogin());
		
	   
	}

	
	

}



package com.selenium.automationwebsite.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFunctionality {
	public WebDriver driver;
	
	public SearchFunctionality(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
				
	}
	
@FindBy(id = "search_query_top")
private WebElement searchbar;
@FindBy(xpath = "(//button[@type='submit'])[1]")
private WebElement clicksearch;
@FindBy(xpath = "(//img[@title='Printed Summer Dress'])[2]")
private WebElement dressMouseHover;
@FindBy(xpath = "(//span[text()='Add to cart'])[1]")
private WebElement addtocart;
@FindBy(id = "layer_cart_product_title")
private WebElement addtocartpageheader;

@FindBy(xpath = "//a[@title='Proceed to checkout']")
private WebElement proceedtocheckout;
@FindBy(xpath = "//*[@id=\"cart_title\"]")
private WebElement shoppingcartheader;
@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
private WebElement checkoutsummarybtn;
@FindBy(xpath = "//h1[text()='Addresses']")
private WebElement addressheader;
@FindBy(xpath = "(//button[@type='submit'])[2]")
private WebElement checkoutaddressbtn;
@FindBy(xpath = "//h1[text()='Shipping']")
private WebElement shippingheader;

@FindBy(xpath = "//label[text()='I agree to the terms of service and will adhere to them unconditionally.']")
private WebElement termsandconditionscheckbox;
@FindBy(xpath = "(//button[@type='submit'])[2]")
private WebElement Shippingproceedbtn;
@FindBy(xpath = "//h1[text()='Please choose your payment method']")
private WebElement paymentheaderheader;
@FindBy(xpath = "//a[@title='Pay by check.']")
private WebElement paybycheckclick;
@FindBy(xpath = "//h1[text()='Order summary']")
private WebElement ordersummaryheader;
@FindBy(xpath = "(//button[@type='submit'])[2]")
private WebElement confirmorderbtn;
@FindBy(xpath = "//h1[text()='Order confirmation']")
private WebElement orderconfirmationheader;
@FindBy(xpath = "//a[@title='Log me out']")
private WebElement logoutbtn;
@FindBy(xpath = "//h1[text()='Authentication']")
private WebElement Authticationpageheader;



public WebElement getSearchbar() {
	return searchbar;
}
public WebElement getClicksearch() {
	return clicksearch;
	
}
public WebElement getDressMouseHover() {
	return dressMouseHover;
}
public WebElement getAddtocart() {
	return addtocart;
}

public WebElement getAddtocartpageheader() {
	return addtocartpageheader;
}
public WebElement getProceedtocheckout() {
	return proceedtocheckout;
}
public WebElement getShoppingcartheader() {
	return shoppingcartheader;
}
public WebElement getCheckoutsummarybtn() {
	return checkoutsummarybtn;
}
public WebElement getAddressheader() {
	return addressheader;
}
public WebElement getCheckoutaddressbtn() {
	return checkoutaddressbtn;
}
public WebElement getShippingheader() {
	return shippingheader;
}
public WebElement getTermsandconditionscheckbox() {
	return termsandconditionscheckbox;
}
public WebElement getShippingproceedbtn() {
	return Shippingproceedbtn;
}
public WebElement getPaymentheaderheader() {
	return paymentheaderheader;
}
public WebElement getPaybycheckclick() {
	return paybycheckclick;
}
public WebElement getOrdersummaryheader() {
	return ordersummaryheader;
}
public WebElement getConfirmorderbtn() {
	return confirmorderbtn;
}
public WebElement getOrderconfirmationheader() {
	return orderconfirmationheader;
}
public WebElement getLogoutbtn() {
	return logoutbtn;
}
public WebElement getAuthticationpageheader() {
	return Authticationpageheader;
}
}

package com.selenium.automationwebsite.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MouseHoverSelectPom {
	
	public WebDriver driver;
	public MouseHoverSelectPom(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@title='Women']")
	private WebElement womenmouseHover;
	@FindBy(xpath = "(//a[@title='Dresses'])[1]")
	private WebElement DressesHeader;
	@FindBy(xpath = "(//a[@title='Casual Dresses'])[1]")
	private WebElement casualDressSelect;
	@FindBy(xpath = "//span[@class='cat-name']")
	private WebElement CasualDressesHeader;
	
	@FindBy(xpath = "//img[@title='Printed Dress']")
	private WebElement Dressoptions;
	@FindBy(xpath = "//span[text()='More']")
	private WebElement clickmore;
	@FindBy(xpath = "//h1[text()='Printed Dress']")
	private WebElement printedDressHeader;
	@FindBy(xpath = "//i[@class='icon-plus']")
	private WebElement clickplussign;
	@FindBy(id = "group_1")
	private WebElement sizeselct;
	@FindBy(xpath = "//span[text()='Add to cart']")
	private WebElement addtocartclick;
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[1]/h2")
	private WebElement iemaddedtocartHeader;
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
	private WebElement  checkoutbtn;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
	private WebElement proceedtocheckout;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/h1")
	private WebElement AuthenticationHeader;
	
	@FindBy(id = "cart_title")
	private WebElement cartheader;
	
	
	public WebElement getWomenmouseHover() {
		return womenmouseHover;
	}
	
	public WebElement getDressesHeader() {
		return DressesHeader;
	}
	public WebElement getCasualDressSelect() {
		return casualDressSelect;
	}
	public WebElement getCasualDressesHeader() {
		return CasualDressesHeader;
	}
	
	public WebElement getDressoptions() {
		return Dressoptions;
	}
	
	public WebElement getClickmore() {
		return clickmore;
	}
	
	public WebElement getPrintedDressHeader() {
		return printedDressHeader;
	}
	
	public WebElement getClickplussign() {
		return clickplussign;
	}
	
	public WebElement getSizeselct() {
		return sizeselct;
	}
	
	public WebElement getAddtocartclick() {
		return addtocartclick;
	}
	public WebElement getIemaddedtocartHeader() {
		return iemaddedtocartHeader;
	}
	public WebElement getCheckoutbtn() {
		return checkoutbtn;
	}
	
	
	public WebElement getCartheader() {
		return cartheader;
	}
	public WebElement getProceedtocheckout() {
		return proceedtocheckout;
	}
	
	public WebElement getAuthenticationHeader() {
		return AuthenticationHeader;
	}
}


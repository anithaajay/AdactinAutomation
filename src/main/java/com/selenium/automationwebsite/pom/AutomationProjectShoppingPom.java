package com.selenium.automationwebsite.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationProjectShoppingPom {
	public WebDriver driver;
	public AutomationProjectShoppingPom(WebDriver ldriver) {
		this.driver=ldriver;
	PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//span[text()='View']")
	private WebElement viewbtn;
	@FindBy(xpath = "//h1[text()='Faded Short Sleeve T-shirts']")
	private WebElement itemnameheader;
	@FindBy(id = "product_comments_block_extra")
	private WebElement reviewclick;
	@FindBy(xpath = "//h2[text()='Write a review']")
	private WebElement reviewheader;
	@FindBy(xpath = "//i[@class='icon-plus']")
	private WebElement quantitybtn;
	
	
	
	public WebElement getViewbtn() {
		return viewbtn;
	}
	public WebElement getItemnameheader() {
		return itemnameheader;
	}

	public WebElement getReviewclick() {
		return reviewclick;
	}
	public WebElement getReviewheader() {
		return reviewheader;
	}
	public WebElement getQuantitybtn() {
		return quantitybtn;
	}
}

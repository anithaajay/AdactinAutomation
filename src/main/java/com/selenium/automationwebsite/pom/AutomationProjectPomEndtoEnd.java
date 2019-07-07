package com.selenium.automationwebsite.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationProjectPomEndtoEnd {
	public WebDriver driver;
	
	public AutomationProjectPomEndtoEnd(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath = "//span[text()='My personal information']")
private WebElement personalinfobtn;
@FindBy(xpath = "//*[@id=\"center_column\"]/div/h1")
private WebElement personalinfoheader;
@FindBy(xpath = "(//a[@class='btn btn-default button button-small'])[3]")
private WebElement homebtn;
@FindBy(xpath = "//a[@title='View my customer account']")
private WebElement accountNameheader;
@FindBy(xpath = "//a[@title='Women']")
private WebElement Womentab;
@FindBy(xpath = "//a[@title='Tops']")
private WebElement topsbtn;
@FindBy(xpath = "//span[@class='cat-name']")
private WebElement topsheader;
@FindBy(xpath = "(//a[text()='T-shirts'])[4]")
private WebElement Tshirtscategory;
@FindBy(xpath = "//span[@class='cat-name']")
private WebElement TshirtsHeader;
@FindBy(xpath = "//i[@class='icon-th-list']")
private WebElement listbutton;
@FindBy(xpath = "//li[text()='View']")
private WebElement listheader;
@FindBy(xpath = "//a[text()='Short Sleeve']")
private WebElement sleevecheckbox;
@FindBy(xpath="//a[text()='M']")
private WebElement sizecheck;
@FindBy(xpath = "//a[@class='add_to_compare']")
private WebElement adtocompare;
@FindBy(xpath = "//a[@class='addToWishlist wishlistProd_1']")
private WebElement wishlistbtn;
@FindBy(xpath = "//p[text()='Added to your wishlist.']")
private WebElement wishlistpopup;
@FindBy(xpath = "//a[@title='Close']")
private WebElement closepopup;
@FindBy(xpath = "(//button[@type='submit'])[2]")
private WebElement comparebtn;
@FindBy(xpath = "//h1[text()='Product Comparison']")
private WebElement compareheader;
@FindBy(xpath = "//i[@class='icon-plus']")
private WebElement quantityadd;
@FindBy(xpath = "//a[@class='open-comment-form']")
private WebElement reviewbtn;
@FindBy(xpath = "//h2[text()='Write a review']")
private WebElement reviewheader;
@FindBy(xpath = "comment_title")
private WebElement ReviewTitle;
@FindBy(xpath = "//a[@title='Close']")
private WebElement reviewclose;
@FindBy(id = "color_14")
private WebElement colorselect;
@FindBy(id = "group_1")
private WebElement sizedropdown;
@FindBy(xpath = "//span[text()='Add to cart']")
private WebElement cartadd;
@FindBy(xpath = "//span[text()='Faded Short Sleeve T-shirts']")
private WebElement dressheader;
@FindBy(id = "cart_title")
private WebElement cartTitle;
@FindBy(xpath = "//a[@title='Subtract']")
private WebElement minusbtn;
@FindBy(xpath = "//th[text()='Qty']")
private WebElement qtyheader;
@FindBy(xpath = "(//a[@title='Update'])[1]")
private WebElement addresssupdate;
@FindBy(xpath = "//h1[text()='Your addresses']")
private WebElement addressheader;
@FindBy(xpath = "(//input[@type='text'])[3]")
private WebElement lastnameUpdate;
@FindBy(xpath = "(//button[@type='submit'])[2]")
private WebElement submitaddress;

public WebElement getPersonalinfobtn() {
	return personalinfobtn;
}
public WebElement getPersonalinfoheader() {
	return personalinfoheader;
}
public WebElement getHomebtn() {
	return homebtn;
}
public WebElement getAccountNameheader() {
	return accountNameheader;
}
public WebElement getWomentab() {
	return Womentab;
}
public WebElement getTopsbtn() {
	return topsbtn;
}
public WebElement getTopsheader() {
	return topsheader;
}

public WebElement getTshirtscategory() {
	return Tshirtscategory;
}
public WebElement getTshirtsHeader() {
	return TshirtsHeader;
}
public WebElement getListbutton() {
	return listbutton;
}
public WebElement getListheader() {
	return listheader;
}
public WebElement getSleevecheckbox() {
	return sleevecheckbox;
}
public WebElement getSizecheck() {
	return sizecheck;
}
public WebElement getAdtocompare() {
	return adtocompare;
}
public WebElement getWishlistbtn() {
	return wishlistbtn;
}
public WebElement getWishlistpopup() {
	return wishlistpopup;
}
public WebElement getClosepopup() {
	return closepopup;
}
public WebElement getComparebtn() {
	return comparebtn;
}
public WebElement getCompareheader() {
	return compareheader;
}
public WebElement getQuantityadd() {
	return quantityadd;
}
public WebElement getReviewbtn() {
	return reviewbtn;
}
public WebElement getReviewheader() {
	return reviewheader;
}
public WebElement getReviewTitle() {
	return ReviewTitle;
}
public WebElement getReviewclose() {
	return reviewclose;
}
public WebElement getColorselect() {
	return colorselect;
}
public WebElement getSizedropdown() {
	return sizedropdown;
}
public WebElement getCartadd() {
	return cartadd;
}
public WebElement getDressheader() {
	return dressheader;
}
public WebElement getCartTitle() {
	return cartTitle;
}
public WebElement getMinusbtn() {
	return minusbtn;
}
public WebElement getQtyheader() {
	return qtyheader;
}
public WebElement getAddresssupdate() {
	return addresssupdate;
}
public WebElement getAddressheader() {
	return addressheader;
}
public WebElement getLastnameUpdate() {
	return lastnameUpdate;
}
public WebElement getSubmitaddress() {
	return submitaddress;
}
}

package com.selenium.automationwebsite.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFunctionalitypom {
	public WebDriver driver;
	
	
	public LoginFunctionalitypom(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
		
	}
	

@FindBy(xpath = "//a[@title='Log in to your customer account']")
private WebElement signinbtn;
@FindBy(xpath = "//h3[text()='Already registered?']")
private WebElement pageheader;


@FindBy(id = "email")
private WebElement emailid;
@FindBy(id = "passwd")
private WebElement password;
@FindBy(id = "SubmitLogin")
private WebElement login;
@FindBy(xpath = "//h1[text()='My account']")
private WebElement myaccount;
@FindBy(xpath = "//p[text()='There is 1 error']")
private WebElement errordetail;
	
public WebElement getSigninbtn() {
	return signinbtn;
}
public WebElement getPageheader() {
	return pageheader;
}
public WebElement getEmailid() {
	return emailid;
}

public WebElement getPassword() {
	return password;
}


public WebElement getLogin() {
	return login;
}
public WebElement getMyaccount() {
	return myaccount;
}
public WebElement getErrordetail() {
	return errordetail;
}
}

package com.qsp.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	

	
     @FindBy (name="user_name")
     private WebElement userNameAddress;
     
     @FindBy (name="user_password")
     private WebElement pwdAdress;
     
	@FindBy (id="submitButton")
     private WebElement submitButton;
     
     @FindBy (xpath="//a[text()='Sign Out']")
     private WebElement sighOutButton;
     
     public LoginPage(WebDriver driver)
 	{
 		PageFactory.initElements( driver,this);
 	}
     public WebElement getSighOutButton() {
 		return sighOutButton;
 	}
	public WebElement getUserNameAddress() {
		return userNameAddress;
	}

	public WebElement getPwdAdress() {
		return pwdAdress;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
     
   
}

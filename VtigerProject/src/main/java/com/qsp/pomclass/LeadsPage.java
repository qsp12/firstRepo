package com.qsp.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {
@FindBy (xpath="//img[@alt='Create Lead...']")
 private WebElement createNewLeadsAdress;
 
@FindBy (name="firstname")
private WebElement FirstNameAdress;

@FindBy (name="lastname")
private WebElement LastNameAdress;

@FindBy (name="button")
private WebElement saveButton;

@FindBy (id="designation")
private WebElement titelAdrees;

@FindBy (xpath="//select[@name='leadsource']")
private WebElement leadSourceAddress;

@FindBy (xpath="industry")
private WebElement industryAdress;

public WebElement getLeadSourceAddress() {
	return leadSourceAddress;
}

public WebElement getIndustryAdress() {
	return industryAdress;
}

public WebElement getTitelAdrees() {
	return titelAdrees;
}

public WebElement getCompanyAddress() {
	return companyAddress;
}

@FindBy (name="company")
private WebElement companyAddress;


public WebElement getSaveButton() {
	return saveButton;
}
 
public LeadsPage(WebDriver driver)
{
  PageFactory.initElements(driver,this);	
}

public WebElement getLastNameAdress() {
	return LastNameAdress;
}

public WebElement getCreateNewLeadsAdress() {
	return createNewLeadsAdress;
}

public WebElement getFirstNameAdress() {
	return FirstNameAdress;
}
}

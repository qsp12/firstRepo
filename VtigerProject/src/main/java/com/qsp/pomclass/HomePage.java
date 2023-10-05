package com.qsp.pomclass;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	    public class HomePage {	
		@FindBy(xpath="//img[@style='width:16px;height:16px;']")
		private WebElement homebuttonAddress;
		
		@FindBy(xpath="//a[text()='Organizations']")
		private WebElement Organization;
		
		@FindBy(xpath="//a[text()='Leads']")
		private WebElement LeadButton;
		
        @FindBy (xpath="(//td[@valign='bottom' and @class='small'])[1]")
        private WebElement AdminstrationAdress;
        
        public HomePage(WebDriver driver)
        {
        	PageFactory.initElements(driver,this);
        }

		public WebElement getHomebuttonAddress() {
			return homebuttonAddress;
		}

		public WebElement getOrganization() {
			return Organization;
		}

		public WebElement getLeadButton() {
			return LeadButton;
		}

		public WebElement getAdminstrationAdress() {
			return AdminstrationAdress;
		}
        
        
		
	}


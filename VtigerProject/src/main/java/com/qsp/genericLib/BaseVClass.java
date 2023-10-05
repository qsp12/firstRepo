package com.qsp.genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.qsp.pomclass.HomePage;
import com.qsp.pomclass.LeadsPage;
import com.qsp.pomclass.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseVClass {
  public static WebDriver driver;
 public PropertyFilesUtils pu;
 public WebDriverUtils wu;
 public LoginPage lp;
 public HomePage hp;
 public LeadsPage ld;
 public ExcelOperasationUtils ex;
 @BeforeClass
 public void openApp() 
 {
	 wu=new WebDriverUtils();
	 pu=new PropertyFilesUtils();
	 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 wu.maximizePage(driver);
	 wu.implicitWait(driver, 10);
	 
	 wu.oppenApp(driver,pu.propertyFetch(Iconstant.VtigerLoginpath,"url"));
    	 
 }
 @BeforeMethod
 public void login() throws Throwable
 {
	
	 wu=new WebDriverUtils();
	 pu=new PropertyFilesUtils();
	 lp=new LoginPage(driver);
	 lp.getUserNameAddress().sendKeys(pu.propertyFetch(Iconstant.VtigerLoginpath,"un"));
	 lp.getPwdAdress().sendKeys(pu.propertyFetch(Iconstant.VtigerLoginpath,"pwd"));
	 lp.getSubmitButton().click();
 }

 @AfterMethod
 public void logOut()
 {
	 wu=new WebDriverUtils();
	 wu.moveTheCrossor(driver,hp.getAdminstrationAdress());
	 lp.getSighOutButton().click();
 }
}
 


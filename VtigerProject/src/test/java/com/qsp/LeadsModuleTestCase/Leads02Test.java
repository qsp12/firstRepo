package com.qsp.LeadsModuleTestCase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.qsp.genericLib.BaseVClass;
import com.qsp.genericLib.ExcelOperasationUtils;
import com.qsp.genericLib.Iconstant;
import com.qsp.pomclass.HomePage;
import com.qsp.pomclass.LeadsPage;


public class Leads02Test extends BaseVClass{
	
	
	@Test
	 public void leads02()
	 {
		  
		  hp=new HomePage(driver);
		  ld=new LeadsPage(driver);
		  ex=new ExcelOperasationUtils();
		  hp.getLeadButton().click();
		  ld.getCreateNewLeadsAdress().click();
		  ld.getFirstNameAdress().sendKeys(ex.fetchSingleData(Iconstant.leadsSheetPath,3,4,"LeadsModules"));
		  ld.getLastNameAdress().sendKeys(ex.fetchSingleData(Iconstant.leadsSheetPath,4,4,"LeadsModules"));
		  ld.getCompanyAddress().sendKeys(ex.fetchSingleData(Iconstant.leadsSheetPath,5,4,"LeadsModules"));
		  ld.getSaveButton().click();
	 }
}

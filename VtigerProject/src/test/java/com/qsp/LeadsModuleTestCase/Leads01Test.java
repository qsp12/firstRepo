package com.qsp.LeadsModuleTestCase;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qsp.genericLib.BaseVClass;
import com.qsp.genericLib.ExcelOperasationUtils;
import com.qsp.genericLib.Iconstant;
import com.qsp.pomclass.HomePage;
import com.qsp.pomclass.LeadsPage;

@Listeners(com.qsp.genericLib.ListnerClass.class)
public class Leads01Test extends BaseVClass {
	 
	@Test
	 public void leads1() throws Throwable
	 {
		  
		  hp=new HomePage(driver);
		  ld=new LeadsPage(driver);
		  ex=new ExcelOperasationUtils();
		  hp.getLeadButton().click();
		  ld.getCreateNewLeadsAdress().click();
		  ld.getFirstNameAdress().sendKeys(ex.fetchSingleData(Iconstant.leadsSheetPath,3,1,"LeadsModules"));
		  ld.getLastNameAdress().sendKeys(ex.fetchSingleData(Iconstant.leadsSheetPath,4,1,"LeadsModules"));
	      ld.getSaveButton().click();	  
		
	 }
}

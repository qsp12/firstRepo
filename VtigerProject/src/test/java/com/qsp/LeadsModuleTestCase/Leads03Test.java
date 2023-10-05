package com.qsp.LeadsModuleTestCase;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qsp.genericLib.BaseVClass;
import com.qsp.genericLib.ExcelOperasationUtils;
import com.qsp.genericLib.Iconstant;
import com.qsp.pomclass.HomePage;
import com.qsp.pomclass.LeadsPage;

public class Leads03Test extends BaseVClass {
	@Test
	 public void leads03()
	 {
		  
		  hp=new HomePage(driver);
		  ld=new LeadsPage(driver);
		  ex=new ExcelOperasationUtils();
		  hp.getLeadButton().click();
		  ld.getCreateNewLeadsAdress().click();
		  ld.getFirstNameAdress().sendKeys(ex.fetchSingleData(Iconstant.leadsSheetPath, 3, 7,"LeadsModules"));
		  ld.getLastNameAdress().sendKeys(ex.fetchSingleData(Iconstant.leadsSheetPath, 4, 7,"LeadsModules"));
	      ld.getCompanyAddress().sendKeys(ex.fetchSingleData(Iconstant.leadsSheetPath, 5, 7,"LeadsModules"));	 
	      ld.getTitelAdrees().sendKeys(ex.fetchSingleData(Iconstant.leadsSheetPath, 6, 7,"LeadsModules"));
	      WebElement ele=ld.getLeadSourceAddress();
	      wu.dropDownByindex(ele, 4);
		  ld.getSaveButton().click();
}
}
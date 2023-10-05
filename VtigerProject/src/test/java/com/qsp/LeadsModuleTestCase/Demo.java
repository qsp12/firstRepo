package com.qsp.LeadsModuleTestCase;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qsp.genericLib.BaseVClass;
import com.qsp.genericLib.ExcelOperasationUtils;
import com.qsp.genericLib.Iconstant;
import com.qsp.pomclass.HomePage;
import com.qsp.pomclass.LeadsPage;
@Listeners(com.qsp.genericLib.ListnerClass.class)

public class Demo extends BaseVClass {
	
	@Test
	public void tc()
	{
		hp=new HomePage(driver);
		ld=new LeadsPage(driver);
		ex=new ExcelOperasationUtils();
		
		hp.getLeadButton().click();
		ld.getCreateNewLeadsAdress().sendKeys(ex.fetchSingleData(Iconstant.leadsSheetPath, 3, 1,"LeadsModules"));
		
	}

}

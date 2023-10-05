 package com.qsp.genericLib;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListnerClass implements ITestListener {
	
	
	ExtentTest test;
	ExtentSparkReporter esr;
	ExtentReports er;

	public void onTestStart(ITestResult result) {
		String testCaseName=result.getName();
		Reporter.log("test acse started"+testCaseName);
		test=er.createTest(testCaseName);
	}

	public void onTestSuccess(ITestResult result) {
		String testCaseName=result.getName();
		Reporter.log("test case excuted sucessfully"+testCaseName,true);
		test.log(Status.PASS,"Test case Excuted sucessfully"+" "+testCaseName);
	}

	public void onTestFailure(ITestResult result) {
		String testCaseName=result.getName();
		WebDriverUtils wd=new WebDriverUtils();
		JavaUtils ju=new JavaUtils();
		 String path=Iconstant.PathSS+"/"+ju.generateDate()+ju.generateTime()+testCaseName+".png";
		Reporter.log("test case excuted sucessfully"+testCaseName);
		test.log(Status.FAIL,"Test case failed"+" "+testCaseName);
		//System.out.println("+++++++++++++++++++++++++++++++++++++"+path);
		wd.takeScreenShot(BaseVClass.driver,path);
	}
		public void onTestSkipped(ITestResult result) {
		String testCaseName=result.getName();
		Reporter.log("test case excuted sucessfully"+testCaseName);
		test.log(Status.SKIP,"Test case got skipped"+testCaseName);
	}

	public void onStart(ITestContext context) {
		String testCaseName=context.getName();
	    JavaUtils ju=new JavaUtils();
		String path=Iconstant.ReportPath+"/"+ju.generateDate()+ju.generateTime();
        esr=new ExtentSparkReporter(path+"/"+testCaseName+".html" );
        esr.config().setReportName("balram");
        esr.config().setTheme(Theme.DARK);
        esr.config().setDocumentTitle("vtiger");
        
        er=new ExtentReports();
        er.attachReporter(esr);
        er.setSystemInfo("version used","window 8.1");
        er.setSystemInfo("System used  ", "Hp");
        er.setSystemInfo("System Bits ", "64 bits");
	
	}

	public void onFinish(ITestContext context) {
		er.flush();
		
	}

}

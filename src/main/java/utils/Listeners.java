package utils;



import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.ProjectSpecifications;

public class Listeners extends ProjectSpecifications implements ITestListener {

	

	ExtentTest test;
	
	ExtentReports extent = ExtentReportClass.getReport();
	

    public void onTestStart(ITestResult result) {
		
		test = extent.createTest(result.getMethod().getMethodName());
		
		System.out.println("Test started");
		
	}
    
    public void onTestSuccess(ITestResult result) {
    	
    	test.log(Status.PASS, "Test Passed");
    	System.out.println("Test Success");
    }
	
    public void onTestFailure(ITestResult result) {
    	
    	 if (test == null) {
    	       
    	        test = extent.createTest(result.getMethod().getMethodName());
    	    }
    	
    	test.fail(result.getThrowable());
    	System.out.println("Test Failed");
    	
    	String filepath = null;
    	
    	try {
    		
    		filepath = CaptureScreen();
			
    		
		} catch (Exception e) {
            e.printStackTrace();
           
		}
    	test.addScreenCaptureFromPath(filepath, result.getMethod().getMethodName());
    }
	
    public void onTestSkipped(ITestResult result) {
    	
    	System.out.println("Test Skipped");
    }

    public void onFinish(ITestContext context) {
       extent.flush();
    }


}

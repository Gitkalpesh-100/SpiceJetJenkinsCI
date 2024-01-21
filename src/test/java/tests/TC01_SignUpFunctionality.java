package tests;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.HomePage;
import pages.SignUpPage;
import utils.UtilClass;

public class TC01_SignUpFunctionality extends ProjectSpecifications {

	@BeforeTest()
	public void setup() {
		sheetName = "SignUpFunctionality";//same name for the sheet in excel sheet
	}
	
	@Test(dataProvider = "getData")
	public void SignUPTest(String Title, String firstnameandmiddlename, String lastname,String country,
			                String DoB,String Mob, String email, String pswd, String cnfpswd
			               ) throws InterruptedException {
	
		new HomePage(driver).
		signupbutton().
		PSignup().
		firstname(firstnameandmiddlename).
		lastname(lastname).
		date(DoB).
		mobile(Mob).
		email(email).
		pass(pswd).
		cpass(cnfpswd).
		checkbox().
		submitbutton();
		
	}
}


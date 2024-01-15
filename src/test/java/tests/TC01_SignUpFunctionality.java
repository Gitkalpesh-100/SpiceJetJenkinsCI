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
	public void SignUPTest(String Title, String firstnameandmiddlename, String lastname,
			               String CountryTerritoryofResidence, String DoB,
			               String Mob, String email, String pswd, String cnfpswd
			               ) throws IOException, InterruptedException {
	
		HomePage home = new HomePage();
		home.signupbutton();
		
		SignUpPage signup = new SignUpPage();
	    signup.selectTitle(Title);
		signup.firstnameandmiddlename(firstnameandmiddlename);
		signup.lastname(lastname);
		signup.Country(CountryTerritoryofResidence);
		signup.DoB(DoB);
		signup.Mob(Mob);
		signup.email(email);
		signup.pswd(pswd);
		signup.cnfpswd(cnfpswd);
		
		UtilClass.CaptureScreen();
		home.scroll();
		signup.checkbox1();
		signup.submit1();
		UtilClass.CaptureScreen();	
	}	
}
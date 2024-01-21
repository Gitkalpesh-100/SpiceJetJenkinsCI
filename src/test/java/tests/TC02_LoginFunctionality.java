package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.HomePage;
import pages.LoginPage;
import pages.SignUpPage;

public class TC02_LoginFunctionality extends ProjectSpecifications {
	

	@BeforeTest()
	public void setup() {
		sheetName = "LoginFunctionality";
	}
	
	@Test(dataProvider = "getData")
	public void LoginTest(String email, String pswd) throws InterruptedException {
		
		new HomePage(driver).
		
		loginbutton().
		Emailradiobutton().
		emailfield(email).
		loginpassword(pswd).
		loginbutton1();	
	}
}
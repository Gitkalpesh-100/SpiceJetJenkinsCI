package tests;

import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.HomePage;

public class TC12_CheckInStatusNegative extends ProjectSpecifications{
	
	@Test()
	public void status() throws InterruptedException {
		
		new HomePage(driver).
		checkinstatusnegative1().
		checkstatusnegative1();
	}

}

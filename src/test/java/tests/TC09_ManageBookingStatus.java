package tests;

import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.HomePage;

public class TC09_ManageBookingStatus extends ProjectSpecifications{

	
	@Test()
	public void status() throws InterruptedException {
		
		new HomePage(driver).
		managebooking().
		Managebooking1();
	}
}

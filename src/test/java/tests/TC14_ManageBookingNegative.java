package tests;

import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.HomePage;

public class TC14_ManageBookingNegative extends ProjectSpecifications{
	
	@Test()
	public void status() throws InterruptedException {
		
		new HomePage(driver).
		managebookingnegative().
		ManagebookingNegative1();
	}

}

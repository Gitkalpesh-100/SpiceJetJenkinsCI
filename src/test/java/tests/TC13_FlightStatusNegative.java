package tests;

import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.HomePage;

public class TC13_FlightStatusNegative extends ProjectSpecifications{
	
	@Test()
	public void status() throws InterruptedException {
		
		new HomePage(driver).
		flightstattusnegative().
		FlightstatusNegative1();
}

}

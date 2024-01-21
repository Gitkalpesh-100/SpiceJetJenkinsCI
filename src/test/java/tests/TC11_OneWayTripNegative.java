package tests;

import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.HomePage;

public class TC11_OneWayTripNegative extends ProjectSpecifications{
	
	@Test()
	public void oneway() throws InterruptedException {
		
		new HomePage(driver).onewayTripNegative().OneWaytripNegative1();
	}	

}

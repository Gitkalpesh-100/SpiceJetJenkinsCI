package tests;

import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.HomePage;

public class TC08_CheckInStatus extends ProjectSpecifications {
	
	@Test()
	public void status() throws InterruptedException {
		
		new HomePage(driver).
		checkstatus().
		checkstatus1();
	}
}
 
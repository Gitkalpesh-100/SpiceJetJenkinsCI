package tests;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.HomePage;
import pages.OneWayTripPage;

public class TC03_OneWayTrip extends ProjectSpecifications {

	@Test()
	public void oneway() throws InterruptedException {
		
		new HomePage(driver).onewaytrip().OneWaytrip1();
	}	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	@BeforeTest()
	public void setup() {
		sheetName = "OneWayTrip";
	}

	@Test(dataProvider = "getData")
	public void OneWayTrip(String From, String To, String DepartureDate) throws IOException, InterruptedException {
		OneWayTripPage oneway_obj = new OneWayTripPage();

		oneway_obj.OneWayRadBtn();
		oneway_obj.From(From);
		oneway_obj.To(To);
		oneway_obj.DepatureDate();
		
		Thread.sleep(3000);
		oneway_obj.SearchFlightBtn();
		Thread.sleep(5000);
	}
}
*/

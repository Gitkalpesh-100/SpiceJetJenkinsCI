package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.HomePage;
import pages.OneWayTripPage;



public class TC03_OneWayTrip extends ProjectSpecifications{

	@BeforeTest()
	public void setup() {
		sheetName = "OneWayTrip";
	}
	
	@Test(dataProvider = "getData")
	public void OneWayTrip(String From, String To, String From, String DepartureDate) {
		OneWayTripPage oneway = new OneWayTripPage();
		
		oneway.OneWayRadBtn();
		oneway.From(From);
		oneway.To(To);
		oneway.To(DepartureDate);
		click(passengers);
		click(currency);
		click(SearchFlightBtn);		
	}	
}
package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.SelectFlightAndProceedToBookingPage;

public class TC05_SelectFlightAndProceedToBooking extends ProjectSpecifications {

	
	@BeforeTest()
	public void setup(String From, String To, String From, String DepartureDate ) {
		sheetName = "OneWayTrip";
	}
	
	@Test
	public void SelectFlightAndProceedToBooking() {
		
	}
	
	SelectFlightAndProceedToBookingPage sf = new SelectFlightAndProceedToBookingPage();
	
	sf.From(From);
	sf.To(To);
	sf.RoundTripRadBtn();
	sf.From(From);
	sf.To(To);
	sf.To(DepartureDate);
	click(passengers);
	click(currency);
	click(SearchFlightBtn);
	click(contiueButton);
	
	
}

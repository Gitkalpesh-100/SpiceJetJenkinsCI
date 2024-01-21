package tests;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.SelectFlightAndProceedToBookingPage;

public class TC05_SelectFlightAndProceedToBooking extends ProjectSpecifications {

	@BeforeTest()
	public void setup() {
		sheetName = "OneWayTrip";
	}

	@Test(dataProvider = "getData")
	public void SelectFlightAndProceedToBooking(String From, String To, String DepartureDate)
			throws IOException, InterruptedException {

		SelectFlightAndProceedToBookingPage sf = new SelectFlightAndProceedToBookingPage();
		sf.OneWayRadBtn();
		sf.From(From);
		sf.To(To);
		sf.DepatureDate();
		sf.SearchFlightBtn();
		Thread.sleep(7000);	
		sf.ContinueBtn();
       
	}
}

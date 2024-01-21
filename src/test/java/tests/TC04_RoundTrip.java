package tests;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.RoundTripPage;

public class TC04_RoundTrip extends ProjectSpecifications {

	@BeforeTest()
	public void setup() {
		sheetName = "OneWayTrip";
	}
	
	@Test(dataProvider = "getData")
	public void RoundTrip(String From, String To, String DepartureDate) throws IOException, InterruptedException{
		
		RoundTripPage round = new RoundTripPage();
		
		round.RoundTripRadBtn();
	    round.From(From);
		round.To(To);
		round.Dates();
		round.SearchFlightBtn();
		Thread.sleep(5000);
				
	}

}

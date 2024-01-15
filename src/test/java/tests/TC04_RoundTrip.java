package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecifications;
import pages.RoundTripPage;

public class TC04_RoundTrip extends ProjectSpecifications {

	@BeforeTest()
	public void setup (String From, String To, String DepartureDate, String ReturnDate){
		sheetName = "RoundTrip";//same name for the sheet in excel sheet
	}
	
	@Test(dataProvider = "getData")
	public static void main(String[] args) {
		
		RoundTripPage round = new RoundTripPage();
		
		round.RoundTripRadBtn();
	    round.From(From);
		round.To(To);
		round.To(DepartureDate);
		click(passengers);
		click(currency);
		click(SearchFlightBtn);
		
	}

}

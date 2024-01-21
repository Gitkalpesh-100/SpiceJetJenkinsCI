package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.ProjectSpecifications;

public class ManageBookingNegativePage extends ProjectSpecifications{
	
	
public void ManagebookingNegative1() throws InterruptedException {
		
		
		
		WebElement flightstatusbutton=driver.findElement(By.xpath("//div[text()='manage booking']"));
		boolean Actual=flightstatusbutton.isEnabled();
		boolean excepted= true; 
		Assert.assertEquals(Actual,excepted );
		System.out.println("ManageBooking button enabled");

		
		
    String source1=driver.getPageSource();
		if(source1.contains("View / Manage Booking")) {
			System.out.println("User is on Manage Booking page");
		}else {
			System.out.println("User not in manage Booking Page");
		}
         
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("7867472");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(".@gmail.com");
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73 r-13qz1uu'])[1]")).click();
		Thread.sleep(3000);
		String source2=driver.getPageSource();
		if(source2.contains("Invalid PNR or Ticket Number")) {
			System.out.println("User is on Manage Booking page Test Pass");
		}else {
			System.out.println("User not in manage Booking Page Test fail");
		}

}

}

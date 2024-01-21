package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.ProjectSpecifications;

public class CheckInStatusNegativePage extends ProjectSpecifications {
	
public void checkstatusnegative1() throws InterruptedException {
		
		
		WebElement checkinbutton=driver.findElement(By.xpath("//div[text()='check-in']"));
		
		boolean Actual=checkinbutton.isEnabled();
		boolean excepted= true; 
		Assert.assertEquals(Actual,excepted );
		System.out.println("Checkin button enabled");
		
		String source1=driver.getPageSource();
		
		if(source1.contains("Web Check-In")) {
			System.out.println("User is on Checkin page");
		}else {
			System.out.println("User not in Checkin Page");
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("89563");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("abc@gmai.com");
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73 r-13qz1uu']")).click();
		Thread.sleep(3000);
         String source2=driver.getPageSource();
		
		if(source2.contains("Invalid PNR or Ticket Number")) {
			
			System.out.println("Test Pass");
		}else {
			System.out.println("Test Fail");
		}
	}

}

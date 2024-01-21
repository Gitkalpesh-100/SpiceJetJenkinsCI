package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.ProjectSpecifications;

public class FlightStatusNegativePage extends ProjectSpecifications{
	
	public void FlightstatusNegative1() throws InterruptedException {


		WebElement flightstatusbutton=driver.findElement(By.xpath("//div[text()='flight status']"));
		boolean Actual=flightstatusbutton.isEnabled();
		boolean excepted= true; 
		Assert.assertEquals(Actual,excepted );
		System.out.println("FlightStatus button enabled");

		String source1=driver.getPageSource();

		if(source1.contains("Flight Status")) {
			System.out.println("User is on Flight page");
		}else {
			System.out.println("User not in Flight Page");
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Departure Date']")).click();
		driver.findElement(By.xpath("//div[text()='Today']")).click();
		driver.findElement(By.xpath("//div[text()='From']")).click();

		driver.findElement(By.xpath("//div[text()='Bengaluru']")).click();
		Thread.sleep(2000);
		try {
		driver.findElement(By.xpath("//div[text()='Manohar International Airport']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("234");
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73 r-13qz1uu']")).click();
		}catch (Exception e) {
			System.out.println("City not Found");
		}
		Thread.sleep(10000);
		String source2=driver.getPageSource();

		if(source2.contains("SG - 234")) {
			System.out.println("User is on Flight page test pass");
		}else {
			System.out.println("User not in Flight Page Test fail");
		}

	}

}

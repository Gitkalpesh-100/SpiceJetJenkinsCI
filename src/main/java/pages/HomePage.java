package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecifications;

public class HomePage extends ProjectSpecifications {
	
	
	
	@FindBy (xpath = "//div[@class='css-76zvg2 r-jwli3a r-ubezar' and contains(text(), 'Signup')]")
	WebElement signupbutton;
	
	@FindBy (xpath = "//div[@class='css-76zvg2 r-jwli3a r-ubezar' and contains (text(), 'Login')]")
	WebElement loginbutton;
	
	@FindBy (xpath = "//div[text()='one way']")
	WebElement OneWayRadBtn;
	
	@FindBy (xpath = "//div[text()='Flights']")
	WebElement roundTripButton;
	

	@FindBy (xpath = "//input[@class = 'css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']")
	WebElement From;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public SignUpPage signupbutton() {
		signupbutton.click();
		return new SignUpPage();
		
		}
	
	public LoginPage loginbutton() {
		loginbutton.click();
		return new LoginPage();
	}
	
	
	
	public void goToSignInPage() {
		String parentWindowId = getParentWindowId();
		signupbutton.click();
		switchToChildWindow(parentWindowId);
	}
 
	private void switchToChildWindow(String parentWindowId) {	
	}

	private String getParentWindowId() {
		
		return null;
	}
	

	
	public void From(String Fromvalue) {
		sendKeys(From, Fromvalue);
	}

	public  CheckInStatusPage checkstatus() {
		driver.findElement(By.xpath("//div[text()='check-in']")).click();
		return new CheckInStatusPage() ;
		
		
	}
	
	public  ManageBookingPage managebooking () {
		driver.findElement(By.xpath("//div[text()='manage booking']")).click();
		return new ManageBookingPage() ;
		
		
	}
	
	public FlightStatusPage flightstatus() {
		driver.findElement(By.xpath("//div[text()='flight status']")).click();
		return new FlightStatusPage();
	}
	
	public OneWayTripPage onewaytrip() {
		driver.findElement(By.xpath("//div[text()='Flights']")).click();
		return new OneWayTripPage();
	}

	public OneWayTripNegativePage onewayTripNegative() {
		driver.findElement(By.xpath("//div[text()='Flights']")).click();
		return new OneWayTripNegativePage();
	}
	
	public CheckInStatusNegativePage checkinstatusnegative1() {
		driver.findElement(By.xpath("//div[text()='check-in']")).click();
		return new CheckInStatusNegativePage();	
	}
	
	public FlightStatusNegativePage flightstattusnegative() {
		driver.findElement(By.xpath("//div[text()='flight status']")).click();
		return new FlightStatusNegativePage();	
	}
	
	public ManageBookingNegativePage managebookingnegative() {
		driver.findElement(By.xpath("//div[text()='manage booking']")).click();
		return new ManageBookingNegativePage();
		
	}
}

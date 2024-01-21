package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.ProjectSpecifications;

public class SelectFlightAndProceedToBookingPage extends ProjectSpecifications{

	@FindBy(xpath = "//div[text()='one way']")
	WebElement OneWay;

	@FindBy(xpath="//div[text()='Departure Date']/..")
	WebElement departuredate;
	
	@FindBy(xpath = "(//input[@class = 'css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
	WebElement From;

	@FindBy(xpath = "(//input[@class = 'css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
	WebElement To;

	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")
	WebElement passengers;

	@FindBy(xpath = "(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[3]")
	WebElement currency;

	@FindBy(xpath = "//div[text()='Search Flight']/..")
	WebElement searchFlightBtn;
	
	//[2]- refers to month that is feb
	@FindBy(xpath="(//div[@data-testid='undefined-calendar-day-1']//div[text()='1'])[2]")
	WebElement date;

	@FindBy(xpath = "//div[@data-testid='continue-search-page-cta']")
	WebElement continue_btn;
	
	
	public SelectFlightAndProceedToBookingPage() {
		PageFactory.initElements(driver, this);
	}

	public void OneWayRadBtn() {
		click(OneWay);
	}
	public void DepatureDate() {
		
		click(date);
	}

	public void From(String Fromvalue) throws InterruptedException {
		click(From);
		Thread.sleep(500);
		sendKeys(From, Fromvalue);
	}

	public void To(String Tovalue) throws InterruptedException {
		click(To);
		Thread.sleep(500);
		sendKeys(To, Tovalue);
	}

	public void Passengers() {
		click(passengers);
	}

	public void currency() throws InterruptedException {

		WebElement selectcurrency = driver.findElement(By.xpath("(//div/select)[3]"));
		// create an object of Select Class
		Select dropdown = new Select(selectcurrency);
		dropdown.selectByVisibleText("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());// USD
		System.out.println(dropdown.isMultiple());
		Thread.sleep(2000);
	}

	public void SearchFlightBtn() {
		click(searchFlightBtn);
	}
	public void ContinueBtn() throws InterruptedException {
		click(continue_btn);
		Thread.sleep(12000);
	}	
}

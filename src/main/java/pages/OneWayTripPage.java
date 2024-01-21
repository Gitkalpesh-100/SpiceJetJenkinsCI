package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.ProjectSpecifications;

import org.openqa.selenium.interactions.Actions;

public class OneWayTripPage extends ProjectSpecifications{


	public void OneWaytrip1() throws InterruptedException {

		driver.findElement(By.xpath("//div[text()='From']")).click();

		driver.findElement(By.xpath("//div[text()='Bengaluru']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[text()='Mumbai']")).click();
		WebElement returnfield =driver.findElement(By.xpath("//div[text()='Return Date']"));

		boolean Actual=returnfield.isSelected();
		boolean Expected =false;
		Assert.assertEquals(Actual, Expected);
		System.out.println("Field Disabled : User in one way trip page");

		driver.findElement(By.xpath("(//div[text()='9'])[2]")).click();

		driver.findElement(By.xpath("//div[text()='Passengers']")).click(); 
		driver.findElement(By.xpath("(//div[contains(@class,'css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-')])[1]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid')])[1]")).click();
		Thread.sleep(3000);


		driver.findElement(By.xpath("//div[contains(@class,'css-1dbjc4n r-1awozwy r-z2')]")).click();

		Thread.sleep(10000);

		String Source=driver.getPageSource();

		if(Source.contains("Bengaluru to Mumbai")) {
			System.out.println("User's Page Visible");
		}else {
			System.out.println("User is on Wrong destiny");
		}

		driver.findElement(By.xpath("//div[contains(@class,'css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w')]")).click();
		Thread.sleep(10000);


		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Kalpesh");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("S");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("9822222298");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("kalpesh@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//div[text()='I am flying as the primary passenger']")).click();

		Thread.sleep(5000);
		WebElement continuebutton=driver.findElement(By.xpath("//div[text()='Continue']"));
		Actions act= new Actions(driver);
		act.moveToElement(continuebutton).click().perform();

		Thread.sleep(5000);
		WebElement continuebutton2=driver.findElement(By.xpath("//div[text()='Carry More On-board ']"));

		act.moveToElement(continuebutton2).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73'])[3]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("(//span[text()='Skip this to skip comfort.'])[1]")).click();

		Thread.sleep(7000);
		WebElement Refclick=driver.findElement(By.xpath("//h3[text()='Enter Debit / Credit Card Details']"));
		Actions act1=new Actions(driver);
		act1.moveToElement(Refclick).perform();
		Thread.sleep(4000);
		WebElement cardnumber=driver.findElement(By.xpath("//iframe[@class='card_number_iframe']"));

		driver.switchTo().frame(cardnumber);

		driver.findElement(By.xpath("//input[@id='card_number']")).sendKeys("55888400991");

		driver.switchTo().defaultContent();

		WebElement cardholdername=driver.findElement(By.xpath("//iframe[@class='name_on_card_iframe']"));

		driver.switchTo().frame(cardholdername);

		driver.findElement(By.xpath("//input[@id='name_on_card']")).sendKeys("Kalpesh P");


		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();

		WebElement month=driver.findElement(By.xpath("//iframe[@class='card_exp_month_iframe']"));

		driver.switchTo().frame(month);

		driver.findElement(By.xpath("//input[@id='card_exp_month']")).sendKeys("09");

		driver.switchTo().defaultContent();


		WebElement year=driver.findElement(By.xpath("//iframe[@class='card_exp_year_iframe']"));

		driver.switchTo().frame(year);

		driver.findElement(By.xpath("//input[@id='card_exp_year']")).sendKeys("2024");

		driver.switchTo().defaultContent();


		WebElement ccv=driver.findElement(By.xpath("//iframe[@class='security_code_iframe']"));

		driver.switchTo().frame(ccv);

		driver.findElement(By.xpath("//input[@id='security_code']")).sendKeys("321");

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-un1frt r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73']")).click();

		WebElement refclick1 =driver.findElement(By.xpath("//span[text()='Terms and Conditions']"));		
		act.moveToElement(refclick1).perform();


		Thread.sleep(3000);
		WebElement ProceedtoPay =driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-un1frt r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73']"));		
		act.moveToElement(ProceedtoPay).click().perform();

		Thread.sleep(3000);
		String Source2=driver.getPageSource();

		if(Source2.contains("Please enter a valid card")) {
			System.out.println("Booking :Payment Sucessful");
		}else {
			System.out.println("Booking :Payment failed");
		}


	}
}


/*
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.ProjectSpecifications;

public class OneWayTripPage extends ProjectSpecifications {
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

	public OneWayTripPage() {
		PageFactory.initElements(driver, this);
	}

	public void OneWayRadBtn() {
		OneWay.click();
	}
	public void DepatureDate() {
		
		date.click();
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

}
*/

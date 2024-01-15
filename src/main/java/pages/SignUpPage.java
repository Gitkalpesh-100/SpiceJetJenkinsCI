package pages;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import base.ProjectSpecifications;

public class SignUpPage extends ProjectSpecifications {

	@FindBy(xpath = "//select[@class = 'form-control form-select ']")
	WebElement selectTitle;

	@FindBy(xpath = "//*[@id='first_name']")
	WebElement firstnameandmiddlename;

	@FindBy(xpath = "//input[@id= 'last_name']")
	WebElement lastname;

	@FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div[2]/div[2]/div/div[1]/div[3]/div[1]/select")
	WebElement Country;

	@FindBy(xpath = "//input[@id='dobDate']")
	WebElement DoB;

	@FindBy(xpath = "(//input[@type='tel'])")
	WebElement mob;

	@FindBy(xpath = "(//input[@id='email_id'])")
	WebElement email;

	@FindBy(xpath = "//input[@id='new-password']")
	WebElement pswd;

	@FindBy(xpath = "//input[@id='c-password']")
	WebElement cnfpswd;

	@FindBy(xpath = "//input[@id='defaultCheck1']")
	WebElement checkbox1;

	@FindBy(xpath = "//button[contains(text(), 'Submit')]")
	WebElement Submit1;

	public SignUpPage() {

		PageFactory.initElements(driver, this);
	}

	public void selectTitle(String Titlevalue) {
		WindowHandle();
		// click(selectTitle);
		select(Titlevalue, selectTitle);

	}

	public void firstnameandmiddlename(String firstnameandmiddlenamevalue) throws InterruptedException {
		Thread.sleep(10000);
		sendKeys(firstnameandmiddlename, firstnameandmiddlenamevalue);
	}

	public void lastname(String lastnamevalue) throws InterruptedException {
		Thread.sleep(10000);
		sendKeys(lastname, lastnamevalue);
	}

	public void Country(String countryvalue) throws InterruptedException {
		// WindowHandle();
		Thread.sleep(2000);
		select(countryvalue, Country);
	}

	public void DoB(String dobvalue) {
		sendKeys(DoB, dobvalue);
	}

	public void Mob(String Mobvalue) throws InterruptedException {
		Thread.sleep(2000);
		sendKeys(mob, Mobvalue);
	}

	public void email(String emailvalue) throws InterruptedException {
		Thread.sleep(2000);
		sendKeys(Country, emailvalue);
	}

	public void pswd(String Pswdvalue) {
		sendKeys(pswd, Pswdvalue);
	}

	public void cnfpswd(String cpswdvalue) throws InterruptedException {
		Thread.sleep(2000);
		sendKeys(cnfpswd, cpswdvalue);
	}

	public void checkbox1() throws InterruptedException {
		Thread.sleep(2000);
		click(checkbox1);
	}

	public void submit1() {
		click(Submit1);
	}

}

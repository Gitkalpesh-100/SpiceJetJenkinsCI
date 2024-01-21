package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.ProjectSpecifications;

public class SignUpPage extends ProjectSpecifications {
	
	@FindBy(xpath="//input[@id='first_name']")
	WebElement Firstname;

	@FindBy(xpath="//input[@id='last_name']")
	WebElement lastname;

	@FindBy(xpath="//input[@id='dobDate']")
	WebElement dateofbirth;

	@FindBy(xpath="//input[@class=' form-control']")
	WebElement mobile;

	@FindBy(xpath="//input[@id='email_id']")
	WebElement Nemail;

	@FindBy(xpath="//input[@id='new-password']")
	WebElement password;

	@FindBy(xpath="//input[@id='c-password']")
	WebElement cpassword;

	@FindBy(xpath="//label[text()='I agree to the']")
	WebElement checkbox;

	@FindBy(xpath="//button[text()='Submit']")
	WebElement submit;
	
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}

	public SignUpPage PSignup() {
		Set<String>window=driver.getWindowHandles();
		List<String> list =  new ArrayList<String>(window);
		driver.switchTo().window(list.get(1));
		WebElement drop=driver.findElement(By.xpath("//select[@class='form-control form-select ']"));
		Select opt = new Select(drop);
		opt.selectByVisibleText("Mr");
		return this;
	}
	public SignUpPage firstname(String firstnameandmiddlenamevalue) {

		sendKeys(Firstname,firstnameandmiddlenamevalue);
		return this;
	}

	public SignUpPage lastname(String lastnamevalue) {
		sendKeys(lastname,lastnamevalue);
		return this;
	}
	public SignUpPage date(String dobvalue) {
		sendKeys(dateofbirth,dobvalue);
		return this;
	}
	public SignUpPage mobile(String Mobvalue) {
		sendKeys(mobile,Mobvalue);
		return this;
	}
	public SignUpPage email(String emailvalue) {
		sendKeys(Nemail,emailvalue);
		return this;
	}
	public SignUpPage pass(String Pswdvalue) {
		sendKeys(password,Pswdvalue);
		return this;
	}
	public SignUpPage cpass(String cpswdvalue) {
		sendKeys(cpassword,cpswdvalue);
		return this;
	}
	public SignUpPage checkbox() throws InterruptedException {
		Thread.sleep(3000);
		
		Actions bulid = new Actions(driver);
		bulid.moveToElement(checkbox).click();
		return this;
	}
	public SignUpPage submitbutton() throws InterruptedException {
		Actions bulid = new Actions(driver);
		bulid.moveToElement(submit).click();
		Thread.sleep(2000);
		
		
//		String source=driver.getPageSource();
//		
//		if(source.contains("OTP Verification")) {
//			System.out.println("Positive SignupTest Pass");
//		}else {
//			System.out.println("Positive SignupTest Fail");
//		}
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*
	@FindBy(xpath = "//select[@class = 'form-control form-select ']")
	WebElement selectTitle;

	@FindBy(xpath = "//*[@id='first_name']")
	WebElement firstnameandmiddlename;

	@FindBy(xpath = "//input[@id= 'last_name']")
	WebElement lastname;

	@FindBy(xpath = "")
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
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public SignUpPage selectTitle(String Titlevalue) {
		WindowHandle();
		// click(selectTitle);
		select(Titlevalue, selectTitle);
		return this;

	}

	public SignUpPage firstnameandmiddlename(String firstnameandmiddlenamevalue) throws InterruptedException {
		Thread.sleep(2000);
		sendKeys(firstnameandmiddlename, firstnameandmiddlenamevalue);
		return this;
	}

	public SignUpPage lastname(String lastnamevalue) throws InterruptedException {
		Thread.sleep(2000);
		sendKeys(lastname, lastnamevalue);
		return this;
	}

	public SignUpPage Country(String countryvalue) throws InterruptedException {
		// WindowHandle();
		Thread.sleep(2000);
		select(countryvalue, Country);
		return this;
	}

	public SignUpPage DoB(String dobvalue) {
		sendKeys(DoB, dobvalue);
		return this;
	}

	public SignUpPage Mob(String Mobvalue) throws InterruptedException {
		Thread.sleep(2000);
		sendKeys(mob, Mobvalue);
		return this;
	}

	public SignUpPage email(String emailvalue) throws InterruptedException {
		Thread.sleep(2000);
		sendKeys(email, emailvalue);
		return this;
	}

	public SignUpPage pswd(String Pswdvalue) {
		sendKeys(pswd, Pswdvalue);
		return this;
	}

	public SignUpPage cnfpswd(String cpswdvalue) throws InterruptedException {
		Thread.sleep(2000);
		sendKeys(cnfpswd, cpswdvalue);
		return this;
	}

	public SignUpPage checkbox1() throws InterruptedException {
		Thread.sleep(2000);
		click(checkbox1);
		return this;
	}

	public SignUpPage submit1() {
		click(Submit1);
		return this;
	}
	*/

}

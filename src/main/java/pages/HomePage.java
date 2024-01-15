package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecifications;

public class HomePage extends ProjectSpecifications {
	
	@FindBy (xpath = "//div[@class='css-76zvg2 r-jwli3a r-ubezar' and contains(text(), 'Signup')]")
	WebElement signupbutton;
	
	@FindBy (xpath = "//div[@class='css-76zvg2 r-jwli3a r-ubezar' and contains (text(), 'Login')]")
	WebElement loginbutton;
	
	@FindBy (xpath = "//div[text()='One Way']")
	WebElement OneWayRadBtn;
	

	@FindBy (xpath = "//input[@class = 'css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']")
	WebElement From;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void signupbutton() {
		signupbutton.click();
		
		}
	
	public void loginbutton() {
		loginbutton.click();
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
	
	public void OneWayRadBtn() {
		click(OneWayRadBtn);
	}
	
	public void From(String Fromvalue) {
		sendKeys(From, Fromvalue);
	}
	
}

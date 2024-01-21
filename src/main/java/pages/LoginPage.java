package pages;

import org.openqa.grid.web.servlet.handler.WebDriverRequest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecifications;
import net.bytebuddy.asm.Advice.OffsetMapping.ForOrigin.Renderer.ForReturnTypeName;

public class LoginPage extends ProjectSpecifications{
	
	
	@FindBy (xpath = "//div[text()='Email']")
	WebElement emailRadioButton;
	
	@FindBy (xpath = "//input[@type = 'email']")
	WebElement emailTextBox;
	
	@FindBy (xpath = "//input[@type='password']")
	WebElement pswd;
	
	@FindBy (xpath = "//div[@data-testid='login-cta']")
	WebElement loginbtn;
	//div[text()='LOGIN']
	
	public  LoginPage() {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	public  LoginPage Emailradiobutton() {
		click(emailRadioButton);	
	
			return this;
		}
	
	public LoginPage emailfield(String email) {
		sendKeys(emailTextBox, email);
		return this;
	}
	
	
		public  LoginPage loginpassword(String password) {
			sendKeys(pswd,password);
			return this;
		}
		
		public LoginPage loginbutton1()  {
			
			click(loginbtn);
			return this;
		}
		
}

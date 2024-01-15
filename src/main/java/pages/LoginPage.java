package pages;



import org.openqa.grid.web.servlet.handler.WebDriverRequest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecifications;

public class LoginPage extends ProjectSpecifications{
	
	
	@FindBy (xpath = "//div[text()='Email']")
	WebElement emailRadioButton;
	
	@FindBy (xpath = "//input[@type = 'email']")
	WebElement emailTextBox;
	
	@FindBy (xpath = "//input[@type='password']")
	WebElement pswd;
	
	@FindBy (xpath = "(//div[text()='Log In'])[2]")
	WebElement loginbtn;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
    public void radiobtn() {
    	click(emailRadioButton);
    }
	
	public void emailTextBox(String emailTextBoxvalue) {
		sendKeys(emailTextBox,emailTextBoxvalue);
	}
	
	public void pswd(String pswdvalue) throws InterruptedException {
		Thread.sleep(3000);
		sendKeys(pswd, pswdvalue);
	}

	
	public void loginbtn() throws InterruptedException {
		//sendKeys_Tab_Enter(loginbtn);
		//loginbtn.sendKeys(Keys.TAB);
        driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		click(loginbtn);
		//Click_ByJS(loginbtn);
	}
}

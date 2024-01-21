package base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.UtilClass;

public class ProjectSpecifications extends UtilClass{
	
	
	@Parameters("browser")
	@BeforeMethod
	public void launchBrowser(String browser) {
    
		Browserlaunch(browser);

		url("https://www.spicejet.com");
	}
	
	@DataProvider(name = "getData")
	public Object[][] getInputData() throws IOException {
		Object[][] data = readExcel(sheetName);
		return data;	
	}
	
	
	@AfterMethod
	public void closeBrowser(){
		driver.close();
	}

}

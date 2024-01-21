package utils;//spicejet

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.security.PublicKey;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;
import javax.net.ssl.HttpsURLConnection;
import javax.print.attribute.standard.Destination;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.github.dockerjava.api.model.Link;

public class UtilClass<HttpURLConnection> {

	public static WebDriver driver;
	public String sheetName;

	public void Browserlaunch(String browser) {

		if (browser.equalsIgnoreCase("Chrome")) {

			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Edge")) {

			driver = new EdgeDriver();

		} else if (browser.equalsIgnoreCase("Chrome-Headless")) {

			//HeadlessChrome();
		}
		else {
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}

	public void url(String url) {
		driver.get(url);

	}

	
	public void sendKeys(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public void sendKeys_Tab_Enter(WebElement element) throws InterruptedException {
		element.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		element.sendKeys(Keys.ENTER);
	}

	public void closeBrowser() {
		driver.close();
	}
	
	
	public static void WindowHandle() {
	
		String parentwindow = driver.getWindowHandle();
		
	    Set<String> windowHandles = driver.getWindowHandles();
	    for (String childwindow : windowHandles) {
	    	if(!childwindow.equals(parentwindow)) {
	    		driver.switchTo().window(childwindow);		
	    	}
	    }	    
	}
	
	
	public void select(String elementvalue, WebElement selectTitle) {
        Select select = new Select(selectTitle);
        selectTitle.click();
        select.selectByVisibleText(elementvalue);	
	}	
	
	/*
	public void Country(String countryvalue, WebElement selectCountry) {
		Select Country = new Select (selectCountry);
		Country.selectByValue(countryvalue);
	}
	*/
	
	public void click(WebElement element) {
		Explicit_Wait(element);
		element.click();
	}
	
	public void Explicit_Wait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static String CaptureScreen() throws IOException {

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destinationfile = new File("src/screenshots/" + System.currentTimeMillis() + ".png");
		String absolutepath_screen = destinationfile.getAbsolutePath();

		FileUtils.copyFile(srcFile, destinationfile);

		System.out.println("Screenshot captured at: " + absolutepath_screen);

		return absolutepath_screen;
	}

	public void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}	
	public void Click_ByJS(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ele);
	}
	
	
	public static String getTime() {
		DateFormat dateFormat = null;
		Date date = null;
		try {
			dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		}
		catch (Exception e) {
		   System.out.println("Error in getdateandtime:" + e.getMessage());
		}
		return dateFormat.format(date);
		
	}
	
	
	
	public Object[][] readExcel(String sheetName) throws IOException {
		
		XSSFWorkbook book = new XSSFWorkbook("./data/Spicejet_New.xlsx");
		XSSFSheet sheet = book.getSheet(sheetName);
		int rowcount= sheet.getLastRowNum();

		int colcount = sheet.getRow(0).getLastCellNum();


		Object[][] data= new Object[rowcount][colcount];


		for(int i=1;i<=rowcount;i++) {
			XSSFRow row = sheet.getRow(i);

			for(int j=0;j<colcount;j++) {
				XSSFCell cell= row.getCell(j);


				data[i-1][j] = cell.getStringCellValue();
				System.out.println(cell.getStringCellValue());
			}        	
		}
		book.close();
		return data;       
	}	
	 
		
		/*
		  try (XSSFWorkbook book = new XSSFWorkbook("./data/DataSheet.xlsx")) {
	XSSFSheet sheet = book.getSheet(sheetName);
    int rowCount = sheet.getLastRowNum() + 1; // Include header row

    int colCount = sheet.getRow(0).getLastCellNum();

    Object[][] data = new Object[rowCount - 1][colCount];

    for (int i = 1; i < rowCount; i++) {
        XSSFRow row = sheet.getRow(i);

        for (int j = 0; j < colCount; j++) {
            XSSFCell cell = row.getCell(j);

            if (cell != null) {
                switch (cell.getCellType()) {
                    case STRING:
                        data[i - 1][j] = cell.getStringCellValue();
                        break;
                    case NUMERIC:
                        data[i - 1][j] = cell.getNumericCellValue();
                        break;
                    // Handle other cell types if necessary
                    default:
                        data[i - 1][j] = null; // or handle accordingly
                        break;
                }
            } else {
                data[i - 1][j] = null; // Handle null cells if necessary
            }

            System.out.print(data[i - 1][j] + "\t");
        }
        System.out.println();
    }
    return data;
}
*/

	
	
	
	/*
	public void Calendar{
		
	}
	
	public static void selectDate(String Day, String Month, String Year) {
		String monthYearVal = driver.findElement(By.xpath())
	}
	*/
}

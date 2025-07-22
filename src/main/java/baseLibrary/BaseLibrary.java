package baseLibrary;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import excelutility.ExcelUtility;
import propertyUtility.PropertyUtility;
import waitutility.WaitUtility;

public class BaseLibrary implements ExcelUtility, WaitUtility, PropertyUtility{
	public static WebDriver driver=null;
	
	public static  void launch() {
		System.out.println("testing NHAI");
//		String path="C:\\Users\\techy\\eclipse-workspace\\selenium\\src\\test\\resources\\webdriver\\chromedriver.exe";
//		System.setProperty("webdriver.chrome.driver", path);

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\techy\\eclipse-workspace\\selenium\\src\\test\\resources\\webdriver\\chromedriver.exe");
		driver=new ChromeDriver();//driver initialization
//		driver.get("https://appsavy.com/coreapps");
		driver.get("https://www.testingbaba.com/old/");
		driver.manage().window().maximize();
		
	} 
	@Override
	  public void visibletextwait(WebElement element, String text) {
	        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	        wait.until(ExpectedConditions.visibilityOf(element));
	        element.clear();
	        element.sendKeys(text);
	    }
	@Override
	public String getreadData(String path, int sheetNo, int row, int col) {
		String value="";
		try {
			FileInputStream fis=new FileInputStream(path);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.getSheetAt(sheetNo);
			value=sheet.getRow(row).getCell(col).getStringCellValue();		
			
		}catch(Exception e){
			
		}
		return value;
	}
	@Override
	public String getReadData(String key) throws FileNotFoundException {
		String path="C:\\Users\\techy\\eclipse-workspace\\selenium\\testData\\config.properties";
		FileInputStream fis=new FileInputStream(path);
		Properties prop=new Properties();
		String val = "";
		try {
			prop.load(fis);
			 val=prop.getProperty(key);
		} catch (IOException e) {
			System.out.println("issue in get read data"+ e);
			e.printStackTrace();
		}
		
		return val;
	}
}

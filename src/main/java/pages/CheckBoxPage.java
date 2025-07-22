package pages;

import java.io.FileNotFoundException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import baseLibrary.BaseLibrary;

public class CheckBoxPage extends BaseLibrary {
	public CheckBoxPage() {
		PageFactory.initElements(driver,this);
	}
	String path="C:\\Users\\techy\\eclipse-workspace\\selenium\\src\\main\\java\\excelutility\\excelData.xlsx";
	@FindBy(xpath="//*[text()='×']")
	 private WebElement close;
	@FindBy(xpath = "//a[@href='newdemo.html']")
	private WebElement practice;
	@FindBy(xpath = "//*[@data-target='#elements']")
	private WebElement element;
//	@FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div[1]/div[2]/div/div/a[2]")
	@FindBy(xpath = "//a[@href='#tab_2']")
	private WebElement checkBox;
	@FindBy(xpath = "//*[@src='Checkbox.html']")
	private WebElement iframlocator;
	
	
		@FindBy(xpath = "//*[@id='myCheck']")
		private WebElement chkbxMobile;
		@FindBy(xpath="//*[@id='text']")
		private WebElement mobileText;
		@FindBy(xpath = "//input[@id='mylaptop']")
		private WebElement chkbxLaptop;
		@FindBy(xpath="//h6[@id='text1']")
		private WebElement laptopText;
		@FindBy(xpath = "//input[@id='mydesktop']")
		private WebElement chkbxDesktop;
		@FindBy(xpath = "//input[@id='mydesktop']")
		private WebElement desktopText;
		public void clickOnchkBxDesktop() {
			driver.switchTo().frame(iframlocator);
			chkbxDesktop.click();
			driver.switchTo().defaultContent();
		}
		
		public void clickOnChkBxLaptop() {
			driver.switchTo().frame(iframlocator);
			chkbxLaptop.click();
			driver.switchTo().defaultContent();
		}
	public void clickOnMobileCheckBox() {
		driver.switchTo().frame(iframlocator);
		chkbxMobile.click();
		driver.switchTo().defaultContent();//this should be in validate method because we want to enter once in the ifram do complete all work inside it
	}	
	
	
	
	public void clickOnelement() {
		element.click();
	}
	public void clickOnPractive() {
		practice.click();
	}
	public void clickOnX() {
		close.click();	
	}
	public void clickOnCheckMobileBox() {
		checkBox.click();

	}
	
	public void validateMobile() throws FileNotFoundException, InterruptedException {
	SoftAssert softassert=new SoftAssert();
	String expected=getReadData("Mobile");
	driver.switchTo().frame(iframlocator);
	Thread.sleep(2000);
	String actual=mobileText.getText();	
	driver.switchTo().defaultContent();
	softassert.assertEquals(actual, expected);
	softassert.assertAll();
	
	}	
	
	
	
	public void validateLatop() throws FileNotFoundException {
		SoftAssert sassert=new SoftAssert();
		String expected=getReadData("Laptop");
		driver.switchTo().frame(iframlocator);
		String actual=laptopText.getText();
		driver.switchTo().defaultContent();
		sassert.assertEquals(actual,expected);
		sassert.assertAll();
		
		
	}
		
	
	
	
	
	public void validateDesktop() throws FileNotFoundException {
		SoftAssert sassert=new SoftAssert();
			String expected=getReadData("Desktop");
		driver.switchTo().frame(iframlocator);
		String actual=desktopText.getText();
		driver.switchTo().defaultContent();
		sassert.assertEquals(actual	, expected);
	}
}

package pages;
import org.testng.asserts.SoftAssert;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class TextBoxPage extends BaseLibrary {
	public TextBoxPage() {
		PageFactory.initElements(driver,this);
	}
	String path="C:\\Users\\techy\\eclipse-workspace\\selenium\\src\\main\\java\\excelutility\\excelData.xlsx";
	@FindBy(xpath="//*[text()='×']")
	 private WebElement close;
	@FindBy(xpath = "//a[@href='newdemo.html']")
	private WebElement practice;
	@FindBy(xpath = "//*[@data-target='#elements']")
	private WebElement element;
	@FindBy(xpath = "//a[text()='text box']")
	private WebElement textbox;
	@FindBy(xpath = "//*[@id='fullname1']")
	private WebElement NameInpt;
	@FindBy(xpath = "//*[@id='fullemail1']")
	private WebElement fullEmail;
	@FindBy(xpath="//*[@id='fulladdresh1']")
	private WebElement currAddress;
	@FindBy(xpath = "//*[@id='paddresh1']")
	private WebElement P_address;
	@FindBy(xpath = "//input[@value='Submit']")
	private WebElement submtBtn;
	@FindBy(xpath = "//div[@id='tab_1']/div/div[2]/label")//it creates a list of all label attribute
	private List<WebElement> list;
	public void clickOnelement() {
		element.click();
	}
	public void clickOnPractive() {
		practice.click();
	}
	public void clickOnX() {

		close.click();
		

	}
	public void fillDetails() {
		NameInpt.sendKeys(getreadData(path, 0, 1, 0));
		P_address.sendKeys(getreadData(path, 0, 1, 3));
		currAddress.sendKeys(getreadData(path, 0, 1, 2));
		fullEmail.sendKeys(getreadData(path, 0, 1, 1));
	}

	public void clickOnSubmitBtn() {
		submtBtn.click();
	}
	

	public void clickOntextbox() {
		textbox.click();
	}
	public void validation() {
		System.out.println("hi................."+list.get(0));
		
		SoftAssert softassert=new SoftAssert();
		
		ArrayList<String> expected=new ArrayList<>();//to store data from excel sheet
		ArrayList<String> actual=new ArrayList<>();//to store data from web page
		
		for(int i=0;i<4;i++) {
			expected.add(getreadData(path, 0, 1, i)) ;			
		}
		
		for(int j=1;j<list.size();j=j+2) {
			String val=list.get(j).getText();
			actual.add(val);
		}
		for(int k=0;k<expected.size();k++) {
			softassert.assertEquals(actual.get(k), expected.get(k));
		}
//		System.out.println("hi.........."+actual);
		softassert.assertAll();
		
	}
	
	
	
}

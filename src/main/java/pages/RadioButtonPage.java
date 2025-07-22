package pages;

import java.io.FileNotFoundException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import baseLibrary.BaseLibrary;

public class RadioButtonPage extends BaseLibrary{
	public RadioButtonPage(){
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//*[text()='×']")
	 private WebElement close;
	@FindBy(xpath = "//a[@href='newdemo.html']")
	private WebElement practice;
	@FindBy(xpath = "//*[@data-target='#elements']")
	private WebElement element;
	

	public void clickOnelement() {
		element.click();
	}
	public void clickOnPractive() {
		practice.click();
	}
	public void clickOnX() {

		close.click();	

	}
	@FindBy(xpath = "//a[@href='#tab_3']")
	private WebElement radioBtn;
	@FindBy(xpath="//input[@id='yes']")
	private WebElement yesOption;
	@FindBy(xpath="//p[@id='radio-content']")
	private WebElement yesText;
	public void clickOnRadioBtn() throws InterruptedException  {
		Thread.sleep(2000);
		radioBtn.click();
//		yesOption.click();
		
		
//		System.out.println(expected);
	}
	public void clickOnyesOption() {
		yesOption.click();
	}
	public void validate() throws FileNotFoundException, InterruptedException {
		SoftAssert sassert=new SoftAssert();
		String expected=getReadData("yes");
		Thread.sleep(1000);
		String actual=yesText.getText();
		sassert.assertEquals(expected, actual);
		sassert.assertAll();
	}
	
}

package pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseLibrary.BaseLibrary;

public class WebTablePage extends BaseLibrary{
	public WebTablePage(){
		PageFactory.initElements(driver,this);
	}
	String path="C:\\Users\\techy\\eclipse-workspace\\selenium\\src\\main\\java\\excelutility\\excelData.xlsx";

	@FindBy(xpath="//*[text()='×']")
	 private WebElement close;
	@FindBy(xpath = "//a[@href='newdemo.html']")
	private WebElement practice;
	@FindBy(xpath = "//*[@data-target='#elements']")
	private WebElement element;
	@FindBy(xpath = "//input[@name='name'][@class='form-control'][@title='Must contain Alphabet only(Min 3 Letters)']")					
	private WebElement nameInptBox;
	@FindBy(xpath = "//input[@name='email'][@class='form-control'][@title='eg name@gmail.com']")
	private WebElement emailInptBox;
	@FindBy(xpath = "//*[@src='Webtable.html']")
	private WebElement iframeEle;//iframe at webTablebox
	@FindBy(xpath = "//a[@href='#tab_4']")
	private WebElement webtable;
	@FindBy(xpath = "//*[text()='Save']")
	private WebElement saveBtn;
	
	public void clickOnWebtable() {
		webtable.click();
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
	
	public void fillFillDetails() throws InterruptedException  {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(iframeEle));
		driver.switchTo().frame(iframeEle);
		wait.until(ExpectedConditions.visibilityOf(nameInptBox));
		for(int i=0;i<3;i++) {
			nameInptBox.sendKeys(getreadData(path, 0, 1, i));
			System.out.println("testing2 ");
			wait.until(ExpectedConditions.visibilityOf(emailInptBox));
			emailInptBox.sendKeys(getreadData(path, 0, 1, i));
		saveBtn.click();
		}
		driver.switchTo().defaultContent();
	}

}

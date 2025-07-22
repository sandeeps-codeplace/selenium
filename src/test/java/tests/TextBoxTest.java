package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.TextBoxPage;

	public class TextBoxTest extends BaseLibrary {
	TextBoxPage ob;
	@BeforeTest
	public void launchURL() {
	launch();
	ob= new TextBoxPage();
	}
	@Test(priority = 0)
	public void clickOnClose() throws InterruptedException {
		Thread.sleep(1000);		
		ob.clickOnX();
		ob.clickOnPractive();
		ob.clickOnelement();
	}
	
	@Test(priority = 1)
	public void ClickOnTxtBox() throws InterruptedException {
		Thread.sleep(1000);
		ob.clickOntextbox();
	}
	@Test(priority = 2)
	public void FillDetail() throws InterruptedException {
		Thread.sleep(1000);
		ob.fillDetails();
	}

	@Test(priority = 3)
	public void clickOnSubmitBtn() {
		ob.clickOnSubmitBtn();
	}
	
	@Test(priority = 4)
	public void validate() {
		ob.validation();
	}
	
	@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}

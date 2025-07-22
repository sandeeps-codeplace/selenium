package tests;

import java.io.FileNotFoundException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.RadioButtonPage;

public class RadioButtonTest extends BaseLibrary{
	RadioButtonPage ob=null;
	@BeforeTest
	public void launchURL() {
	launch();
	ob= new RadioButtonPage();
	}
	@Test(priority = 0)
	public void clickOnClose() throws InterruptedException {
		Thread.sleep(1000);		
		ob.clickOnX();
		ob.clickOnPractive();
		ob.clickOnelement();
	}
	@Test(priority = 1)
	public void clickToRadioBtn() throws FileNotFoundException, InterruptedException {
		ob.clickOnRadioBtn();
	}
	@Test(priority = 2)
	public void clickToYesOption() {
		ob.clickOnyesOption();
	}
	@Test(priority = 3)
	public void validation() throws FileNotFoundException, InterruptedException {
		ob.validate();
	}

}

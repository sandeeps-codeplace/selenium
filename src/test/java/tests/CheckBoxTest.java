package tests;

import java.io.FileNotFoundException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.CheckBoxPage;

public class CheckBoxTest extends BaseLibrary {
	CheckBoxPage ob;
	@BeforeTest
	public void launchURL() {
	launch();
	ob= new CheckBoxPage();
	}
	@Test(priority = 0)
	public void clickOnClose() throws InterruptedException {
		Thread.sleep(1000);		
		ob.clickOnX();
		ob.clickOnPractive();
		ob.clickOnelement();
	}
	@Test(priority = 1)
	public void clicickToCheckMobileBox() throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement tab2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@href, '#tab_2')]")));
//		tab2.click();
	Thread.sleep(1000);

		ob.clickOnCheckMobileBox();
	}
	@Test(priority = 2)
	public void clickTOMobileChkBx() {		
		ob.clickOnMobileCheckBox();		
	}
	
	@Test(priority = 3)	
	public void clickToMobileValidation() throws FileNotFoundException, InterruptedException {
		ob.validateMobile();
	}
	@Test(priority = 4)
	public void clickToLaptopCheckBox() {
		ob.clickOnChkBxLaptop();
	}
	@Test(priority = 5)
	public void clickToLaptopValidation() throws FileNotFoundException {
		ob.validateLatop();
	}
	@Test(priority = 6)
	public void clickToDesktopCheckBox() {
		ob.clickOnchkBxDesktop();
	}
	@Test(priority = 7)
	public void clickToDesktopValidation() throws FileNotFoundException {
		ob.validateDesktop();
	}
	
//	@AfterTest
	public void teardown() {
		driver.close();
	}

}

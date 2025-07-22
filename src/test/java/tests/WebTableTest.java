package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import baseLibrary.BaseLibrary;
import pages.WebTablePage;

public class WebTableTest extends BaseLibrary{
	 WebTablePage ob=null;
	@BeforeTest
	public void launchURL() {
	launch();
	ob= new WebTablePage();
	}
	@Test(priority = 0)
	public void clickOnClose() throws InterruptedException {
		Thread.sleep(1000);		
		ob.clickOnX();
		ob.clickOnPractive();
		ob.clickOnelement();
	}
	@Test(priority = 1)
	public void clickToWebtable() throws InterruptedException {
		Thread.sleep(1000);
		ob.clickOnWebtable();
	}
	@Test(priority = 2)
	public  void fillData() throws InterruptedException {
		System.out.println("testing ");
		ob.fillFillDetails();
		
	}


}

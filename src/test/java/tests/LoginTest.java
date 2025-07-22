package tests;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.LoginPage;

public class LoginTest extends BaseLibrary{
	
	LoginPage ob;
	@BeforeTest
	public void launchUrl() {
		launch();//always launch browser 
		driver.manage().window().maximize();
		ob=new LoginPage( );//this should be under any annotation		
		
	}
	@Test(priority = 0)
	public void ClickonClose() throws InterruptedException {
		System.out.println("testing");
		Thread.sleep(1000);		
		ob.clickOnX();
		ob.clickOnPractive();
		ob.clickOnelement();
	}
	
	@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	

}

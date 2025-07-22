package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
// pom is  a design pattern used to creat 
//i) page class--page class is action class -here we will define all the action method that can be called in the action class we will define all the locator by useing @findbby annotaiton

//ii) test class--

import baseLibrary.BaseLibrary;

public class LoginPage extends BaseLibrary {//extending baseLibrary because want the access of 'driver'--> whydriver needed ? because we want we want to use is in constructor
//WebDriver driver;
	public   LoginPage() {		//constrcutor-1) it is a special type of method. 2) constrctor name and class name should be same . 3)constructor is aotomatically invoked when we creat an object of the class, 4) constructor is used to initialize the memory at the time of compile time 
		PageFactory.initElements(driver, this);//pagefactory is a class used to initialize memory of the current object ie @FindBy annotation ke under sare variable ko memory allocation krega
//		we need memory at compile time thats why constructor is needed 
		//pagefactory is used to initilize the memory of the webelement of the current page else null pointer Exception error will be produced

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
}

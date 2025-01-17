package packageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	//Constructor 
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	//Locators
	@FindBy(xpath = "//*[@title='My Account']")
	WebElement link_myAccount;
	
	@FindBy(xpath = "//a[text()='Register']")
	WebElement link_register;
	
	@FindBy(xpath = "//a[text()='Login']")
	WebElement link_login;
	
	
	
	
	
	//Actions
	public void clickOnMyAccount() {
		link_myAccount.click();
	}
		
	public void clickOnRegister() {
		link_register.click();
	}
	
	public void clickOnLogin() {
		link_login.click();
	}
	
	
}

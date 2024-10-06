package packageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
	
	public RegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@name='firstname']")
	WebElement txtFirstname;

	@FindBy(xpath = "//input[@name='lastname']")
	WebElement txtLastname;
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement txtEmail;
	
	@FindBy(xpath = "//input[@name='telephone']")
	WebElement txtTelephone;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement txtPassword;
	
	@FindBy(xpath = "//input[@name='confirm']")
	WebElement txtComfirmPassword;
	
	@FindBy(xpath = "//input[@name='agree']")
	WebElement chkBoxPrivacy;
	
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement btnContinue;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgComfirmation;
	
	//Action Methods
	public void setFristName(String fname) {
		txtFirstname.sendKeys(fname);
	}
	
	public void setLastName(String lname) {
		txtLastname.sendKeys(lname);
	}
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void setTelephone(String tel) {
		txtTelephone.sendKeys(tel);
	}
	
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	
	public void setComfirmPassword(String pwd) {
		txtComfirmPassword.sendKeys(pwd);
	}
	
	public void setPrivacyPolicy() {
		chkBoxPrivacy.click();
	}
	
	public void clickContinue() {
		//option 1
		btnContinue.click();
//		//option 2
//		btnContinue.submit();
//		//option 3
//		Actions act = new Actions(driver);
//		act.moveToElement(btnContinue).click().perform();
//		//option 4
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", btnContinue);
//		//option 5
//		btnContinue.sendKeys(Keys.RETURN);
//		//option 6
//		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
	}
	
	public String getComfirmationMsg() {
		try {
			return msgComfirmation.getText();
		} catch (Exception e) {
			return e.getMessage();
		}
		
	}
	
	
	
}

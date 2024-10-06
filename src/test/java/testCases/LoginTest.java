package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import packageObjects.HomePage;
import packageObjects.LoginPage;
import packageObjects.MyAccountPage;
import testBase.BaseClass;

public class LoginTest extends BaseClass {

	@Test
	public void validateLogin() {
		logger.info("-------Strating Login Test-------");
		logger.debug("Capturing application debug logs...");

		try {
			// HomePage
			HomePage homePage = new HomePage(driver);
			homePage.clickOnMyAccount();
			homePage.clickOnLogin();
			logger.info("Clicked on Login link under myAccount...");

			// LoginPage
			LoginPage loginPage = new LoginPage(driver);
			logger.info("-------Adding credentials-------");
			loginPage.setEmail(prop.getProperty("email"));
			loginPage.setPassword(prop.getProperty("password"));
			loginPage.clickLogin();
			logger.info("Clicked on login button...");

			// MyAccount
			MyAccountPage myAcctPage = new MyAccountPage(driver);
			boolean displayStatusMyAcctPage = myAcctPage.isMyAccountPageExists();
			Assert.assertEquals(displayStatusMyAcctPage, true, "Login failed");
		} catch (Exception e) {
			Assert.fail();
		} finally {
			logger.info("-------Login Test completed-------");
		}

	}

}

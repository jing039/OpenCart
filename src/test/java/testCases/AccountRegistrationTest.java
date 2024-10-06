package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import packageObjects.HomePage;
import packageObjects.RegistrationPage;
import testBase.BaseClass;

public class AccountRegistrationTest extends BaseClass {

	@Test
	public void validationRegistration() {
		logger.info("---------Starting Account Registration Test---------");
		logger.debug("---------This is a debug log message---------");
		try {
			// Create an object of HomePage
			HomePage homePage = new HomePage(driver);
			logger.info("Clicked on MyAccount");
			homePage.clickOnMyAccount();
			homePage.clickOnRegister();
			logger.info("Clicked on Register link");

			// Create an object of registration
			RegistrationPage regPage = new RegistrationPage(driver);

			logger.info("Providing customer information");
			regPage.setFristName(randomString().toUpperCase());
			regPage.setLastName(randomString().toUpperCase());
			regPage.setEmail(randomString() + "@mail.com");
			regPage.setTelephone(randomNumber());

			String pwd = randomAlphaNumeric();
			regPage.setPassword(pwd);
			regPage.setComfirmPassword(pwd);

			regPage.setPrivacyPolicy();
			regPage.clickContinue();
			logger.info("Validating expected message");
			String confmsg = regPage.getComfirmationMsg();
			Assert.assertEquals(confmsg, "Your Account Has Been Created!");
			logger.info("Account Registration Test PASSED");
		} catch (Exception e) {

		} finally {
			logger.info("---------Finished Account Registration Testing3---------");
		}
	}

}

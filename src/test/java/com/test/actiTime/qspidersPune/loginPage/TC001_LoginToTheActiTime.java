package com.test.actiTime.qspidersPune.loginPage;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.actiTime.qspidersPune.testBase.TestBase;
import com.test.actiTime.qspidersPune.uiActions.HomePage;

public class TC001_LoginToTheActiTime extends TestBase {
	public static final Logger log = Logger.getLogger(TC001_LoginToTheActiTime.class.getName());
	HomePage homepage;

	@BeforeTest
	public void setUp() {
		init();
	}

	@Test
	public void verifyLoginWithvalidCredentials() {
		log.info("*********************Starting verifyLoginWithvalidCredentials*******************");
		homepage = new HomePage(driver);
		homepage.LoginToActiTime("admin", "manager");
		Assert.assertEquals(homepage.getLoginSuccessfulMessage(), "Enter Time-Track");
		log.info("*********************Ending verifyLoginWithvalidCredentials*******************");
	}

	@AfterClass
	public void endTest() {
		 driver.close();

	}

}

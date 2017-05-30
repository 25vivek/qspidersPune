package com.test.actiTime.qspidersPune.uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//my name is vivek
	//hello world got to hell
	// i live in bangalore
	public static final Logger log = Logger.getLogger(HomePage.class.getName());
	WebDriver driver;

	@FindBy(xpath = "//input[@id='username']")
	WebElement userName;

	@FindBy(xpath = "//input[@name='pwd']")
	WebElement passWord;

	@FindBy(xpath = "//a[@id='loginButton']")
	WebElement loginButton;

	@FindBy(xpath = "//td[contains(text(),'Enter Time-Track')]")
	WebElement loginMessage;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void LoginToActiTime(String username, String password) {
		keyDown(username, Keys.SHIFT);
		userName.sendKeys(username);
		log.info("Entered user name: " +username.toString());
		passWord.sendKeys(password);
		log.info("Entered password: " +password.toString());
		loginButton.click();
		log.info("Clicked on the Login button");
	}

	public String getLoginSuccessfulMessage() {
		log.info("Successful Login message: " +loginMessage.getText());
		return loginMessage.getText();
	}

}

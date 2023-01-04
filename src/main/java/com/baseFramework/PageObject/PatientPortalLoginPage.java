package com.baseFramework.PageObject;

import org.openqa.selenium.WebDriver;

import com.baseFramework.Lib.AppLibrary;

public class PatientPortalLoginPage {

	private AppLibrary appLibrary;
	private WebDriver driver;
	public String emailInput = "xpath:-://input[@placeholder='Enter your email']";
	public String passwordInput = "xpath:-://input[@placeholder='Enter your password']";
	public String hello = "xpath:-://h3[text()='Hey, good to see you again!']";
	public String signIn = "xpath:-://h3[text()='Sign in']";
	public String email = "xpath:-://label[text()='Email']";
	public String password = "xpath:-://label[text()='Password']";
	public String rememberMeLabel = "xpath:-://span[text()='Remember me']";
	public String logInButton = "xpath:-://button[contains(@class,'submit-btn-disabled')]";
	public String rememberMeCheckBox = "xpath:-://span[@class='ant-checkbox-inner']";
	public String logInButtonGreen = "xpath:-://button[contains(@class,'submit-btn')]";
	public String invalidCred = "xpath:-://span[@class='text-danger fs-5']";
	public String greet = "xpath:-://h3[text()='Hey, good to see you again!']";

	public PatientPortalLoginPage(AppLibrary appLibrary) {
		super();
		this.appLibrary = appLibrary;
		this.driver = appLibrary.getCurrentDriverInstance();
	}

	public void verifyLoginPageUi() throws Exception {
		AppLibrary.verifyElement(driver, emailInput, true, 0);
		AppLibrary.verifyElement(driver, passwordInput, true, 0);
		AppLibrary.verifyElement(driver, hello, true, 0);
		AppLibrary.verifyElement(driver, signIn, true, 0);
		AppLibrary.verifyElement(driver, email, true, 0);
		AppLibrary.verifyElement(driver, password, true, 0);
		AppLibrary.verifyElement(driver, rememberMeLabel, true, 0);
		AppLibrary.verifyElement(driver, logInButton, true, 0);
		AppLibrary.verifyElement(driver, rememberMeCheckBox, true, 0);

	}

	public PatientPortalDashBoard fillLoginDetails(String email, String pass) throws Exception {
		AppLibrary.enterText(driver, emailInput, email);
		AppLibrary.enterText(driver, passwordInput, pass);
		AppLibrary.clickElement(driver, logInButtonGreen);
		return new PatientPortalDashBoard(appLibrary);

	}

}

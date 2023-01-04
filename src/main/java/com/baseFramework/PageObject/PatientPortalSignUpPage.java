package com.baseFramework.PageObject;

import org.openqa.selenium.WebDriver;

import com.baseFramework.Lib.AppLibrary;

public class PatientPortalSignUpPage {

	private AppLibrary appLibrary;
	private WebDriver driver;

	public String searchBox = "xpath:-://input[@id='search']";
	public String mailinatorMail = "xpath:-://td[@class='ng-binding']";
	public String goButton = "xpath:-://button[text()='GO']";
	public String clickHereLink = "xpath:-://a[text()='Click Here']";
	public String password = "xpath:-://input[@placeholder='Enter your new password']";
	public String confirmPassword = "xpath:-://input[@placeholder='Enter your password again']";
	public String checkBox = "xpath:-://input[@id='remember']";
	public String registerButton = "xpath:-://button[@class='submit-btn green-bg-btn']";
	public String setting = "xpath:-://span[text()='Settings']";
	public String emailVerification = "xpath:-://input[@id='email']";

	public PatientPortalSignUpPage(AppLibrary appLibrary) {
		super();
		this.appLibrary = appLibrary;
		this.driver = appLibrary.getCurrentDriverInstance();
	}

	public void verifyPatientPortalSignUpPageUi() throws Exception {
		AppLibrary.verifyElement(driver, searchBox, true, 0);
		AppLibrary.verifyElement(driver, mailinatorMail, true, 0);
		AppLibrary.verifyElement(driver, goButton, true, 0);
		AppLibrary.verifyElement(driver, clickHereLink, true, 0);
		AppLibrary.verifyElement(driver, password, true, 0);
		AppLibrary.verifyElement(driver, confirmPassword, true, 0);
		AppLibrary.verifyElement(driver, checkBox, true, 0);
		AppLibrary.verifyElement(driver, registerButton, true, 0);
		AppLibrary.verifyElement(driver, setting, true, 0);
		AppLibrary.verifyElement(driver, emailVerification, true, 0);
	}

	public PatientPortalSignUpPage emailVerification(String email) throws Exception {
		appLibrary.launchApp("https://www.mailinator.com");
		AppLibrary.enterText(driver, searchBox, email);
		AppLibrary.clickElement(driver, goButton);
		AppLibrary.clickElement(driver, mailinatorMail);
		AppLibrary.switchToFrame(driver, "html_msg_body");
		AppLibrary.scrollIframe(driver);
		AppLibrary.clickElement(driver, clickHereLink);
		AppLibrary.SwitchWindow(driver);
		AppLibrary.enterText(driver, password, "Test@123");
		AppLibrary.enterText(driver, confirmPassword, "Test@123");
		AppLibrary.clickElement(driver, checkBox);
		AppLibrary.clickElement(driver, registerButton);
		return new PatientPortalSignUpPage(appLibrary);
	}

	public void patientCreationVerification() throws Exception {
		AppLibrary.waitTillElementLoaded(driver, setting);
		AppLibrary.clickElementWithJs(driver, setting);
		AppLibrary.verifyElement(driver, emailVerification, true, 200);
	}

}

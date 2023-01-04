package com.baseFramework.PageObject;

import org.openqa.selenium.WebDriver;

import com.baseFramework.Lib.AppLibrary;

public class PatientCreation {

	private AppLibrary appLibrary;
	private WebDriver driver;
	public String chat = "xpath:-://i[@class='fal fa-comments']";
	public String emailInput = "xpath:-://input[@id='email']";
	public String passwordInput = "xpath:-://input[@id='password']";
	public String signInButton = "xpath:-://button[text()='Sign in']";
	public String patients = "xpath:-://i[@class='fal fa-id-card']";
	public String addNewPatients = "xpath:-://a[@id='add-new-patient']";
	public String appAlert = "xpath:-://i[@class='fa fa-times']";
	public String firstName = "xpath:-://input[@id='fname']";
	public String lastName = "xpath:-://input[@id='lname']";
	public String dob = "xpath:-://input[@id='patient-dob']";
	public String email = "xpath:-://input[@id='email']";
	public String radioButton = "xpath:-://label[@id='send-invite-label']";
	public String selectDropDown = "xpath:-://select[@id='patient-arc-communication-preference']";
	public String selectEmail = "xpath:-://option[text()='Email']";
	public String saveButton = "xpath:-://button[text()='Save']";
	public String okButton = "xpath:-://button[text()='OK']";
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

	public PatientCreation(AppLibrary appLibrary) {
		super();
		this.appLibrary = appLibrary;
		this.driver = appLibrary.getCurrentDriverInstance();
	}

	public void verifyLoginPageUi() throws Exception {
		AppLibrary.verifyElement(driver, emailInput, true, 0);
		AppLibrary.verifyElement(driver, passwordInput, true, 0);
		AppLibrary.verifyElement(driver, patients, true, 0);
		AppLibrary.verifyElement(driver, addNewPatients, true, 0);
		AppLibrary.verifyElement(driver, firstName, true, 0);
		AppLibrary.verifyElement(driver, lastName, true, 0);
		AppLibrary.verifyElement(driver, dob, true, 0);
		AppLibrary.verifyElement(driver, email, true, 0);
		AppLibrary.verifyElement(driver, selectDropDown, true, 0);
		AppLibrary.verifyElement(driver, selectEmail, true, 0);
		AppLibrary.verifyElement(driver, saveButton, true, 0);

	}

	public void fillLoginDetails(String email, String pass) throws Exception {
		AppLibrary.enterText(driver, emailInput, email);
		AppLibrary.enterText(driver, passwordInput, pass);
		AppLibrary.clickElement(driver, signInButton);

	}

	public void clickChat() throws Exception {
		AppLibrary.clickElement(driver, chat);
	}

	public void clickPatients() throws Exception {
		AppLibrary.clickElement(driver, patients);
	}

	public void clickAddNewPatients() throws Exception {
		AppLibrary.sleep(3000);
		AppLibrary.clickElement(driver, addNewPatients);
	}

	public void dismissAlert() throws Exception {
		AppLibrary.clickElement(driver, appAlert);
	}

	public void fillDetails(String fname, String lname, String emailId) throws Exception {

		AppLibrary.enterText(driver, firstName, fname);
		AppLibrary.enterText(driver, lastName, lname);
		AppLibrary.enterText(driver, dob, "01/09/1999");
		AppLibrary.enterText(driver, email, emailId);
		AppLibrary.clickElement(driver, radioButton);
		AppLibrary.clickElement(driver, selectDropDown);
		AppLibrary.clickElement(driver, selectEmail);
		AppLibrary.clickElement(driver, saveButton);
		AppLibrary.clickElement(driver, okButton);
	}

	public void emailVerification(String email) throws Exception {
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
	}

	public void patientCreationVerification() throws Exception {
		AppLibrary.sleep(3000);
		appLibrary.clickElementWithJs(driver, setting);
		AppLibrary.verifyElement(driver, emailVerification, true, 200);
	}

}

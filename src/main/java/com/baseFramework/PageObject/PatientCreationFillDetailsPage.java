package com.baseFramework.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.baseFramework.Lib.AppLibrary;

public class PatientCreationFillDetailsPage {

	private AppLibrary appLibrary;
	private WebDriver driver;

	public String firstName = "xpath:-://input[@id='fname']";
	public String lastName = "xpath:-://input[@id='lname']";
	public String dob = "xpath:-://input[@id='patient-dob']";
	public String email = "xpath:-://input[@id='email']";
	public String radioButton = "xpath:-://label[@id='send-invite-label']";
	public String selectDropDown = "xpath:-://select[@id='patient-arc-communication-preference']";
	public String selectEmail = "xpath:-://option[text()='Email']";
	public String saveButton = "xpath:-://button[text()='Save']";
	public String okButton = "xpath:-://button[text()='OK']";
	public String locationButton = "xpath:-://div[select[@id='locations']]//span[contains(@aria-labelledby,'locations-container')]";
	public String locationOption = "xpath:-://li[text()='Canada']";

	public PatientCreationFillDetailsPage(AppLibrary appLibrary) {
		super();
		this.appLibrary = appLibrary;
		this.driver = appLibrary.getCurrentDriverInstance();
	}

	public void verifyPatientCreationFillDetailsPageUi() throws Exception {

		AppLibrary.verifyElement(driver, firstName, true, 0);
		AppLibrary.verifyElement(driver, lastName, true, 0);
		AppLibrary.verifyElement(driver, dob, true, 0);
		AppLibrary.verifyElement(driver, email, true, 0);
		AppLibrary.verifyElement(driver, selectDropDown, true, 0);
		AppLibrary.verifyElement(driver, selectEmail, true, 0);
		AppLibrary.verifyElement(driver, saveButton, true, 0);
		AppLibrary.verifyElement(driver, okButton, true, 0);
	}

	public PatientPortalSignUpPage fillDetails(String fname, String lname, String emailId) throws Exception {

		AppLibrary.enterText(driver, firstName, fname);
		AppLibrary.enterText(driver, lastName, lname);
		AppLibrary.enterText(driver, dob, "01/09/1999");
		AppLibrary.clickElement(driver, locationButton);
		AppLibrary.clickElement(driver, locationOption);
		AppLibrary.enterText(driver, email, emailId);
		AppLibrary.clickElement(driver, radioButton);
		AppLibrary.clickElement(driver, selectDropDown);
		AppLibrary.clickElement(driver, selectEmail);
		AppLibrary.clickElement(driver, saveButton);
		AppLibrary.clickElement(driver, okButton);
		return new PatientPortalSignUpPage(appLibrary);
	}
}
